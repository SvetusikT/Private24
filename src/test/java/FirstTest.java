import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import java.security.Key;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class FirstTest {
    @Test
    public void firstTest() {
        WebDriverManager.chromedriver().setup();

        Selenide.open("https://next.privat24.ua/money-transfer/card");
        $x("//input[@data-qa-node='numberdebitSource']").sendKeys("4552331448138217");
        $x("//input[@data-qa-node='expiredebitSource']").setValue("05/24");
        $x("//input[@data-qa-node='cvvdebitSource']").sendKeys("926");
        $x("//input[@data-qa-node='numberreceiver']").sendKeys("4004159115449003");
        $(By.name("amount")).sendKeys("123");
        $x("//span[text()='UAH']").click();
        $x("//button[@title='USD']").click();
        $x("//button[@type='submit']").click();

        //Проверка

        Selenide.$$x("//span[@data-qa-node='payer-card']").shouldHave(CollectionCondition.texts("4552 3314 4813 8217"));
        Selenide.$$x("//span[@data-qa-node='receiver-card']").shouldHave(CollectionCondition.itemWithText("4004 1591 1544 9003"));
        Selenide.$$x("//div[@data-qa-node='payer-amount']").shouldHave(CollectionCondition.itemWithText("123 USD"));
        Selenide.$$("button").shouldHave(CollectionCondition.itemWithText("Додати в кошик"));
    }
}
