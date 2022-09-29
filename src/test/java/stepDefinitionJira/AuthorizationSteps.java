package stepDefinitionJira;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static PageElements.AuthorizationPageElements.loginButton;
import static PageElements.AuthorizationPageElements.loginField;
import static PageElements.AuthorizationPageElements.passwordField;
import static PageElements.MainPageElements.userProfileIcon;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AuthorizationSteps {
    @When("^Вводим логин (.*) и пароль (.*)$")
    public void authorization(String login, String password) {
        loginField.shouldBe(visible).sendKeys(login);
        passwordField.shouldBe(visible).sendKeys(password);
    }

    @When("^Нажимаем кнопку войти$")
    public void clickConfirmLogin() {
        loginButton.shouldBe(enabled).click();
    }

    @Then("^Проверяем, что мы авторизованы$")
    public void checkSuccess() {
        assertTrue(userProfileIcon.is(visible));
    }

    @When("^Авторизуемся под юзером: (.*) и паролем: (.*)$")
    public void auth(String login, String pass) {
        loginField.shouldBe(visible).sendKeys(login);
        passwordField.shouldBe(visible).sendKeys(pass);
        loginButton.shouldBe(enabled).click();
        assertTrue(userProfileIcon.is(visible));
    }
}
