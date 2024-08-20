package dev.scyye.thunderstoreapi.api.entities.packages;

import com.google.gson.GsonBuilder;

public class PackageListingUpdateRequest {
    String[] categories;

    public String[] getCategories() {
        return categories;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
