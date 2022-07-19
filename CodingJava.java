import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class CodingJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dewayani\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.imdb.com/title/tt9389998/?ref_=nv_sr_srsg_0"); //hit url on browser
		System.out.println(driver.getTitle()); //validate if page title is correct.
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl()); //validate if landed on correct url
		String Releasedate = driver.findElement(By.xpath("//div[@class=\"ipc-metadata-list-item__content-container\"]//following::ul[@class=\"ipc-inline-list ipc-inline-list--show-dividers ipc-inline-list--inline ipc-metadata-list-item__list-content base\"]//following::li[@class=\"ipc-inline-list__item\"]//following::a[@href=\"/title/tt9389998/releaseinfo?ref_=tt_dt_rdat\" and @class=\"ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link\"]")).getText();
		String Country = driver.findElement(By.xpath("//div[@class=\"ipc-metadata-list-item__content-container\"]//following::ul[@class=\"ipc-inline-list ipc-inline-list--show-dividers ipc-inline-list--inline ipc-metadata-list-item__list-content base\"]//following::li[@class=\"ipc-inline-list__item\"]//following::a[@href=\"/search/title/?country_of_origin=IN&ref_=tt_dt_cn\" and @class=\"ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link\"]")).getText();
		System.out.println(Releasedate + " is ReleaseDate");
		System.out.println(Country + " is Country");
		
		
		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise"); //hit url on browser
		driver.manage().window().maximize();
		System.out.println(driver.getTitle()); //validate if page title is correct.
		System.out.println(driver.getCurrentUrl()); //validate if landed on correct url
		String ReleasedateSecond = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[12]/td/div/ul/li")).getText();
		String CountrySecond = driver.findElement(By.xpath("//*[text()=\"Country\"]//following::td[text()=\"India\"]")).getText();
		System.out.println(ReleasedateSecond + " is ReleasedateSecond");
		System.out.println(CountrySecond + " is CountrySecond");
		
		driver.close();
		
		if(Releasedate!=ReleasedateSecond)
		{
		Assert.assertNotEquals(Releasedate, ReleasedateSecond);
		System.out.println("Dates are not same");
		}
	
		if(Country!=CountrySecond)
		{
		Assert.assertEquals(Country, CountrySecond);
		System.out.println("Country is same");
		}
	
	}

}
