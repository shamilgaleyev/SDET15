package class23;

public class WedDriverTester {
    public static void main(String[] args) {


//        Chrome googleChrome = new Chrome();
//        googleChrome.startBrowser();
//        googleChrome.openUrl();
//        googleChrome.testLoginPage();
//        googleChrome.closeBrowser();
//
//        Safari safari = new Safari();
//        safari.startBrowser();
//        safari.openUrl();
//        safari.testLoginPage();
//        safari.closeBrowser();
//
//        FireFox fireFox = new FireFox();
//        fireFox.startBrowser();
//        fireFox.openUrl();
//        fireFox.testLoginPage();
//        fireFox.closeBrowser();
//
//        WebDriver webDriver = new Chrome();
//        webDriver.startBrowser();
//        webDriver.openUrl();
//        webDriver.testLoginPage();
//        webDriver.closeBrowser();

      WebDriver[] browsers = {new Chrome(),new Safari(),new FireFox()};

      for(WebDriver browser: browsers){
          browser.startBrowser();
          browser.openUrl();
          browser.testLoginPage();
          browser.closeBrowser();
      }

    }
}