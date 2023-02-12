package class23;

public class WebDriver {
    public void startBrowser(){
        System.out.println("starting the bbrowser");
    }
    public void openUrl(){
        System.out.println("opening a url");
    }
    public void testLoginPage(){
        System.out.println("check if login page works");
    }
    public void closeBrowser(){
        System.out.println("closing the browser");
    }
}
class Chrome extends WebDriver{

    @Override
    public void startBrowser() {
        System.out.println("Starting google chrome");
    }

    @Override
    public void openUrl() {
        System.out.println("opening the url in Google");
    }

    @Override
    public void testLoginPage() {
        System.out.println("testing login page in chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing chrome");
    }

}
class Safari extends WebDriver{

    @Override
    public void startBrowser() {
        System.out.println("Starting Safari");
    }

    @Override
    public void openUrl() {
        System.out.println("Opening the url in Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Safari");
    }
}
class FireFox extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting FireFox");
    }

    @Override
    public void openUrl() {
        System.out.println("Opening the url in FireFox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the FireFox");
    }
}