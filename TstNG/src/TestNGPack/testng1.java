package TestNGPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import org.testng.annotations.*;

public class testng1 {

	@BeforeClass
	void B4( ) {
		System.out.println("this is B4Class");}

	@AfterClass
	void after() {
		System.out.println("this is afterClass");}

	@BeforeMethod
	void login( ) {
		System.out.println("	this is login");}

	@AfterMethod
	void logout() {
		System.out.println("	this is logout");}

	@Test(priority=0)//open url
	void openURL(){
		System.out.println("		this is your URL1");}		
	
	@Test(priority=1)
	void search() {
		System.out.println("		this is search");}
		
	@Test(priority=2)
	void advsearch() {
		System.out.println("		this is advsearch");}
		
	@Test(priority=3)
	void recharge() {
		System.out.println("		this is recharge");}	
		

	
	
}
