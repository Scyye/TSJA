package dev.scyye.thunderstoreapi.api;

import dev.scyye.thunderstoreapi.api.entities.community.Community;
import dev.scyye.thunderstoreapi.api.entities.packages.PackageListing;

import java.util.Arrays;
import java.util.Optional;
import java.util.UUID;

public class TSJAUtils {
	public static Optional<Community> getCommunityByIdentifier(TSJA api, String identifier) {
		return Arrays.stream(api.getCommunities()).toList().stream().filter(community ->
				community.getIdentifier().contains(identifier)).findFirst();
	}

	public static PackageListing[] getPackagesByName(TSJA api, String community, String name) {
		return Arrays.stream(api.getPackages(community, 0)).filter(packageListing ->
				packageListing.getName().toLowerCase().contains(name.toLowerCase())).toArray(PackageListing[]::new);
	}

	public static PackageListing getPackageById(TSJA api, String community, UUID uuid) {
		return Arrays.stream(api.getPackages(community, 0)).filter(packageListing ->
				packageListing.getUniqueId().equals(uuid)).toList().get(0);
	}

	public static PackageListing[] getPackagesByAuthor(TSJA api, String community, String author) {
		return Arrays.stream(api.getPackages(community, 0)).filter(packageListing ->
				packageListing.getOwner().startsWith(author)).toArray(PackageListing[]::new);
	}
}
