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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/DashboardPage/MyInfo_Feature/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/DashboardPage/MyInfo_Feature/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/DashboardPage/MyInfo_Feature/button_Login'))

WebUI.click(findTestObject('Object Repository/DashboardPage/MyInfo_Feature/a_My Info'))

WebUI.verifyElementPresent(findTestObject('DashboardPage/MyInfo_Feature/div_Personal DetailsEmployee Full NameEmployee IdOther IdDrivers License NumberLicense Expiry DateNationalityAlbanianMarital StatusSingleDate of BirthGenderMaleFemale  Required Save'), 
    3)

WebUI.sendKeys(findTestObject('DashboardPage/MyInfo_Feature'), Keys.chord(Keys.PAGE_DOWN))

WebUI.delay(3)

WebUI.setText(findTestObject('DashboardPage/MyInfo_Feature/PersonalDetails/input_Employee Full Name_firstName'), 'Arkhan')

WebUI.delay(3)

WebUI.setText(findTestObject('DashboardPage/MyInfo_Feature/PersonalDetails/input_Employee Full Name_middleName'), 'Yuhu')

WebUI.delay(3)

WebUI.setText(findTestObject('DashboardPage/MyInfo_Feature/PersonalDetails/input_Employee Full Name_lastName'), 'Tester')

WebUI.delay(3)

WebUI.click(findTestObject('DashboardPage/MyInfo_Feature/PersonalDetails/buttonSave'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('DashboardPage/MyInfo_Feature/PersonalDetails/div_SuccessSuccessfully Updated'), 
    3)

WebUI.click(findTestObject('Object Repository/DashboardPage/MyInfo_Feature/span_manda user'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/DashboardPage/MyInfo_Feature/a_Logout'))

WebUI.closeBrowser()

