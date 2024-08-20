package dev.scyye.thunderstoreapi.api.entities.wiki;

import com.google.gson.GsonBuilder;

public class WikiPageDelete {
    String id;

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
