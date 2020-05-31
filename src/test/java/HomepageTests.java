import org.testng.annotations.Test;

import java.io.IOException;

public class HomepageTests extends base {

    @Test
    public void open_page() throws IOException {
        driver = initializeDriver();
        driver.get("https://www.google.pt");
    }

}
