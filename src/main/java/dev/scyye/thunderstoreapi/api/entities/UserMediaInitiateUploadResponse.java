package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;

public class UserMediaInitiateUploadResponse {
    UserMedia user_media;
    UploadPartUrl[] upload_urls;

    public UserMedia getUserMedia() {
        return user_media;
    }

    public UploadPartUrl[] getUploadUrls() {
        return upload_urls;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
