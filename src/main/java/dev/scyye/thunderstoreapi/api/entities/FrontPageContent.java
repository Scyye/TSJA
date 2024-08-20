package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;
import dev.scyye.thunderstoreapi.api.entities.community.CommunityCard;

public class FrontPageContent {
    CommunityCard[] communities;
    int download_count;
    int package_count;

    public CommunityCard[] getCommunities() {
        return communities;
    }

    public int getDownloadCount() {
        return download_count;
    }

    public int getPackageCount() {
        return package_count;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
