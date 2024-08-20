package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;

public class CompletedPart {
    String ETag;
    int PartNumber;

    public String getETag() {
        return ETag;
    }

    public int getPartNumber() {
        return PartNumber;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
