package dev.scyye.thunderstoreapi.api.entities.packages;

import com.google.gson.GsonBuilder;
import org.jetbrains.annotations.Nullable;

import java.util.Date;

public class PackageDetailViewContent {
    @Nullable
    String bg_image_src;
    PackageCategory[] categories;
    String community_identifier;
    String community_name;
    int dependant_count;
    PackageDependency[] dependencies;
    String dependency_string;
    String description;
    int download_count;
    String download_url;
    @Nullable
    String image_src;
    String install_url;
    Date last_updated;
    String markdown;
    String namespace;
    String package_name;
    int rating_score;
    String team_name;
    PackageVersion[] versions;
    String website;

    @Nullable
    public String getBackgroundImageSource() {
        return bg_image_src;
    }

    public PackageCategory[] getCategories() {
        return categories;
    }

    public String getCommunityIdentifier() {
        return community_identifier;
    }

    public String getCommunityName() {
        return community_name;
    }

    public int getDependantCount() {
        return dependant_count;
    }

    public PackageDependency[] getDependencies() {
        return dependencies;
    }

    public String getDependencyString() {
        return dependency_string;
    }

    public String getDescription() {
        return description;
    }

    public int getDownloadCount() {
        return download_count;
    }

    public String getDownloadUrl() {
        return download_url;
    }

    @Nullable
    public String getImageSource() {
        return image_src;
    }

    public String getInstallUrl() {
        return install_url;
    }

    public Date getLastUpdated() {
        return last_updated;
    }

    public String getMarkdown() {
        return markdown;
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

    public PackageVersion[] getVersions() {
        return versions;
    }

    public String getWebsite() {
        return website;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
