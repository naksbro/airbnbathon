package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AdventurePage;
import pages.BecomeHostPage;
import pages.HelpHomePage;
import util.Driver;
import util.SeleniumUtils;

import java.util.ArrayList;
import java.util.List;

public class AdventurePage_impl {

    private static WebDriver driver = Driver.getDriver();
    AdventurePage adventure = new AdventurePage();
    HelpHomePage helpPage = new HelpHomePage();
    BecomeHostPage hostPage = new BecomeHostPage();

    public void navigateToPage (String page) {
        switch (page.toLowerCase()) {
            case "adventure":
                SeleniumUtils.click(adventure.adventures_Btn);
                break;
            case "help":
                SeleniumUtils.click(helpPage.Help_btn);
                SeleniumUtils.waitForClickability(helpPage.HelpCenter_btn);
                SeleniumUtils.click(helpPage.HelpCenter_btn);
                break;
            case "first article":
                SeleniumUtils.click(helpPage.ReadMore_btn);
                break;
            case "host a home":
                SeleniumUtils.click(hostPage.Hostahome_btn);
                break;
        }
    }

    public List<Integer> checkPrice () {
        List<Integer> prices = new ArrayList<>();
        for (WebElement we : adventure.under500) {
            if (we.getText().contains("$")) {
                String amount = we.getText();
                amount = amount.substring(amount.indexOf('$')+1, amount.indexOf('/'));
                int price = Integer.parseInt(amount);
                if (price < 500)
                    prices.add(price);
            }
        }
        return prices;
    }
}
