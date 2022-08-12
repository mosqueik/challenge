package com.automation.apiUtil;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import org.json.simple.JSONObject;

public class ApiUtil {

    protected JSONObject requestParams = new JSONObject();

    public ApiUtil(String baseUri) {
        if ( baseUri != null) {
            RestAssured.baseURI = baseUri;
            RestAssured.port = 443;
            RestAssured.urlEncodingEnabled = true;
        }
        else
            throw new NullPointerException("No base Uri for Api Call");

        RestAssured.defaultParser = Parser.JSON;
    }

    public void wipeRequestParams() {
        if (!requestParams.isEmpty())
            requestParams.clear();
    }
}
