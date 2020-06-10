package homepageTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.base;

import java.io.IOException;

public class homepage extends base {


    public homepage() throws IOException {
    }

    @Test
    public void validate_homepage_featured_courses_title() {
        String homepage_actual_text = homepage.getHomepage_courses_title().getText();
        Assert.assertEquals(homepage_actual_text, "Featured Courses");
    }
}
