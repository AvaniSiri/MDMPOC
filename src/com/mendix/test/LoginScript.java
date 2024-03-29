package com.mendix.test;


import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.mendix.page.ProceesInfoPage;
import com.mendix.tool.Constants;
import com.mendix.tool.SharedDriver;
import com.mendix.util.HelperUtil;
import com.mendix.util.ResultUtil;
import com.mendix.util.DataProviderUtil.staticProviderClass;



public class LoginScript { 
	/**
	 * kill the task.
	 * @throws IOException 
	 */

	/*public WebDriver driver;

	public LoginScript(WebDriver driver){
		this.driver=driver;

	}*/

	@Test
	public static void tasKill() {
		ResultUtil.reporter.startTest("Kill All Running Task");
		try {
			Runtime.getRuntime().exec("taskkill /T /F /IM IEDriverServer.exe");
			Runtime.getRuntime().exec("taskkill /T /F /IM UFT.exe");
			Runtime.getRuntime().exec("taskkill /f /t /IM EXCEL.EXE");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Open browser.
	 */
	@Test
	public void openBrowser(){
		ResultUtil.reporter.startTest("Open Browser");
		SharedDriver.createDriver();
	}

	/**
	 * Login as LDR.
	 */

	@Test
	public void google_test(){
//		SharedDriver.pageContainer.loginPage.google();
		SharedDriver.pageContainer.loginPage.login("MDMM_BE01_LDR", "Heineken01");
	}
	
	
	@Test(dataProvider="HeiPort_Login",dataProviderClass=staticProviderClass.class)
	public void loginAsLDR(Map<String,String> dataMap){
		ResultUtil.reporter.startTest("Login As LDR");
		String opcoLogin= dataMap.get("OpCo");
		SharedDriver.pageContainer.loginPage.login("MDMM_"+opcoLogin+"_LDR","Heineken01");
	}

	@Test(dataProvider="HeiPort_Login",dataProviderClass=staticProviderClass.class)
	public void loginAsLDRVendor(Map<String,String> dataMap){

		ResultUtil.reporter.startTest("Login As LDR");
		String opcoLogin= dataMap.get("OpCo");
		//String Opco=opcoLogin.replaceAll("\\d","");
		//String OpL=Opco.length() < 2 ? Opco : Opco.substring(0, 2);
		SharedDriver.pageContainer.loginPage.login("MDVM_"+opcoLogin+"_LDR","Heineken01");
		//SharedDriver.pageContainer.loginPage.Login_as_LDR_Vendor_direct_environment("MDVM_"+opcoLogin+"_LDR","Heineken01");
	}
	
	@Test(dataProvider="HeiPort_Login",dataProviderClass=staticProviderClass.class)
	public void loginAsSGLDRVendor(Map<String,String> dataMap){

		ResultUtil.reporter.startTest("Login As LDR");
		String opcoLogin= dataMap.get("OpCo");
		String Opco=opcoLogin.replaceAll("\\d","");
		String OpL=Opco.length() < 2 ? Opco : Opco.substring(0, 2);
		SharedDriver.pageContainer.loginPage.login("MDVM_"+opcoLogin+"_LDR","Heineken01");
	}

	
	@Test(dataProvider="HeiPort_Login",dataProviderClass=staticProviderClass.class)
	public void loginAsLDRNAVMZCB(Map<String,String> dataMap){


		ResultUtil.reporter.startTest("Login As LDR");
		String opcoLogin= dataMap.get("OpCo");
		String Opco=opcoLogin.replaceAll("\\d","");
		String OpL=Opco.length() < 2 ? Opco : Opco.substring(0, 2);
		SharedDriver.pageContainer.loginPage.login("MDMM_"+OpL+"CB_LDR","Heineken01");
	}

	@Test(dataProvider="HeiPort_Login",dataProviderClass=staticProviderClass.class)
	public void loginAsLBDANAVMZCB(Map<String,String> dataMap){


		ResultUtil.reporter.startTest("Login As LBDA");
		String opcoLogin= dataMap.get("OpCo");
		String Opco=opcoLogin.replaceAll("\\d","");
		String OpL=Opco.length() < 2 ? Opco : Opco.substring(0, 2);
		SharedDriver.pageContainer.loginPage.login("MDMM_"+OpL+"CB_LBDA","Heineken01");
	}
	
	@Test(dataProvider="HeiPort_Login",dataProviderClass=staticProviderClass.class)
	public void loginAsLBDA(Map<String,String> dataMap){
		ResultUtil.reporter.startTest("Login As LBDA");
		String opcoLogin= dataMap.get("OpCo");
		//String Opco=opcoLogin.replaceAll("\\d","");
		//String OpL=Opco.length() < 4 ? Opco : Opco.substring(0, 4);
		SharedDriver.pageContainer.loginPage.login("MDMM_"+opcoLogin+"_LBDA","Heineken01");
	}



	@Test(dataProvider="HeiPort_Login",dataProviderClass=staticProviderClass.class)
	public void loginAsLBDASAPVendor(Map<String,String> dataMap){
		ResultUtil.reporter.startTest("Login As LBDA");
		String opcoLogin= dataMap.get("OpCo");
		String Opco=opcoLogin.replaceAll("\\d","");
		String OpL=Opco.length() < 2 ? Opco : Opco.substring(0, 2);
		SharedDriver.pageContainer.loginPage.login("MDVM_"+OpL+"01_LBDA","Heineken01");
	}
	
	@Test(dataProvider="HeiPort_Login",dataProviderClass=staticProviderClass.class)
	public void loginAsLBDAVendor(Map<String,String> dataMap){
		ResultUtil.reporter.startTest("Login As LBDA");
		String opcoLogin= dataMap.get("OpCo");
		//String Opco=opcoLogin.replaceAll("\\d","");
		//String OpL=Opco.length() < 2 ? Opco : Opco.substring(0, 2);
		SharedDriver.pageContainer.loginPage.login("MDVM_"+opcoLogin+"_LBDA","Heineken01");
	}
	

	@Test(dataProvider="HeiPort_Login",dataProviderClass=staticProviderClass.class)
	public void loginAsLDP(Map<String,String> dataMap){
		ResultUtil.reporter.startTest("Login As LDP");
		String opcoLogin= dataMap.get("OpCo");
		//String Opco=opcoLogin.replaceAll("\\d","");
		//String OpL=Opco.length() < 4 ? Opco : Opco.substring(0, 4);
		SharedDriver.pageContainer.loginPage.login("MDMM_"+opcoLogin+"_LDP","Heineken01");
	}
	
	@Test(dataProvider="HeiPort_Login",dataProviderClass=staticProviderClass.class)
	public void loginAsLDPNAVMZCB(Map<String,String> dataMap){
		ResultUtil.reporter.startTest("Login As LDP");
		String opcoLogin= dataMap.get("OpCo");
		String Opco=opcoLogin.replaceAll("\\d","");
		String OpL=Opco.length() < 2 ? Opco : Opco.substring(0, 2);
		SharedDriver.pageContainer.loginPage.login("MDMM_"+OpL+"CB_LDP","Heineken01");
	}

	
	@Test(dataProvider="HeiPort_Login",dataProviderClass=staticProviderClass.class)
	public void loginAsLDPSAPvendor(Map<String,String> dataMap){
		ResultUtil.reporter.startTest("Login As LDPSAPvendoe");
		String opcoLogin= dataMap.get("OpCo");
		String Opco=opcoLogin.replaceAll("\\d","");
		String OpL=Opco.length() < 2 ? Opco : Opco.substring(0, 2);
		SharedDriver.pageContainer.loginPage.login("MDVM_"+OpL+"01_LDP","Heineken01");
	}


	@Test(dataProvider="HeiPort_Login",dataProviderClass=staticProviderClass.class)
	public void loginAsLDSNAVMZCB(Map<String,String> dataMap){
		ResultUtil.reporter.startTest("Login As LDS");
		String opcoLogin= dataMap.get("OpCo");
		String Opco=opcoLogin.replaceAll("\\d","");
		String OpL=Opco.length() < 2 ? Opco : Opco.substring(0, 2);
		SharedDriver.pageContainer.loginPage.login("MDMM_"+OpL+"CB_LDS","Heineken01");
	}
	
	@Test(dataProvider="HeiPort_Login",dataProviderClass=staticProviderClass.class)
	public void loginAsLDS(Map<String,String> dataMap){
		ResultUtil.reporter.startTest("Login As LDS");
		String opcoLogin= dataMap.get("OpCo");
		//String Opco=opcoLogin.replaceAll("\\d","");
		//String OpL=Opco.length() < 4 ? Opco : Opco.substring(0, 4);
		SharedDriver.pageContainer.loginPage.login("MDMM_"+opcoLogin+"_LDS","Heineken01");
	}

	@Test(dataProvider="HeiPort_Login",dataProviderClass=staticProviderClass.class)
	public void loginAsVendorLDS(Map<String,String> dataMap){
		ResultUtil.reporter.startTest("Login As LDS");
		String opcoLogin= dataMap.get("OpCo");
		//String Opco=opcoLogin.replaceAll("\\d","");
		//String OpL=Opco.length() < 2 ? Opco : Opco.substring(0, 2);
		SharedDriver.pageContainer.loginPage.login("MDVM_"+opcoLogin+"_LDS","Heineken01");
	}

	

	@Test(dataProvider="HeiPort_Login",dataProviderClass=staticProviderClass.class)
	public void loginAsApprover(Map<String,String> dataMap){
		ResultUtil.reporter.startTest("Login As Next Level");
		String state = null;
		WebDriver driver= null;
		String opcoLogin= dataMap.get("OpCo");
		String Opco=opcoLogin.replaceAll("\\d","");
		String OpL=Opco.length() < 2 ? Opco : Opco.substring(0, 2);
		ProceesInfoPage myState = new ProceesInfoPage(driver);
		String stateInput= myState.state;
		if(stateInput.equalsIgnoreCase("GDA")) {
			SharedDriver.pageContainer.loginPage.login("MDM_GDA", "Heineken01");
		}
		SharedDriver.pageContainer.loginPage.login("MDMM_"+OpL+"01_"+stateInput+"","Heineken01");
	}
	
	@Test(dataProvider="HeiPort_Login",dataProviderClass=staticProviderClass.class)
	public void loginAsSGLDR(Map<String,String> dataMap){


		ResultUtil.reporter.startTest("Login As SGLDR");
		String opcoLogin= dataMap.get("OpCo");
		String Opco=opcoLogin.replaceAll("\\d","");
		String OpL=Opco.length() < 2 ? Opco : Opco.substring(0, 2);
		SharedDriver.pageContainer.loginPage.login("MDMM_"+OpL+"04_LDR","Heineken01");		
	}
	
	@Test(dataProvider="HeiPort_Login",dataProviderClass=staticProviderClass.class)
	public void loginAsGBLDR(Map<String,String> dataMap){


		ResultUtil.reporter.startTest("Login As SGLDR");
		String opcoLogin= dataMap.get("OpCo");
		//String Opco=opcoLogin.replaceAll("\\d","");
		//String OpL=Opco.length() < 2 ? Opco : Opco.substring(0, 2);
		SharedDriver.pageContainer.loginPage.login("MDMM_"+opcoLogin+"_LDR","Heineken01");
	}
 

//	@Test(dataProvider="HeiPort_Login",dataProviderClass=staticProviderClass.class)
//	public void loginAsLDS(Map<String,String> dataMap){
//		ResultUtil.reporter.startTest("Login As LDS");
//		String opcoLogin= dataMap.get("OpCo");
//		String Opco=opcoLogin.replaceAll("\\d","");
//		String OpL=Opco.length() < 2 ? Opco : Opco.substring(0, 2);
//		SharedDriver.pageContainer.loginPage.login("MDMM_"+OpL+"04_LDS","Heineken01");
//	}
	
	
	@Test(dataProvider="HeiPort_Login",dataProviderClass=staticProviderClass.class)
	public void loginAsSGLDSVendor(Map<String,String> dataMap){
		ResultUtil.reporter.startTest("Login As LDS");
		String opcoLogin= dataMap.get("OpCo");
		//String Opco=opcoLogin.replaceAll("\\d","");
		//String OpL=Opco.length() < 4 ? Opco : Opco.substring(0, 4);
		SharedDriver.pageContainer.loginPage.login("MDVM_"+opcoLogin+"_LDS","Heineken01");
	}
	
	@Test(dataProvider="HeiPort_Login",dataProviderClass=staticProviderClass.class)
	public void loginAsSGLDS(Map<String,String> dataMap){
		ResultUtil.reporter.startTest("Login As LDS");
		String opcoLogin= dataMap.get("OpCo");
		//String Opco=opcoLogin.replaceAll("\\d","");
		//String OpL=Opco.length() < 4 ? Opco : Opco.substring(0, 4);
		SharedDriver.pageContainer.loginPage.login("MDMM_"+opcoLogin+"_LDS","Heineken01");
		}


	@Test
	public void loginAsGBDA(){
		ResultUtil.reporter.startTest("Login As GBDA");
		//SharedDriver.createDriver();
		SharedDriver.pageContainer.loginPage.login("MDMM_GBDA", "Heineken01");		

	}

	@Test
	public void loginAsGDA(){
		ResultUtil.reporter.startTest("Login As GDA");
		//SharedDriver.createDriver();
//		Assert.assertTrue(SharedDriver.pageContainer.loginPage.login("MDM_GDA", "Heineken01"));		
		SharedDriver.pageContainer.loginPage.login("MDM_GDA", "Heineken01");

	}	
	

	@Test(dataProvider="HeiPort_Login",dataProviderClass=staticProviderClass.class)
	public void loginAsLDSVendor(Map<String,String> dataMap){
		ResultUtil.reporter.startTest("Login As LDS for Vendor Approval");
		//SharedDriver.createDriver();
		//		SharedDriver.pageContainer.loginPage.login_Vendor("MDVM_"+HelperUtil.executionConfigMap.get(Constants.OPCO)+"01_LDS","Heineken01");
		String opcoLogin= dataMap.get("OpCo");
		//String Opco=opcoLogin.replaceAll("\\d","");
		//String OpL=Opco.length() < 4 ? Opco : Opco.substring(0, 4);
		SharedDriver.pageContainer.loginPage.login("MDVM_"+opcoLogin+"_LDS","Heineken01");
	}

	/**
	 * Sets the up.
	 *
	 * @param context the new up
	 */
	@BeforeSuite
	public void setup(ITestContext context )
	{
		System.out.println("===========BeforeSuite "+context.getSuite().getName());
		ResultUtil.reporter.config()
		.documentTitle(context.getSuite().getName())
		.reportHeadline(context.getSuite().getName())
		.useExtentFooter(false);	

	}


}


