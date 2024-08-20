package dev.scyye.thunderstoreapi.api.entities.packages;

import com.google.gson.GsonBuilder;
import org.jetbrains.annotations.Nullable;

import java.util.Date;

public class PackageCard {
    PackageCategory[] categories;
    String community_identifier;
    String community_name;
    String description;
    int download_count;
    @Nullable
    String image_src;
    boolean is_deprecated;
    boolean is_nsfw;
    boolean is_pinned;
    Date last_updated;
    String namespace;
    String package_name;
    int rating_score;
    String team_name;

    public PackageCategory[] getCategories() {
        return categories;
    }

    public String getCommunityIdentifier() {
        return community_identifier;
    }

    public String getCommunityName() {
        return community_name;
    }

    public String getDescription() {
        return description;
    }

    public int getDownloadCount() {
        return download_count;
    }

    @Nullable
    public String getImageSource() {
        return image_src;
    }

    public boolean isDeprecated() {
        return is_deprecated;
    }

    public boolean isNSFW() {
        return is_nsfw;
    }

    public boolean isPinned() {
        return is_pinned;
    }

    public Date getLastUpdated() {
        return last_updated;
    }

    public String getNamespace() {
        return namespace;
    }

    public String getPackageName() {
        return package_name;
    }

    public int getRatingScore() {
        return rating_score;
    }

    public String getTeamName() {
        return team_name;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
