package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;

public class SchemaChannelUpdateResponse {
    String channel_identifier;
    String checksum_sha256;

    public String getChannelIdentifier() {
        return channel_identifier;
    }

    public String getChecksumSHA256() {
        return checksum_sha256;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
