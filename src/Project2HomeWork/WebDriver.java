package Project2HomeWork;

public interface WebDriver {
    void open();
    void closed();
    String getTitle();
}
interface TakesScreenshot{
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver,TakesScreenshot{
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open() {

    }

    @Override
    public void closed() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {

    }

    @Override
    public void navigate() {

    }
}
class FirefoxDriver implements RemoteWebDriver{
    @Override
    public void open() {

    }

    @Override
    public void closed() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {

    }

    @Override
    public void navigate() {

    }
}
class SafariDriver implements RemoteWebDriver{
    @Override
    public void open() {

    }

    @Override
    public void closed() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {

    }

    @Override
    public void navigate() {

    }
}