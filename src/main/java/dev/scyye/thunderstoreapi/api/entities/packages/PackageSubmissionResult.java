package dev.scyye.thunderstoreapi.api.entities.packages;

import com.google.gson.GsonBuilder;
import dev.scyye.thunderstoreapi.api.entities.community.AvailableCommunity;
import dev.scyye.thunderstoreapi.api.entities.experimental.PackageVersionExperimental;

public class PackageSubmissionResult {
    PackageVersionExperimental package_version;
    AvailableCommunity[] available_communities;

    public PackageVersionExperimental getPackageVersion() {
        return package_version;
    }

    public AvailableCommunity[] getAvailableCommunities() {
        return available_communities;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
