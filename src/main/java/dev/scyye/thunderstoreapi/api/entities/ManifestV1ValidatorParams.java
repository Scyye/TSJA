package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;

public class ManifestV1ValidatorParams {
    String namespace, manifest_data;

    public String getNamespace() {
        return namespace;
    }

    public String getManifestData() {
        return manifest_data;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
