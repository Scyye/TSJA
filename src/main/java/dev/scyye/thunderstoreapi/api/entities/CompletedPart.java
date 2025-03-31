package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;
import lombok.Getter;

@Getter
public class CompletedPart {
    String ETag;
    int PartNumber;

	@Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
