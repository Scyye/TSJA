package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;

public class OwLoginResponseBody {
    String session_id;
    UserProfile profile;

    public String getSessionId() {
        return session_id;
    }

    public UserProfile getProfile() {
        return profile;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
