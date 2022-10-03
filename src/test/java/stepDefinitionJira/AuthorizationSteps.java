package stepDefinitionJira;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static PageElements.AuthorizationPageElements.loginButton;
import static PageElements.AuthorizationPageElements.loginField;
import static PageElements.AuthorizationPageElements.passwordField;
import static PageElements.MainPageElements.userProfileIcon;
import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.Configuration.getConfigurationValue;

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

    @When("^Получаем имя текущего юзера$")
    public String getCurrentUsername() {
        return userProfileIcon.shouldHave(attribute("data-username")).attr("data-username");
    }

    @Then("^Проверяем, что мы авторизованы$")
    public void checkSuccess() {
        userProfileIcon.shouldBe(appear);
        assertEquals(getConfigurationValue("login"), getCurrentUsername());
    }

    @When("^Авторизуемся под юзером: (.*) и паролем: (.*)$")
    public void auth(String login, String pass) {
        loginField.shouldBe(visible).sendKeys(login);
        passwordField.shouldBe(visible).sendKeys(pass);
        loginButton.shouldBe(enabled).click();
        userProfileIcon.shouldBe(appear);
        assertEquals(getConfigurationValue("login"), getCurrentUsername());
    }
}
