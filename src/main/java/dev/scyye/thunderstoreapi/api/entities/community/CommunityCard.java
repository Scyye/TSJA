package dev.scyye.thunderstoreapi.api.entities.community;

import com.google.gson.GsonBuilder;
import org.jetbrains.annotations.Nullable;

public class CommunityCard {
    @Nullable
    String bg_image_src;
    int download_count;
    String identifier;
    String name;
    int package_count;

    @Nullable
    public String getBackgroundImageSource() {
        return bg_image_src;
    }

    public int getDownloadCount() {
        return download_count;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public int getPackageCount() {
        return package_count;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
