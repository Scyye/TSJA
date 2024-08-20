package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;

import java.time.OffsetDateTime;
import java.util.Date;

public class SubscriptionStatus {
    Date expires;
    public Date getExpires() {
        return expires;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
