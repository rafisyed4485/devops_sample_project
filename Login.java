package capg;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
 
public class Login {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver =new ChromeDriver();
		
		//Selenium implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("rafisyed4485@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Rafi@5012");
		
		//click on Login Button
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		
		//Get Error message
		String s2=driver.findElement(By.cssSelector("div._9ay7")).getText();
		System.out.println(s2+"Executed");
				
		Thread.sleep(1000);
		//Re Enter Password
		driver.findElement(By.id("pass")).sendKeys("Rafi@5011");
		
		Thread.sleep(1000);
		//Again click on Login Button
		//driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		driver.findElement(By.name("login")).click();
		
		
		Thread.sleep(1000);
		//Click search button
		driver.findElement(By.xpath("(//*[@placeholder='Search Facebook'])[1]")).sendKeys("Bjs hub");
		
		
		//Auto Complete dropdown by using FindElements() with return type WebElement
		Thread.sleep(3000);
		List<WebElement> options=driver.findElements(By.xpath("//li[@class='mfclru0v']//span"));
		
		
		for(WebElement element: options)
		{
			if(element.getText().equals("bjshub hiring"))
			{
				System.err.println(element.getText());
				
				element.click();
				break;
			}
			
		}
		
		//By using input enter for dropdown
		//driver.findElement(By.xpath("//input[@placeholder='Search Facebook']")).sendKeys(Keys.ENTER);
		

		//Select from Search results
		driver.findElement(By.linkText("Bangalore Job Seeker's")).click();
		
		//Go to Home
		driver.findElement(By.xpath("(//*[@class='b6ax4al1 m4pnbp5e somyomsx ahndzqod gnhxmgs4'])[1]")).click();
		
		
		Thread.sleep(3000);
		//driver.close();
		
		/*
		
		//Add profile pic
		driver.findElement(By.xpath("(//*[@class='b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken tr46kb4q'])[1]")).click();
		
		//upload photo
		//driver.findElement(By.xpath("(//*[@class='b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken'])[3]")).click();
		Thread.sleep(1000);
		
		//cancel upload
		driver.findElement(By.xpath("(//*[@class='gneimcpu oee9glnz'])[2]")).click();

		Thread.sleep(1000);
		*/
		
		
		Thread.sleep(3000);
		//Go to Home
		driver.findElement(By.xpath("(//*[@class='b6ax4al1 m4pnbp5e somyomsx ahndzqod gnhxmgs4'])[1]")).click();
		
		//click on notifications
		//driver.findElement(By.xpath("(//*[@aria-label='Notifications'])[1]")).click();
		
		Thread.sleep(3000);
		//other way to click on notifications
		driver.findElement(By.xpath("//*[name()='path' and contains(@d, 'M7.847 23.488C9.207 23.488 11.443 23.363')]")).click();
				
		driver.findElement(By.xpath("//*[text()=' posted a new video: IT_Troll :-']")).click();
		
		Thread.sleep(3000);
		//click on cancel 
		driver.findElement(By.cssSelector("div[class*='qi72231t n3hqoq4p r86q59rh b3qcqh3k fq87ekyn fsf7x5fv s5oniofx m8h3af8h l7ghb35v kjdc1dyq kmwttqpk cr00lzj9 rn8ck1ys s3jn8y49 f14ij5to l3ldwz01 icdlwmnq i85zmo3j qmqpeqxj e7u6y3za qwcclf47 nmlomj2f frfouenu bonavkto djs4p424 r7bn319e bdao358l alzwoclg jcxyg2ei srn514ro oxkhqvkx rl78xhln nch0832m om3e55n1 nq2b4knc bis24fgy kl0yapha qsbzbi57']")).click();
		
		//Go to Home
		driver.findElement(By.xpath("(//*[@class='b6ax4al1 m4pnbp5e somyomsx ahndzqod gnhxmgs4'])[1]")).click();
		
		Thread.sleep(3000);
		//Click on My Profile
		driver.findElement(By.xpath("//span[contains(text(),'Rafi Syed')]")).click();
		
		//Select Profile
		driver.findElement(By.xpath("//*[@aria-label='Your profile']")).click();
		
		//Logout
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[normalize-space()='Log Out']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		
		Thread.sleep(1000);
		driver.close();
		
		//driver.findElement(By.xpath("(//image[@preserveAspectRatio='xMidYMid slice']")).click();
	
		
	}

}
