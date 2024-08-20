package dev.scyye.thunderstoreapi.api.entities.packages;

import com.google.gson.GsonBuilder;

import java.util.UUID;

public class PackageSubmissionMetadata {
    String author_name;
    String[] categories, communities;
    boolean has_nsfw_content;
    UUID upload_uuid;
    String[] community_categories;

    public String getAuthorName() {
        return author_name;
    }

    public String[] getCategories() {
        return categories;
    }

    public String[] getCommunities() {
        return communities;
    }

    public boolean hasNsfwContent() {
        return has_nsfw_content;
    }

    public UUID getUploadUUID() {
        return upload_uuid;
    }

    public String[] getCommunityCategories() {
        return community_categories;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
