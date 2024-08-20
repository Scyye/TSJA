package dev.scyye.thunderstoreapi.api.entities.enums;

public enum Status {
    INITIAL,
    UPLOAD_CREATED,
    UPLOAD_ERROR,
    UPLOAD_COMPLETE,
    UPLOAD_ABORTED;

    public static Status getByName(String name) {
        return switch (name.toUpperCase()) {
            case "INITIAL" -> INITIAL;
            case "UPLOAD_CREATED" -> UPLOAD_CREATED;
            case "UPLOAD_ERROR" -> UPLOAD_ERROR;
            case "UPLOAD_COMPLETE" -> UPLOAD_COMPLETE;
            case "UPLOAD_ABORTED" -> UPLOAD_ABORTED;
            default -> null;
        };
    }
}
