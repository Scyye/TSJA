package dev.scyye.thunderstoreapi.api.entities.packages;

import com.google.gson.GsonBuilder;
import org.jetbrains.annotations.Nullable;

public class PackageDependency {
    @Nullable
    String community_identifier;
    @Nullable
    String community_name;
    String description;
    @Nullable
    String image_src;
    String namespace;
    String package_name;
    String version_number;

    @Nullable
    public String getCommunityIdentifier() {
        return community_identifier;
    }

    @Nullable
    public String getCommunityName() {
        return community_name;
    }

    public String getDescription() {
        return description;
    }

    @Nullable
    public String getImageSource() {
        return image_src;
    }

    public String getNamespace() {
        return namespace;
    }

    public String getPackageName() {
        return package_name;
    }

    public String getVersionNumber() {
        return version_number;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
