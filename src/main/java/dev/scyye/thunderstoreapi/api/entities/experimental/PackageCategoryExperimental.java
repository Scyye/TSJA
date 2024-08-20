package dev.scyye.thunderstoreapi.api.entities.experimental;

import com.google.gson.GsonBuilder;

public class PackageCategoryExperimental {
    String name;
    String slug;

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
