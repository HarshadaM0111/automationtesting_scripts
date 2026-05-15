package test.selenium_automation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTestNG {
	
	@AfterTest
	void display() {
		System.out.println("Everyone should attend the mock interview.");
	}

	@BeforeTest
	void show() {
		System.out.println("Tomorrow  is the mock interview");
	}
	@Test
	void demo(){
		System.out.println("Conducted at Fortune cloud.");
	}
}
