package com.testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.baseclass.Baseclass;
import com.pom.Pom_Informationpage;

public class Informationpage4 extends Baseclass {

	public static WebDriver driver;
	public static Pom_Informationpage obj;  //obj is a ref var
	
	@Test(priority=-1)
	private void Tc_001() throws IOException {
		driver=launch();
		url("https://www.saucedemo.com/");
	}

 	@Test(priority = 1)
	private void Tc_002() throws IOException {
 		obj=new Pom_Informationpage(driver);//
 		String data_Pass = data_Pass("info testcase", 13, 5);
		sendkeys(obj.getUser(), data_Pass);
		String data_Pass2 = data_Pass("info testcase", 14, 5);
		sendkeys(obj.getPassword(), data_Pass2);
		click(obj.getClick());
	}
		
	@Test(priority=2)
	private void Tc_003() throws IOException {
		 obj=new Pom_Informationpage(driver);//
		click(obj.getCart());
	}

	@Test(priority = 3)
	private void Tc_004() throws IOException {
		obj=new Pom_Informationpage(driver);//
		click(obj.getCheckout());
	}
	
	@Test(priority = 4)
	private void Tc_005() throws IOException {
		obj=new Pom_Informationpage(driver);//
		String data_Pass = data_Pass("info testcase", 25, 5);
		sendkeys(obj.getFirstname(), data_Pass);
		String data_Pass2 = data_Pass("info testcase", 26, 5);
		sendkeys(obj.getLastname(), data_Pass2);
		click(obj.getCaryon());
		Screenshot("Info_ID4-datapass1");
	}
	
	@Test(priority = 5)
	private void Tc_006() throws IOException  {
		obj=new Pom_Informationpage(driver);//	
		click(obj.getCancel());
		Screenshot("Info_ID4-CANCEL");	
	}

	@Test(priority = 6)
	private void reclickoncheckout1() {
		obj=new Pom_Informationpage(driver);//
		click(obj.getCheckout());	
	}
	
	@Test(priority = 7)
	private void Tc_007() throws IOException {
		obj=new Pom_Informationpage(driver);//
		String data_Pass = data_Pass("info testcase", 34, 5);
		sendkeys(obj.getLastname(), data_Pass);
		String data_Pass2 = data_Pass("info testcase", 35, 5);
		sendkeys(obj.getPostal(), data_Pass2);
		click(obj.getCaryon());
		Screenshot("Info_ID4-datapass2");
	}

	@Test(priority = 8)
	private void cancel2() throws IOException  {
		obj=new Pom_Informationpage(driver);//	
		click(obj.getCancel());
	}

	@Test(priority = 9)
	private void reclickoncheckout2() {
		obj=new Pom_Informationpage(driver);//
		click(obj.getCheckout());	
	}
	

	@Test(priority = 10)
	private void Tc_008() throws IOException {
		obj=new Pom_Informationpage(driver);//
		String data_Pass = data_Pass("info testcase", 42, 5);
		sendkeys(obj.getFirstname(), data_Pass);
		String data_Pass2 = data_Pass("info testcase", 43, 5);
		sendkeys(obj.getLastname(), data_Pass2);
		String data_Pass3 = data_Pass("info testcase", 44, 5);
		sendkeys(obj.getPostal(), data_Pass3);
		Screenshot("Info_ID4-datapass3");
	}

	@Test(priority = 11)
	private void Tc_009() throws IOException  {
		obj=new Pom_Informationpage(driver);
		click(obj.getCaryon());
		Screenshot("Info_ID4-CONTINUE");
	}
	
}


