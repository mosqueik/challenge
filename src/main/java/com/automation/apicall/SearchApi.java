package com.automation.apicall;

import com.automation.apiUtil.ApiUtil;
import com.automation.apiUtil.PropertyUtils;
import com.automation.apicall.beans.SearchBean;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class SearchApi extends ApiUtil {

    public SearchApi(String baseUri) {
        super(baseUri);
    }

    int limit = 25;
    int offset = 0; // Max 4999
    String rating = "g";
    String lang = "en"; //  2-letter ISO 639-1 language code.
    String random_id = ""; // ID/proxy for a specific user
    String bundle = "";

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getRandom_id() {
        return random_id;
    }

    public void setRandom_id(String random_id) {
        this.random_id = random_id;
    }

    public String getBundle() {
        return bundle;
    }

    public void setBundle(String bundle) {
        this.bundle = bundle;
    }

    private SearchBean search(String endpoint, String searchString) throws Exception{
        try {

            Response response = given().
                    header("Content-type", "application/json").
                    queryParam("q", searchString).
                    queryParam("limit", limit).
                    queryParam("offset", offset).
                    queryParam("rating", rating).
                    queryParam("lang", lang).
                    queryParam("random_id", random_id).
                    queryParam("bundle", bundle).
                    queryParam("api_key", PropertyUtils.getProperty("api.token")).
                    when().
                    get(endpoint);

            // response.prettyPeek();

            return response.then().assertThat().
                    statusCode(200).
                    extract().as(SearchBean.class);
        }
        catch (Exception | Error err){
            err.printStackTrace();
            throw new Exception();
        }
    }

    public SearchBean searchGifs(String searchString) {
        try {
            String endpoint = PropertyUtils.getProperty("com.automation.endpoints.gifs.search");
            return search(endpoint, searchString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public SearchBean searchStickers(String searchString) {
        try {
            String endpoint = PropertyUtils.getProperty("com.automation.endpoints.stickers.search");
            return search(endpoint, searchString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
