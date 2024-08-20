package test.scyye.thunderstoreapi;

import dev.scyye.thunderstoreapi.api.Experimental;
import dev.scyye.thunderstoreapi.api.TSJABuilder;
import dev.scyye.thunderstoreapi.api.entities.packages.PackageListing;
import dev.scyye.thunderstoreapi.cache.CacheCollector;

import java.util.List;

public class Main {
    public static void main(String[] args) {
		System.out.println(Experimental.legacyProfileRetrieve("01916d23-0aaf-20de-66fe-2a0902ce0f5c"));
	}
}
