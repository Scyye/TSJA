package dev.scyye.thunderstoreapi.api.entities.experimental;

import com.google.gson.GsonBuilder;

public class PackageListingUpdateResponse {
    PackageCategoryExperimental[] categories;

    public PackageCategoryExperimental[] getCategories() {
        return categories;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
