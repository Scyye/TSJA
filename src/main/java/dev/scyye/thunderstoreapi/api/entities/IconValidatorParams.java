package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;

public class IconValidatorParams {
    String icon_data;

    public String getIconData() {
        return icon_data;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
