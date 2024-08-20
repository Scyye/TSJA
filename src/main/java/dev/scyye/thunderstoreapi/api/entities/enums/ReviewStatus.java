package dev.scyye.thunderstoreapi.api.entities.enums;

public enum ReviewStatus {
    UNREVIEWED,
    APPROVED,
    REJECTED;

    public static ReviewStatus getByName(String name) {
        return switch (name.toUpperCase()) {
            case "UNREVIEWED" -> UNREVIEWED;
            case "APPROVED" -> APPROVED;
            case "REJECTED" -> REJECTED;
            default -> null;
        };
    }
}
