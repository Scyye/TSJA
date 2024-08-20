package dev.scyye.thunderstoreapi.api.entities.community;

import com.google.gson.GsonBuilder;
import org.jetbrains.annotations.Nullable;

import java.net.URL;

public class Community {
    String identifier;
    String name;
    @Nullable
    String discord_url;
    @Nullable
    String wiki_url;
    boolean require_package_listing_approval;

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    @Nullable
    public String getDiscordUrl() {
        return discord_url;
    }

    @Nullable
    public String getWikiUrl() {
        return wiki_url;
    }

    public boolean isRequirePackageListingApproval() {
        return require_package_listing_approval;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
