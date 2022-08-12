package steps.def;

import com.automation.apicall.SearchApi;
import com.automation.apicall.beans.SearchBean;
import io.cucumber.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;


public class StickersSearch extends BaseTest {

    SearchApi searchApi = new SearchApi(getBaseUrl());

    @When("Search Stickers with {string}")
    public void searchStickersStep(String searchString) {
        SearchBean searchBean = searchApi.searchStickers(searchString);
        assertFalse(searchBean.getData().isEmpty());
        assertTrue(searchBean.getPagination().getCount() > 0);
        assertTrue(searchBean.getPagination().getTotal_count() > 0);
    }

    @When("Empty search Stickers {string}")
    public void searchEmptyStickersStep(String searchString) {
        SearchBean searchBean = searchApi.searchStickers(searchString);
        assertTrue(searchBean.getData().isEmpty());
        assertEquals(0, searchBean.getPagination().getCount());
        assertEquals(0, searchBean.getPagination().getTotal_count());
    }

    @When("Limit {int} for Stickers {string}")
    public void limitStickersStep(int limit, String searchString) {
        searchApi.setLimit(limit);
        SearchBean searchBean = searchApi.searchStickers(searchString);
        if ( limit == 0 ) {
            assertTrue(searchBean.getData().isEmpty());
            assertEquals( 0, searchBean.getPagination().getTotal_count());
            assertEquals(searchBean.getPagination().getCount(), limit);
        } else {
            assertFalse(searchBean.getData().isEmpty());
            assertTrue( searchBean.getPagination().getTotal_count() > 0);
            assertTrue(searchBean.getPagination().getCount() > 0);
        }
    }

}
