package dev.scyye.thunderstoreapi.api.entities;

import com.google.gson.GsonBuilder;
import dev.scyye.thunderstoreapi.api.entities.enums.Status;

import java.util.Date;
import java.util.UUID;

public class UserMedia {
    UUID uuid;
    String filename;
    int size;
    Date datetime_created, expiry;
    String status;

    public UUID getUniqueId() {
        return uuid;
    }

    public String getFilename() {
        return filename;
    }

    public int getSize() {
        return size;
    }

    public Date getDatetimeCreated() {
        return datetime_created;
    }

    public Date getExpiry() {
        return expiry;
    }

    public Status getStatus() {
        return Status.getByName(status);
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
