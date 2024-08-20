package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;

public class ValidatorResponse {
    boolean success;

    public boolean isSuccess() {
        return success;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
