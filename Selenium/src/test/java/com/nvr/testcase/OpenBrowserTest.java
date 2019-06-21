package com.nvr.testcase;

import com.nvr.browserName.BrowserName;
import com.nvr.webdriver.WebDriverUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class OpenBrowserTest {
    @Test
    public void testOpenBroswer() throws InterruptedException {
        WebDriver driver = WebDriverUtils.openBrowser(BrowserName.chrome);
        driver.get("http://www.baidu.com");

        WebDriverUtils.closeAll();
    }
}