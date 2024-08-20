package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;

public class MarkdownResponse {
    String markdown;

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
