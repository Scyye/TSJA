package dev.scyye.thunderstoreapi.api.entities.packages;

import com.google.gson.GsonBuilder;

import java.net.URL;
import java.util.Date;
import java.util.UUID;

public class PackageListing {
    String name, full_name, owner;
    URL package_url, donation_link;
    Date date_created, date_updated;
    UUID uuid4;
    String rating_score;
    boolean is_pinned, is_deprecated, has_nsfw_content;
    String[] categories;
    PackageVersion[] versions;

    public String getName() {
        return name;
    }

    public String getFullName() {
        return full_name;
    }

    public String getOwner() {
        return owner;
    }

    public URL getPackageUrl() {
        return package_url;
    }

    public URL getDonationLink() {
        return donation_link;
    }

    public Date getDateCreated() {
        return date_created;
    }

    public Date getDateUpdated() {
        return date_updated;
    }

    public UUID getUniqueId() {
        return uuid4;
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

    public boolean hasNsfwContent() {
        return has_nsfw_content;
    }

    public String[] getCategories() {
        return categories;
    }

    public PackageVersion[] getVersions() {
        return versions;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
