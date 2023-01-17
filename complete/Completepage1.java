package com.complete;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.baseclass.Baseclass;
import com.pom.Pom_Completepage;
import com.pom.Pom_Informationpage;


public class Completepage1 extends Baseclass {
	public static WebDriver driver;
	public static Pom_Completepage obj;  //obj is a ref var
	
	@Test(priority=-1)
	private void Tc_001() throws IOException {
		driver=launch();
		url("https://www.saucedemo.com/");
	}
	
	@Test(priority = 1)
	private void Tc_002() throws IOException {
 		obj=new Pom_Completepage(driver);//
 		String data_Pass = data_Pass("info testcase", 9, 5);
		sendkeys(obj.getUser(), data_Pass);
		String data_Pass2 = data_Pass("info testcase", 10, 5);
		sendkeys(obj.getPassword(), data_Pass2);
		click(obj.getClick());
	}
		
	@Test(priority=2)
	private void Tc_003() throws IOException {
		obj=new Pom_Completepage(driver);//
		click(obj.getCart());
	}
	
	@Test(priority = 3)
	private void Tc_004() throws IOException {
		obj=new Pom_Completepage(driver);//
		click(obj.getCheckout());
	}
	

	@Test(priority = 4)
	private void Tc_005() throws IOException {
		obj=new Pom_Completepage(driver);//
		String data_Pass = data_Pass("info testcase", 36, 5);
		sendkeys(obj.getFirstname(), data_Pass);
		String data_Pass2 = data_Pass("info testcase", 37, 5);
		sendkeys(obj.getLastname(), data_Pass2);
		String data_Pass3 = data_Pass("info testcase", 38, 5);
		sendkeys(obj.getPostal(), data_Pass3);
	}
	
	@Test(priority = 5)
	private void Tc_006() throws IOException  {
		obj=new Pom_Completepage(driver);//
		click(obj.getCaryon());
	}
	
	@Test(priority = 6)
	private void Tc_007() {
		obj=new Pom_Completepage(driver);//
		click(obj.getFinish());
	}
	
	@Test(priority=7)
	private void Tc_008() throws IOException {
		obj=new Pom_Completepage(driver);//
		click(obj.getBackhome());
		Screenshot("Backhome-ID1");

	}
}

