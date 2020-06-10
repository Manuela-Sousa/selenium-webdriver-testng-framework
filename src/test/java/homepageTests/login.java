package homepageTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.base;

import java.io.IOException;

public class login extends base {


    public login() throws IOException {
    }

    @Test(dataProvider = "getData")
    public void make_login(String email, String password) {

        homepage.getLogin().click();
        loginpage.getUsername_textfield().sendKeys(email);
        loginpage.getPassword_textfield().sendKeys(password);
        loginpage.getLogin_button().click();
        String login_actual_text = loginpage.getLogged_in_username_text().getText();
        Assert.assertEquals(login_actual_text, "Testes");
    }

}
