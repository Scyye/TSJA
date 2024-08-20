package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;
import org.jetbrains.annotations.Nullable;

public class UserProfile {
    String username;
    @Nullable
    String capabilities;
    SubscriptionStatus subscription;
    String[] rated_packages;
    String[] teams;

    public String getUsername() {
        return username;
    }

    @Nullable
    public String getCapabilities() {
        return capabilities;
    }

    public SubscriptionStatus getSubscription() {
        return subscription;
    }

    public String[] getkages() {
        return rated_packages;
    }

    public String[] getTeams() {
        return teams;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
