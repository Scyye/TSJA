package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;

public class UserMediaFinishUploadParams {
    CompletedPart[] parts;

    public CompletedPart[] getParts() {
        return parts;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
