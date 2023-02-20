package HomeWork25;

public interface WebDriver {
    /*
    Create a WebDriver Interface that will have the following unimplemented behaviour:
     openBrowser(), closeBrowser(), maximizeWindow(), findElement().
     Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */
    void openBrowser();
    void maximizeWindow();
    void findElement();
    void closeBrowser();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Google Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Many windows in Chrome");
    }

    @Override
    public void findElement() {
        System.out.println("Find elements in Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Google Chrome");
    }
}

class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Firefox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Many windows in Firefox");
    }

    @Override
    public void findElement() {
        System.out.println("Find elements in Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Firefox");
    }
}