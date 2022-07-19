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
	
