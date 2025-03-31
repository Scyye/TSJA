package dev.scyye.thunderstoreapi.cache;

import dev.scyye.thunderstoreapi.api.TSJA;
import dev.scyye.thunderstoreapi.api.entities.packages.PackageListing;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.Consumer;

public class CacheCollector {
	protected static long lastCacheTime = 0;

	protected static HashMap<String, List<PackageListing>> authorPackageCache = new HashMap<>();
	protected static HashMap<String, List<PackageListing>> communityPackageCache = new HashMap<>();
	protected static HashMap<String, List<String>> communityAuthorCache = new HashMap<>();
	protected static List<String> communityCache = new ArrayList<>();

	public static List<String> getCommunities() {
		return communityCache;
	}

	public static List<PackageListing> getPackagesByAuthor(String author) {
		return authorPackageCache.get(author);
	}

	public static List<String> getAuthors() {
		return new ArrayList<>(authorPackageCache.keySet());
	}

	public static List<PackageListing> getPackagesByCommunity(String community) {
		return communityPackageCache.get(community);
	}

	public static List<String> getAuthorsByCommunity(String community) {
		return communityAuthorCache.get(community);
	}

	public static List<PackageListing> getAllPackages() {
		List<PackageListing> packages = new ArrayList<>();
		for (var p : authorPackageCache.values()) {
			packages.addAll(p);
		}
		return packages;
	}

	public static List<PackageListing> queryPackageCache(
			@Nullable String author,
			@Nullable String name,
			@Nullable String community) {
		List<PackageListing> packages = new ArrayList<>();
		for (var p : getAllPackages()) {
			if (author != null && !p.getOwner().contains(author))
				continue;
			if (name != null && !p.getName().contains(name))
				continue;
			if (community != null && !communityPackageCache.get(community).contains(p))
				continue;
			packages.add(p);
		}
		return packages;
	}

	private static boolean firstTime = true;

	public static void init(TSJA tsja, int updateCacheTime, Consumer<TSJA> consumer) {
		Timer timer = new Timer();
		updateCache(tsja);
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("Updating cache");
				System.out.println("Cache update took " + updateCache(tsja) + "ms");
				if (firstTime) {
					firstTime = false;
					consumer.accept(tsja);
				}
			}
		}, updateCacheTime, 2 * 60 * 1000);
	}

	private static long updateCache(TSJA tsja) {
		var time = System.currentTimeMillis();
		authorPackageCache = new HashMap<>();
		communityPackageCache = new HashMap<>();
		communityAuthorCache = new HashMap<>();
		communityCache = new ArrayList<>();


		var communities = tsja.getCommunities();
		for (var community : communities) {
			communityCache.add(community.getIdentifier());
			PackageListing[] packages;
			try {
				packages = tsja.getPackages(community.getIdentifier(), 0);
			} catch (Exception e) {
				continue;
			}
			for (var p : packages) {
				if (!authorPackageCache.containsKey(p.getOwner())) {
					authorPackageCache.put(p.getOwner(), new ArrayList<>());
				}

				if (!authorPackageCache.get(p.getOwner()).contains(p))
					authorPackageCache.get(p.getOwner()).add(p);

				if (!communityPackageCache.containsKey(community.getIdentifier())) {
					communityPackageCache.put(community.getIdentifier(), new ArrayList<>());
				}

				if (!communityPackageCache.get(community.getIdentifier()).contains(p))
					communityPackageCache.get(community.getIdentifier()).add(p);

				if (!communityAuthorCache.containsKey(community.getIdentifier())) {
					communityAuthorCache.put(community.getIdentifier(), new ArrayList<>());
				}

				if (!communityAuthorCache.get(community.getIdentifier()).contains(p.getOwner()))
					communityAuthorCache.get(community.getIdentifier()).add(p.getOwner());
			}
		}
		return System.currentTimeMillis() - time;
	}


}
