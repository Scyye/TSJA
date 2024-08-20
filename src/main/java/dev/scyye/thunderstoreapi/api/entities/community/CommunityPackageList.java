package dev.scyye.thunderstoreapi.api.entities.community;

import com.google.gson.GsonBuilder;
import dev.scyye.thunderstoreapi.api.entities.packages.PackageCard;
import dev.scyye.thunderstoreapi.api.entities.packages.PackageCategory;
import org.jetbrains.annotations.Nullable;

public class CommunityPackageList {
    @Nullable
    String bg_image_src;
    PackageCategory[] categories;
    String community_name;
    boolean has_more_pages;
    PackageCard[] packages;

    @Nullable
    public String getBackgroundImageSource() {
        return bg_image_src;
    }

    public PackageCategory[] getCategories() {
        return categories;
    }

    public String getCommunityName() {
        return community_name;
    }

    public boolean hasMorePages() {
        return has_more_pages;
    }

    public PackageCard[] getPackages() {
        return packages;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
