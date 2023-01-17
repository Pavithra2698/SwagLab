package com.login;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.Baseclass;
import com.pom.Pom_Login;

public class Login extends Baseclass {

	public static WebDriver driver=launch(); //ref name
	
	Pom_Login obj=new Pom_Login(driver);
	
	@BeforeMethod
	@Test(priority = -1)
	private void URLlaunch() throws IOException {
		url("https://www.saucedemo.com/");
	
		Screenshot("url launch");
	}	

	@Test(priority=0)
	private void Login_Tc002() throws IOException {
		String data1 = data_Pass("login testcase",9,5);
		sendkeys(obj.getUser(), data1);
		String data2 = data_Pass("login testcase",10,5);
		sendkeys(obj.getPassword(), data2);
		click(obj.getClick());
		
		Screenshot("Login_Tc002");
	}
	
	@Test(priority = 1)
	private void Login_Tc003() throws IOException {
		String data = data_Pass("login testcase",11,5);
		sendkeys(obj.getUser(), data); 
		String data2= data_Pass("login testcase",12,5);
		sendkeys(obj.getPassword(), data2);
		click(obj.getClick());
		
		Screenshot("Login_Tc003");
	}
	
	@Test(priority=2)
	private void Login_Tc004() throws IOException {	
		String data = data_Pass("login testcase",13,5);
		sendkeys(obj.getUser(), data);
		String data2 = data_Pass("login testcase",14,5);
		sendkeys(obj.getPassword(), data2);
		click(obj.getClick());
		
		Screenshot("Login_Tc004");
	}
	
	@Test(priority=3)
	private void Login_Tc005() throws IOException {	
		String data = data_Pass("login testcase",15,5);
		sendkeys(obj.getUser(), data);
		String data2 = data_Pass("login testcase",16,5);
		sendkeys(obj.getPassword(), data2);
		click(obj.getClick());
		
		Screenshot("Login_Tc005");
	}
	
	@Test(priority=4)
	private void Login_Tc006() throws IOException {
		String data = data_Pass("login testcase", 17, 5);
		sendkeys(obj.getUser(), data);
		String data2 = data_Pass("login testcase", 18, 5);
		sendkeys(obj.getPassword(), data2);
		click(obj.getClick());
		
		Screenshot("Login_Tc006");
	}
		 
	@Test(priority=5)
	private void Login_Tc007() throws IOException {	
		String data = data_Pass("login testcase",19,5);
		sendkeys(obj.getUser(), data);
		String data2 = data_Pass("login testcase",20,5);
		sendkeys(obj.getPassword(), data2);
		click(obj.getClick());
		
		Screenshot("Login_Tc007");
	}

	@Test(priority=6)
	private void Login_Tc008() throws IOException {
		String data = data_Pass("login testcase",21,5);
		sendkeys(obj.getUser(), data);
		String data2 = data_Pass("login testcase",22,5);
		sendkeys(obj.getPassword(), data2);
		click(obj.getClick());
		
		Screenshot("Login_Tc008");
	}

	@Test(priority=7)
	private void Login_Tc009() throws IOException {	
		String data = data_Pass("login testcase",23,5);
		sendkeys(obj.getUser(), data);
		String data2 = data_Pass("login testcase",24,5);
		sendkeys(obj.getPassword(), data2);
		click(obj.getClick());
		
		Screenshot("Login_Tc009");
	}
	
	
	@Test(priority=8)
	private void Login_Tc010() throws IOException {
		String data = data_Pass("login testcase",25,5);
		sendkeys(obj.getUser(), data);
		click(obj.getClick());
		
		Screenshot("Login_Tc010");
	}
	

	@Test(priority=9)
	private void Login_Tc011() throws IOException {
		String data2 = data_Pass("login testcase",28,5);
		sendkeys(obj.getPassword(), data2);
		click(obj.getClick());
		
		Screenshot("Login_Tc011");
	}

	@Test(priority=10)
	private void Login_Tc012() throws IOException {
		click(obj.getClick());
		
		Screenshot("Login_Tc012");
}
	


	
}
