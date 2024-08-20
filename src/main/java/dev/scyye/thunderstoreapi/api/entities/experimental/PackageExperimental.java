package dev.scyye.thunderstoreapi.api.entities.experimental;

import com.google.gson.GsonBuilder;

import java.util.Date;

public class PackageExperimental {
    String namespace;
    String name, full_name, owner;
    String package_url;
    Date date_created, date_updated;
    String rating_score;
    boolean is_pinned, is_deprecated;
    String total_downloads;
    PackageVersionExperimental latest;
    PackageListingExperimental[] community_listings;

    public String getNamespace() {
        return namespace;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return full_name;
    }

    public String getOwner() {
        return owner;
    }

    public String getPackageUrl() {
        return package_url;
    }

    public Date getDateCreated() {
        return date_created;
    }

    public Date getDateUpdated() {
        return date_updated;
    }

    public String getRatingScore() {
        return rating_score;
    }

    public boolean isPinned() {
        return is_pinned;
    }

    public boolean isDeprecated() {
        return is_deprecated;
    }

    public String getTotalDownloads() {
        return total_downloads;
    }

    public PackageVersionExperimental getLatest() {
        return latest;
    }

    public PackageListingExperimental[] getCommunityListings() {
        return community_listings;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
