package TestNGPack;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class testng2 {
	
	@BeforeMethod
	void login( ) {
		System.out.println("this is login");
	}

	@AfterMethod
	void logout() {
		System.out.println("this is logout");		
	}

	@Test
	void search() {
		System.out.println("  this is search");
	}
}	
