package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;

public class OwLoginRequestBody {
    String jwt;

    public String getJwt() {
        return jwt;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
