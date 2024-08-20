package dev.scyye.thunderstoreapi.api.entities.experimental;

import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.URL;
import java.util.Date;

public class PackageVersionExperimental {
    String namespace;
    String name;
    String version_number;
    String full_name;
    String description;
    URI icon;
    String dependencies;
    URL download_url;
    int downloads;
    Date date_created;
    String website_url;
    boolean is_active;

    public String getNamespace() {
        return namespace;
    }

    public String getName() {
        return name;
    }

    public String getVersionNumber() {
        return version_number;
    }

    public String getFullName() {
        return full_name;
    }

    public String getDescription() {
        return description;
    }

    public URI getIcon() {
        return icon;
    }

    public String getDependencies() {
        return dependencies;
    }

    public URL getDownloadUrl() {
        return download_url;
    }

    public int getDownloads() {
        return downloads;
    }

    public Date getDateCreated() {
        return date_created;
    }

    public String getWebsiteUrl() {
        return website_url;
    }

    public boolean isActive() {
        return is_active;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
