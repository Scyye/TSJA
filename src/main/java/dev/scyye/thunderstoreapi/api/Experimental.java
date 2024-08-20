package dev.scyye.thunderstoreapi.api;

import dev.scyye.Client;
import dev.scyye.DataObject;

public class Experimental {
	private static final Client client = new Client("https://thunderstore.io/api/experimental/");

	// The endpoints for the experimental API
	public static DataObject authComplete(String provider, DataObject data) {
		return client.post("/auth/complete/" + provider + "/", new DataObject(), data);
	}

	public static DataObject authDelete() {
		return client.post("/auth/delete/", new DataObject(), null);
	}

	public static DataObject authOverwolfLogin(DataObject data) {
		return client.post("/auth/overwolf/login/", new DataObject(), data);
	}

	@Deprecated
	public static DataObject authValidate() {
		return client.get("/auth/validate/", new DataObject());
	}

	public static DataObject communityList(String cursor) {
		DataObject data = new DataObject();
		if (cursor != null)
			data.put("cursor", cursor);
		return client.get("/community/", data);
	}

	public static DataObject communityCategoryList(String community, String cursor) {
		DataObject data = new DataObject();
		if (cursor != null)
			data.put("cursor", cursor);
		return client.get("/community/" + community + "/category/", data);
	}

	public static DataObject currentCommunity() {
		return client.get("/current-community/", new DataObject());
	}

	public static DataObject currentUser() {
		return client.get("/current-user/", new DataObject());
	}

	@Deprecated
	public static DataObject frontendCommunityPackage(String communityIdentifier, String packageNamespace, String packageName) {
		return client.get("/frontend/c/" + communityIdentifier + "/p/" + packageNamespace + "/" + packageName + "/", new DataObject());
	}

	@Deprecated
	public static DataObject frontendCommunityPackages(String communityIdentifier) {
		return client.get("/frontend/c/" + communityIdentifier + "/packages/", new DataObject());
	}

	@Deprecated
	public static DataObject frontendFrontpage() {
		return client.get("/frontend/frontpage/", new DataObject());
	}

	public static DataObject frontendRenderMarkdown(String markdown) {
		DataObject data = new DataObject();
		data.put("markdown", markdown);

		return client.post("/frontend/render-markdown/", new DataObject(), data);
	}

	public static DataObject legacyProfileCreate(DataObject data) {
		return client.post("/legacyprofile/create/", new DataObject(), data);
	}

	public static String legacyProfileRetrieve(String key) {
		return client.getString("/legacyprofile/get/" + key + "/", new DataObject());
	}

	public static DataObject packageIndex() {
		return client.get("/package-index/", new DataObject());
	}

	public static DataObject packageListingApprove(int id) {
		return client.post("/package-listing/" + id + "/approve/", new DataObject(), null);
	}

	public static DataObject packageListingReject(int id, DataObject data) {
		return client.post("/package-listing/" + id + "/reject/", new DataObject(), data);
	}

	public static DataObject packageListingUpdate(int id, DataObject data) {
		return client.post("/package-listing/" + id + "/update/", new DataObject(), data);
	}

	@Deprecated
	public static DataObject packageList(String cursor) {
		DataObject data = new DataObject();
		if (cursor != null)
			data.put("cursor", cursor);
		return client.get("/package/", data);
	}

	public static DataObject packageWikiList(String after) {
		DataObject data = new DataObject();
		if (after != null)
			data.put("after", after);
		return client.get("/package/wikis/", data);
	}

	public static DataObject packageRead(String namespace, String name) {
		return client.get("/package/" + namespace + "/" + name + "/", new DataObject());
	}

	public static DataObject packageWikiRead(String namespace, String name) {
		return client.get("/package/" + namespace + "/" + name + "/wiki/", new DataObject());
	}

	public static DataObject packageVersionRead(String namespace, String name, String version) {
		return client.get("/package/" + namespace + "/" + name + "/" + version + "/", new DataObject());
	}

	public static DataObject packageVersionChangelogRead(String namespace, String name, String version) {
		return client.get("/package/" + namespace + "/" + name + "/" + version + "/changelog/", new DataObject());
	}

	public static DataObject packageVersionReadmeRead(String namespace, String name, String version) {
		return client.get("/package/" + namespace + "/" + name + "/" + version + "/readme/", new DataObject());
	}

	public static DataObject schemaChannelUpdate(String channel, DataObject data) {
		return client.post("/schema/" + channel + "/", new DataObject(), data);
	}

	public static DataObject schemaChannelRetrieve(String channel) {
		return client.get("/schema/" + channel + "/latest/", new DataObject());
	}

	public static DataObject submissionPollAsync(String submissionId) {
		return client.get("/submission/poll-async/" + submissionId + "/", new DataObject());
	}

	public static DataObject submissionSubmitAsync(DataObject data) {
		return client.post("/submission/submit-async/", new DataObject(), data);
	}

	public static DataObject submissionSubmit(DataObject data) {
		return client.post("/submission/submit/", new DataObject(), data);
	}

	@Deprecated
	public static DataObject submissionUpload() {
		return client.get("/submission/upload/", new DataObject());
	}

	@Deprecated
	public static DataObject submissionUploadCreate() {
		return client.post("/submission/upload/", new DataObject(), null);
	}

	public static DataObject submissionValidateIcon(DataObject data) {
		return client.post("/submission/validate/icon/", new DataObject(), data);
	}

	public static DataObject submissionValidateManifestV1(DataObject data) {
		return client.post("/submission/validate/manifest-v1/", new DataObject(), data);
	}

	public static DataObject submissionValidateReadme(DataObject data) {
		return client.post("/submission/validate/readme/", new DataObject(), data);
	}

	public static DataObject userMediaInitiateUpload(DataObject data) {
		return client.post("/usermedia/initiate-upload/", new DataObject(), data);
	}
}
