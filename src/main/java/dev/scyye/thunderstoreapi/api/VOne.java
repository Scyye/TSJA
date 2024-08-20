package dev.scyye.thunderstoreapi.api;

import dev.scyye.Client;
import dev.scyye.DataObject;

public class VOne {
	private static final Client client = new Client("https://thunderstore.io/api/v1/");

	private static Client getClient(String community) {
		return new Client("https://thunderstore.io/c/" + community + "/api/v1/");
	}

	// The endpoints for the v1 API
	public static DataObject packageRead(String uuid4) {
		return client.get("/package/" + uuid4 + "/", new DataObject());
	}

	public static DataObject packageRate(String uuid4, DataObject data) {
		return client.post("/package/" + uuid4 + "/rate/", new DataObject(), data);
	}

	public static DataObject packageMetrics(String namespace, String name) {
		return client.get("/package-metrics/" + namespace + "/" + name + "/", new DataObject());
	}

	public static DataObject packageVersionMetrics(String namespace, String name, String version) {
		return client.get("/package-metrics/" + namespace + "/" + name + "/" + version + "/", new DataObject());
	}

	public static DataObject packageList() {
		return client.get("/package/", new DataObject());
	}

	public static DataObject deprecateMod(String uuid4) {
		DataObject data = new DataObject();
		data.put("uuid4", uuid4);

		return client.post("/bot/deprecate-mod/", data, new DataObject());
	}

	public static DataObject currentUserInfo() {
		return client.get("/current-user/info/", new DataObject());
	}

	@Deprecated
	public static DataObject packageRead(String community, String uuid4) {
		return getClient(community).get("/package/" + uuid4 + "/", new DataObject());
	}

	public static DataObject packageRate(String community, String uuid4, DataObject data) {
		return getClient(community).post("/package/" + uuid4 + "/rate/", new DataObject(), data);
	}

	public static DataObject packageMetrics(String community, String namespace, String name) {
		return getClient(community).get("/package-metrics/" + namespace + "/" + name + "/", new DataObject());
	}

	public static DataObject packageVersionMetrics(String community, String namespace, String name, String version) {
		return getClient(community).get("/package-metrics/" + namespace + "/" + name + "/" + version + "/", new DataObject());
	}

	public static DataObject packageList(String community) {
		return getClient(community).get("/package/", new DataObject());
	}

	public static DataObject deprecateMod(String community, String uuid4) {
		DataObject data = new DataObject();
		data.put("uuid4", uuid4);

		return getClient(community).post("/bot/deprecate-mod/", data, new DataObject());
	}

	public static DataObject currentUserInfo(String community) {
		return getClient(community).get("/current-user/info/", new DataObject());
	}

	@Deprecated
	public static DataObject packageRead(String community, String namespace, String name) {
		return getClient(community).get("/package/" + namespace + "/" + name + "/", new DataObject());
	}

	public static DataObject packageRate(String community, String namespace, String name, DataObject data) {
		return getClient(community).post("/package/" + namespace + "/" + name + "/rate/", new DataObject(), data);
	}
}
