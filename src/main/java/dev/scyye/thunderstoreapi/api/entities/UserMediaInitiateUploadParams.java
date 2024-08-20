package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;

public class UserMediaInitiateUploadParams {
    String filename;
    int file_size_bytes;

    public String getFileName() {
        return filename;
    }

    public int getFileSizeBytes() {
        return file_size_bytes;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }

}
