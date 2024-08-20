package dev.scyye.thunderstoreapi.utils;

import org.json.JSONObject;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public final class JSONUtils {

    public static String getJsonFromStream(InputStream stream) {
        return new Scanner(stream, StandardCharsets.UTF_8).useDelimiter("\\A").next();
    }

    public static String pretify(String json) {
        if (json.startsWith("["))
            json = "{\"obj\":"+json+"}";
        JSONObject jsonObject = new JSONObject(json);
        return jsonObject.toString(4);
    }

    public static String mergeJson(String json1, String json2) {
        return "{" + json1 + json2 + "}";
    }

}
