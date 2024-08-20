package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;
import lombok.Getter;
import lombok.Setter;

public class RenderMarkdownParams {
    @Setter @Getter
    String markdown;

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
