package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;

public class LegacyProfileCreateResponse {
    String key;

    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
