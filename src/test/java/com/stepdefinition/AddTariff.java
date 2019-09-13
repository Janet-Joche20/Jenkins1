package com.stepdefinition;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTariff {

	static WebDriver driver;
	
	@Given("User should be in the telecom Home page")
	public void user_should_be_in_the_telecom_Home_page() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jeni\\eclipse-workspace\\cucumberProject\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("user click on add tariff plan button")
	public void user_click_on_add_tariff_plan_button() {
		
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	   	}


	@Then("user should be displayed Your Tariff added")
	public void user_should_be_displayed_Your_Tariff_added() {

		WebElement tariffPlan = driver.findElement(By.xpath("//h2[contains(text(),'Congratulation')]"));
		Assert.assertTrue(tariffPlan.isDisplayed());
		
	}
	
	//1D List
	@When("user enter all the field with valid charges")
	public void user_enter_all_the_field_with_valid_charges(DataTable dataTable) {
		
		List<String> datas = dataTable.asList(String.class);
		
		driver.findElement(By.id("rental1")).sendKeys(datas.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(datas.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(datas.get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(datas.get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(datas.get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(datas.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(datas.get(6));
		
	}
	
	//2D List
	@When("user enter all the field with valid chargess")
	public void user_enter_all_the_field_with_valid_chargess(DataTable dataTable) {
		

		List<List<String>> datas = dataTable.asLists(String.class);
		
		driver.findElement(By.id("rental1")).sendKeys(datas.get(1).get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(datas.get(1).get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(datas.get(1).get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(datas.get(1).get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(datas.get(1).get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(datas.get(1).get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(datas.get(1).get(6));
		
		
	}
	
	//2D Map
	/*@When("user enter all the fields with valid chargess")
	public void user_enter_all_the_fields_with_valid_chargess(DataTable dataTable) {
		
		List<Map<String, String>> datas = dataTable.asMaps(String.class,String.class);
		
		driver.findElement(By.id("rental1")).sendKeys(data;
		driver.findElement(By.id("local_minutes")).sendKeys(B);
		driver.findElement(By.id("inter_minutes")).sendKeys(C);
		driver.findElement(By.id("sms_pack")).sendKeys(D);
		driver.findElement(By.id("minutes_charges")).sendKeys(E);
		driver.findElement(By.id("inter_charges")).sendKeys(F);
		driver.findElement(By.id("sms_charges")).sendKeys(G);
		
	}*/
	
	@When("user enter all the field with valid chargess{string}{string}{string}{string}{string}{string}{string}")
	public void user_enter_all_the_field_with_valid_chargess(String A, String B, String C, String D, String E, String F, String G) {
	   
		
		driver.findElement(By.id("rental1")).sendKeys(A);
		driver.findElement(By.id("local_minutes")).sendKeys(B);
		driver.findElement(By.id("inter_minutes")).sendKeys(C);
		driver.findElement(By.id("sms_pack")).sendKeys(D);
		driver.findElement(By.id("minutes_charges")).sendKeys(E);
		driver.findElement(By.id("inter_charges")).sendKeys(F);
		driver.findElement(By.id("sms_charges")).sendKeys(G);
		
	}
	
	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {
	
		driver.findElement(By.name("submit")).click();
	}

	
}
