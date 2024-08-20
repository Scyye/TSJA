package dev.scyye.thunderstoreapi.api.entities.packages;

import com.google.gson.GsonBuilder;

import java.net.URL;
import java.util.Date;
import java.util.UUID;

public class PackageVersion {
    String name;
    String full_name;
    String description;
    String icon;
    String version_number;
    String[] dependencies;
    URL download_url;
    int downloads;
    Date date_created;
    String website_url;
    boolean is_active;
    UUID uuid4;
    long file_size;

    public String getName() {
        return name;
    }

    public String getFullName() {
        return full_name;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }

    public String getVersionNumber() {
        return version_number;
    }

    public String[] getDependencies() {
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

    public UUID getUuid() {
        return uuid4;
    }

    public long getFileSize() {
        return file_size;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
