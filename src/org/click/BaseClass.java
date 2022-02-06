package org.click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elanchezhiyan\\eclipse-workspace\\Gana\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='username']"));
		txtUserName.sendKeys("ganapathi12345");
		
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='password']"));
		txtPass.sendKeys("123456789@mg");
		
		WebElement btnLogin = driver.findElement(By.xpath("//input[@id='login']"));
		btnLogin.click();
		
		WebElement dropSelect = driver.findElement(By.xpath("//select[@id='location']"));
		Select select = new Select(dropSelect);
		select.selectByIndex(3);
		
		WebElement dropHotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select select1 = new Select(dropHotels);
		select1.selectByIndex(2);
		
		WebElement dropRoom = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select select2 = new Select(dropRoom);
		select2.selectByIndex(2);
		
		WebElement dropRoomNo = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select select3 = new Select(dropRoomNo);
		select3.selectByIndex(3);
		
		WebElement txtDateIn = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		txtDateIn.sendKeys("14/02/2022");
		
		WebElement txtDateOut = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		txtDateOut.sendKeys("25/02/2022");
		
		WebElement dropAdultRoom = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select select4 = new Select(dropAdultRoom);
		select4.selectByIndex(3);
		
		WebElement dropChildRoom = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select select5 = new Select(dropChildRoom);
		select5.selectByIndex(0);
		
		WebElement btnSearch = driver.findElement(By.xpath("//input[@id='Submit']"));
		btnSearch.click();
		
		WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
		btnRadio.click();
		
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
		
		WebElement txtName = driver.findElement(By.xpath("//input[@id='first_name']"));
		txtName.sendKeys("Ganapathi");
		
		WebElement txtLastName = driver.findElement(By.xpath("//input[@id='last_name']"));
		txtLastName.sendKeys("Manoharan");
		
		WebElement txtAdd = driver.findElement(By.xpath("//textarea[@id='address']"));
		txtAdd.sendKeys("Greens Technology-Thuraipakkam, OMR");
		
		WebElement txtCreditCard = driver.findElement(By.xpath("//input[@id='cc_num']"));
		txtCreditCard.sendKeys("9988776655443322");
		
		WebElement dropCCType = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select select6 = new Select(dropCCType);
		select6.selectByIndex(2);
		
		WebElement dropMonth = driver.findElement(By.id("cc_exp_month"));
		Select select7 = new Select(dropMonth);
		select7.selectByIndex(2);
		
		WebElement dropYear = driver.findElement(By.id("cc_exp_year"));
		Select select8 = new Select(dropYear);
		select8.selectByIndex(2);
		
		WebElement txtCVVNum = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		txtCVVNum.sendKeys("8888");
		
		WebElement btnBook = driver.findElement(By.id("book_now"));
		btnBook.click();
		
		Thread.sleep(5000);
		
		WebElement txtPNR = driver.findElement(By.id("order_no"));
		String attribute = txtPNR.getAttribute("value");
		System.out.println(attribute);
		
		
		
		
		
		
		
	}

}
