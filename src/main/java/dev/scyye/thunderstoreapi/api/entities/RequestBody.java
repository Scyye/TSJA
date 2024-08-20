package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;
import lombok.Getter;

public class RequestBody {
    String code;
    String redirect_uri;

    public String getCode() {
        return code;
    }

    public String getRedirectUri() {
        return redirect_uri;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
