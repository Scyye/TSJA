package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;

public class ReadmeValidatorParams {
    String readme_data;

    public String getReadmeData() {
        return readme_data;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
