package dev.scyye.thunderstoreapi.api.entities.packages;

import com.google.gson.GsonBuilder;
import dev.scyye.thunderstoreapi.api.entities.wiki.Wiki;

public class PackageWiki {
    String namespace, name;
    Wiki wiki;


    public String getNamespace() {
        return namespace;
    }

    public String getName() {
        return name;
    }

    public Wiki getWiki() {
        return wiki;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
