/**
 * Created by felip_000 on 05/04/16.
 */



import org.openqa.selenium.chrome.ChromeDriver

driver = {
    File file = new File("C:/Users/felip_000/Documents/SeleniumChromeDriver/chromedriver.exe");


    System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
    new ChromeDriver();
}

baseUrl = "http://localhost:8070/"


