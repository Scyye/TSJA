package dev.scyye.thunderstoreapi.api.entities.wiki;

import com.google.gson.GsonBuilder;

import java.util.Date;

public class Wiki {
    String id, title, slug;
    Date datetime_created, datetime_updated;
    WikiPageIndex[] pages;


    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSlug() {
        return slug;
    }

    public Date getDatetimeCreated() {
        return datetime_created;
    }

    public Date getDatetimeUpdated() {
        return datetime_updated;
    }

    public WikiPageIndex[] getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
