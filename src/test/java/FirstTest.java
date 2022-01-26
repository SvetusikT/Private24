import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.security.Key;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FirstTest {
    @Test
    public void firstTest() {
        WebDriverManager.chromedriver().setup();

        Selenide.open("https://next.privat24.ua/money-transfer/card");
        $(".fJGOXC").sendKeys("4552331448138217");
        $("#app > div.root_2L2ydAMddU > section > div > div.root_1JzrV6kl0D > div.content_19lkXZSYWo > div.root_3JkwQInzop > form > div:nth-child(1) > div > div.sc-ksYbfQ.eqDpUE.sc-hmzhuo.gfNlIs > div > div.sc-fjmCvl.ipGzif > div.sc-TFwJa.iiqsNU > div.sc-bHwgHz.goykjk > div > div:nth-child(2) > input").setValue("05/24");
        $("#app > div.root_2L2ydAMddU > section > div > div.root_1JzrV6kl0D > div.content_19lkXZSYWo > div.root_3JkwQInzop > form > div:nth-child(1) > div > div.sc-ksYbfQ.eqDpUE.sc-hmzhuo.gfNlIs > div > div.sc-fjmCvl.ipGzif > div.sc-TFwJa.iiqsNU > div.sc-krDsej.lkuqjc > div.sc-bnXvFD.jlRfcI > div > div:nth-child(2) > input").sendKeys("926");
        $("#app > div.root_2L2ydAMddU > section > div > div.root_1JzrV6kl0D > div.content_19lkXZSYWo > div.root_3JkwQInzop > form > div:nth-child(2) > div > div.sc-ksYbfQ.eqDpUE.sc-hmzhuo.gfNlIs > div > div:nth-child(1) > div.sc-CtfFt.eZaSeC > div.sc-lhVmIH.duakU > div:nth-child(2) > input").sendKeys("4004159115449003");
        $(By.name("amount")).sendKeys("123");
        $(".cnKPTH").click();
        $("#app > div.root_2L2ydAMddU > section > div > div.root_1JzrV6kl0D > div.content_19lkXZSYWo > div.root_3JkwQInzop > form > div:nth-child(3) > div > div.currency_1ZfwGXR-42 > div > div > div.sc-gzOgki.llrwTX > div > div > div > div > button:nth-child(2)").click();
        $("#app > div.root_2L2ydAMddU > section > div > div.root_1JzrV6kl0D > div.content_19lkXZSYWo > div.root_3JkwQInzop > form > div.textCenter_nDBAewjIXE > div > button > div").click();

//        Selenide.open("https://www.google.com/");
//
//        Selenide.$(By.name("q")).sendKeys("Hillel");
//        Selenide.$(By.name("q")).sendKeys(Keys.ENTER);
//        Selenide.$$("cite")
//                .shouldHave(CollectionCondition.itemWithText("https://ithillel.ua"));
//        .first();
//        .shouldHave(Condition.text("https://ithillel.ua/"));

    }


}
