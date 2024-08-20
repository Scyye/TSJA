package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;

public class ResponseBody {
    String email;
    String session_id;
    String username;

    public String getEmail() {
        return email;
    }

    public String gnId() {
        return session_id;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
