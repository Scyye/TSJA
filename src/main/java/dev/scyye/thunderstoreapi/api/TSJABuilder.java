package dev.scyye.thunderstoreapi.api;

import java.nio.file.Path;
import java.util.function.Consumer;

public class TSJABuilder {
    static boolean active = true;
    public TSJABuilder() {
    }

    private int updateCacheTime = 172800000;
    private Path cachePath = Path.of("tsja-cache");

    public TSJABuilder setCachePath(String path) {
        this.cachePath= Path.of(path);
        return this;
    }

    public TSJABuilder setUpdateCacheTime(int time) {
        this.updateCacheTime = time;
        return this;
    }

    public TSJA build(){
        if (!active) {
            throw new RuntimeException("Can't have multiple TSJA instances at once.");
        }
        return new TSJA($ -> {});
    }

    public TSJA build(Consumer<TSJA> success) {
        if (!active) {
            throw new RuntimeException("Can't have multiple TSJA instances at once.");
        }
        return new TSJA(success);
    }

}
