package homepageTests;

import org.testng.annotations.Test;
import utils.base;

import java.io.IOException;

public class login extends base {


    public login() throws IOException {
    }

    @Test
    public void make_login() {

        homepage.getLogin().click();
        loginpage.getUsername_textfield().sendKeys("qatestes98@gmail.com");
        loginpage.getPassword_textfield().sendKeys("123testes");
        loginpage.getLogin_button().click();
    }
}
