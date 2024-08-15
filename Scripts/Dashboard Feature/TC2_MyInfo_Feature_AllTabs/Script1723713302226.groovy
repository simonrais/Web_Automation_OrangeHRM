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

WebUI.click(findTestObject('Object Repository/DashboardPage/MyInfo_Feature/a_Contact Details'))

WebUI.verifyElementPresent(findTestObject('DashboardPage/MyInfo_Feature/div_Contact DetailsAddressStreet 1Street 2CityStateProvinceZipPostal CodeCountry-- Select --TelephoneHomeMobileWorkEmailWork EmailOther Email  Required Save'), 
    2)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/DashboardPage/MyInfo_Feature/a_Emergency Contacts'))

WebUI.verifyElementPresent(findTestObject('DashboardPage/MyInfo_Feature/div_manda userPersonal DetailsContact DetailsEmergency ContactsDependentsImmigrationJobSalaryReport-toQualificationsMembershipsAssigned Emergency Contacts Add No Records FoundNameRelationshipHome TelephoneMobileWork Tele'), 
    0)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/DashboardPage/MyInfo_Feature/a_Dependents'))

WebUI.verifyElementPresent(findTestObject('DashboardPage/MyInfo_Feature/div_manda userPersonal DetailsContact DetailsEmergency ContactsDependentsImmigrationJobSalaryReport-toQualificationsMembershipsAssigned Dependents Add No Records FoundNameRelationshipDate of BirthActionsAttachments Add N'), 
    0)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/DashboardPage/MyInfo_Feature/a_Immigration'))

WebUI.verifyElementPresent(findTestObject('DashboardPage/MyInfo_Feature/div_manda userPersonal DetailsContact DetailsEmergency ContactsDependentsImmigrationJobSalaryReport-toQualificationsMembershipsAssigned Immigration Records Add (1) Record FoundDocumentNumberIssued ByIssued DateExpiry Dat'), 
    0)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/DashboardPage/MyInfo_Feature/a_Job'))

WebUI.verifyElementPresent(findTestObject('DashboardPage/MyInfo_Feature/div_manda userPersonal DetailsContact DetailsEmergency ContactsDependentsImmigrationJobSalaryReport-toQualificationsMembershipsJob DetailsJoined DateJob TitleHR ManagerJob SpecificationNot DefinedJob CategoryOfficials an'), 
    0)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/DashboardPage/MyInfo_Feature/a_Salary'))

WebUI.verifyElementPresent(findTestObject('DashboardPage/MyInfo_Feature/div_manda userPersonal DetailsContact DetailsEmergency ContactsDependentsImmigrationJobSalaryReport-toQualificationsMembershipsAssigned Salary ComponentsNo Records FoundSalary ComponentAmountCurrencyPay FrequencyDirect D'), 
    0)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/DashboardPage/MyInfo_Feature/a_Report-to'))

WebUI.verifyElementPresent(findTestObject('DashboardPage/MyInfo_Feature/div_manda userPersonal DetailsContact DetailsEmergency ContactsDependentsImmigrationJobSalaryReport-toQualificationsMembershipsReport toAssigned SupervisorsNo Records FoundNameReporting MethodAssigned Subordinates(1) Rec'), 
    0)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/DashboardPage/MyInfo_Feature/a_Qualifications'))

WebUI.verifyElementPresent(findTestObject('DashboardPage/MyInfo_Feature/div_manda userPersonal DetailsContact DetailsEmergency ContactsDependentsImmigrationJobSalaryReport-toQualificationsMembershipsQualificationsWork Experience Add (1) Record FoundCompanyJob TitleFromToCommentActionsTCSTEST'), 
    0)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/DashboardPage/MyInfo_Feature/a_Memberships'))

WebUI.verifyElementPresent(findTestObject('DashboardPage/MyInfo_Feature/div_manda userPersonal DetailsContact DetailsEmergency ContactsDependentsImmigrationJobSalaryReport-toQualificationsMembershipsAssigned Memberships Add No Records FoundMembershipSubscription Paid BySubscription AmountCur'), 
    0)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/DashboardPage/MyInfo_Feature/span_manda user'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/DashboardPage/MyInfo_Feature/a_Logout'))

