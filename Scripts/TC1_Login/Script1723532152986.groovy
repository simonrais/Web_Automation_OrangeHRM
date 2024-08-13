import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/LoginPage/input_Username_username'), 'Admin')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/LoginPage/button_Login'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('DashboardPage/Navigasi/ul_AdminPIMLeaveTimeRecruitmentMy InfoPerformanceDashboardDirectoryMaintenanceClaimBuzz'), 
    2)

WebUI.scrollToElement(findTestObject('DashboardPage/Navigasi/p_2005 - 2024 OrangeHRM, Inc. All rights reserved'), 3)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/LoginPage/i_Upgrade_oxd-icon bi-caret-down-fill oxd-u_ca92f9'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/LoginPage/a_Logout'))

WebUI.delay(3)

WebUI.closeBrowser()

