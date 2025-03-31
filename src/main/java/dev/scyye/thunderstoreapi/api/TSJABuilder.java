package dev.scyye.thunderstoreapi.api;

import java.nio.file.Path;
import java.util.function.Consumer;

public class TSJABuilder {
    static boolean active = false;
    public TSJABuilder() {
    }

    public TSJA build(){
        if (active) {
            throw new RuntimeException("Can't have multiple TSJA instances at once.");
        }
        active = true;
        return new TSJA($ -> {});
    }

    public TSJA build(Consumer<TSJA> success) {
        if (active) {
            throw new RuntimeException("Can't have multiple TSJA instances at once.");
        }
        active = true;
        return new TSJA(success);
    }

}
