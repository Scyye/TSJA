package dev.scyye.thunderstoreapi.api.entities.packages;

import com.google.gson.GsonBuilder;

public class PackageWikiListResponse {
    PackageWiki[] results;
    // TODO: Could be a Date
    String cursor;
    boolean has_more;

    public PackageWiki[] getResults() {
        return results;
    }

    public String getCursor() {
        return cursor;
    }

    public boolean hasMore() {
        return has_more;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
