package HomeWork25;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] webDrivers = {new ChromeDriver(),new FirefoxDriver()};
        for(WebDriver x: webDrivers){
            x.openBrowser();
            x.maximizeWindow();
            x.findElement();
            x.closeBrowser();
        }
    }
}
