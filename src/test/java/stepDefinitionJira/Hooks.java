package stepDefinitionJira;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import hooks.WebHooks;

import static com.codeborne.selenide.Selenide.open;

public class Hooks extends WebHooks {
    @Before
    public void openUrl() {
        open("https://edujira.ifellow.ru/secure/Dashboard.jspa");
    }
    @After
    public void closeBrowser() {
        closeDriver();
    }
}
