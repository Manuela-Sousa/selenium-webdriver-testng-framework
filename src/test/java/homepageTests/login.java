package homepageTests;

import org.testng.annotations.DataProvider;
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
    }

    @DataProvider
    public Object[][] getData() {

        //data for login credentials
        //each object data corresponds to executions
        Object[][] data = new Object[1][2];
        data[0][0] = "qatestes98@gmail.com";
        data[0][1] = "123testes";

        return data;
    }
}
