package dev.scyye.thunderstoreapi.api;

import com.google.gson.Gson;
import dev.scyye.Client;
import dev.scyye.DataObject;
import dev.scyye.thunderstoreapi.api.entities.RenderMarkdownParams;
import dev.scyye.thunderstoreapi.api.entities.RenderMarkdownResponse;
import dev.scyye.thunderstoreapi.api.entities.community.Community;
import dev.scyye.thunderstoreapi.api.entities.community.WhyTheEverLivingFuckIsThisNotAnObjectLikeSeriouslyThunderstoreWhatTheFuckAreYouDoing;
import dev.scyye.thunderstoreapi.api.entities.packages.PackageDetailViewContent;
import dev.scyye.thunderstoreapi.api.entities.packages.PackageListing;
import dev.scyye.thunderstoreapi.cache.CacheCollector;
import dev.scyye.thunderstoreapi.exceptions.NoSuchCommunityException;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Consumer;

public class TSJA {
    private int updateCacheTime = 172800000;
    private Path cachePath = Path.of("tsja-cache");

    TSJA() {

    }

    TSJA(Consumer<TSJA> success) {
        new CacheCollector(this, updateCacheTime, success);
    }

    @Deprecated
    TSJA(int updateCacheTime) {
        this.updateCacheTime = updateCacheTime;
    }

    @Deprecated
    TSJA(int updateCacheTime, Path cachePath) {
        this.updateCacheTime = updateCacheTime;
        this.cachePath = cachePath;
    }

    TSJA(Path cachePath) {
        this.cachePath = cachePath;
    }
    public PackageListing[] getPackages(String community, int limit) {

        community = community.toLowerCase().replace(" ", "-");
        File cacheDir = Path.of(cachePath.toString(), "package-cache").toFile();
        File cacheFile = Path.of(cacheDir.toString(), santi(community)+"-packages-cache.json").toFile();
        Community[] validCommunities = getCommunities();
        PackageListing[] packages = new PackageListing[0];

        try {
            boolean temp = false;
            for (var com : validCommunities) {
                if (com.getIdentifier().startsWith(community)) {
                    temp = true;
                    break;
                }
            }
            if (!temp)
                throw new NoSuchCommunityException(community);
            if (!cacheDir.exists())
                cacheDir.mkdirs();
            if (!cacheFile.exists())
                cacheFile.createNewFile();

            if (cacheFile.lastModified() < System.currentTimeMillis()-updateCacheTime||cacheFile.lastModified() - System.currentTimeMillis() < 5000) {
               Files.writeString(cacheFile.toPath(), new Gson().toJson(VOne.packageList(community).asArray()));
            }
            packages = new Gson().fromJson(Files.readString(cacheFile.toPath()), PackageListing[].class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Arrays.copyOfRange(packages, 0, limit==0?packages.length-1:limit);
    }

    private static String santi(String s) {
        return s.replaceAll(":", "");
    }

    public Community[] getCommunities() {
        File file = Path.of(cachePath.toString(), "community-cache.json").toFile();

        try {
            if (!file.exists())
                file.createNewFile();

            if (file.lastModified() < System.currentTimeMillis()-172800000||file.lastModified() - System.currentTimeMillis() < 5000)
                return retrieveCommunities(file.toPath());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return new Community[0];
    }

    public Community[] retrieveCommunities(Path cachePath) throws IOException {
        Client client = new Client("https://thunderstore.io/api/experimental/");
        DataObject response = client.get("community/", null);

        Files.writeString(cachePath, response.toJson());

        return new Gson().fromJson(Files.readString(cachePath),
                WhyTheEverLivingFuckIsThisNotAnObjectLikeSeriouslyThunderstoreWhatTheFuckAreYouDoing.class).getResults();
    }
}
