package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;

public class UploadPartUrl {
    int part_number;
    // TODO: Could be URL
    String url;
    int offset, length;

    public int getPartNumber() {
        return part_number;
    }

    public String getUrl() {
        return url;
    }

    public int getOffset() {
        return offset;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
