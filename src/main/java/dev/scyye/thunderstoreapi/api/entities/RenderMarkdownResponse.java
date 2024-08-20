package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;

public class RenderMarkdownResponse {
    String html;

    public String getHtml() {
        return html;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
