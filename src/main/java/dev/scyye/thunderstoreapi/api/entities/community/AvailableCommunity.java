package dev.scyye.thunderstoreapi.api.entities.community;

import com.google.gson.GsonBuilder;
import dev.scyye.thunderstoreapi.api.entities.packages.PackageCategory;

import java.net.URL;

public class AvailableCommunity {
    Community community;
    PackageCategory[] categories;
    // TODO: Could be a URL
    URL url;

    public Community getCommunity() {
        return community;
    }

    public PackageCategory[] getCategories() {
        return categories;
    }

    public URL getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
