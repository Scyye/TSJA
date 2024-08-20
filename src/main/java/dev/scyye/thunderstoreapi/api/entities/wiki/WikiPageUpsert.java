package dev.scyye.thunderstoreapi.api.entities.wiki;

import com.google.gson.GsonBuilder;

public class WikiPageUpsert {
    String id, title, markdown_content;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getMarkdownContent() {
        return markdown_content;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
