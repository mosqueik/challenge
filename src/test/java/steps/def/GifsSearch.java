package steps.def;

import com.automation.apicall.SearchApi;
import com.automation.apicall.beans.SearchBean;
import io.cucumber.java.en.When;

import static junit.framework.TestCase.*;


public class GifsSearch extends BaseTest {

    SearchApi searchApi = new SearchApi(getBaseUrl());

    @When("Empty search Gifs {string}")
    public void searchEmptyGifsStep(String searchString) {
        SearchBean searchBean = searchApi.searchGifs(searchString);
        assertTrue(searchBean.getData().isEmpty());
        assertEquals(0, searchBean.getPagination().getCount());
        assertEquals(0, searchBean.getPagination().getTotal_count());
    }

    @When("Search Gifs with {string}")
    public void searchGifsStep(String searchString) {
        SearchBean searchBean = searchApi.searchGifs(searchString);
        assertFalse(searchBean.getData().isEmpty());
        assertTrue(searchBean.getPagination().getCount() > 0);
        assertTrue(searchBean.getPagination().getTotal_count() > 0);
    }

}
