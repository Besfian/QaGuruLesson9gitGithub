package ru.mail.besfian;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SoftAssertions {
    @Test
    void softAssertions() {
        open("https://github.com/search?q=selenide");
        $(byText("Wikis")).click();
        $("[title=SoftAssertions]").shouldHave(text("SoftAssertions"));
        $("[title=SoftAssertions]").click();
        $(".markdown-body").shouldHave(text("com.codeborne.selenide.junit5.SoftAssertsExtension"));
    }
}
