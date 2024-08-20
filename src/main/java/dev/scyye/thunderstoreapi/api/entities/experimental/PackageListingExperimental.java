package dev.scyye.thunderstoreapi.api.entities.experimental;

import com.google.gson.GsonBuilder;
import dev.scyye.thunderstoreapi.api.entities.enums.ReviewStatus;

public class PackageListingExperimental {
    boolean has_nsfw_content;
    String categories;
    String community;
    String review_status;

    public boolean hasNsfwContent() {
        return has_nsfw_content;
    }

    public String getCategories() {
        return categories;
    }

    public String getCommunity() {
        return community;
    }

    public ReviewStatus getReviewStatus() {
        return ReviewStatus.getByName(review_status);
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
