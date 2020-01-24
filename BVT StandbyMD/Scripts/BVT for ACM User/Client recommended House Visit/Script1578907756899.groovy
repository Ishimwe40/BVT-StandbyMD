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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://standbymd-qa3.globalexcel.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Choose your account/button_Client Sign-in'))

WebUI.setText(findTestObject('Object Repository/Client recommended House visit/Page_Sign in to your account/input_concat(Sorry but we  re having troubl_5aa0e7'), 
    'acm3@globalexcel.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Client recommended House visit/Page_Sign in to your account/input_Redirecting_passwd'), 
    'axFQsTjMQqya7oMWgLoxVA==')

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_Sign in to your account/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/div_No'))

WebUI.setText(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/input_Member_Member'), 
    'Laetitia Ishimwe')

WebUI.selectOptionByValue(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/select_CF Services (TII)LloydsManulifeOrion_fb81e2'), 
    '15', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/select_Arch                    Northbridge _472bd8'), 
    '56', true)

WebUI.setText(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/input_Policy _Policy'), 
    '123')

WebUI.setText(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/input_Case _ClaimRef'), 
    '12345')

WebUI.setText(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/input_Phone_Phone'), 
    '0788509927')

WebUI.setText(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/input_Email_Email'), 
    'laetitia.i@muraho.tech')

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/button_Save'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/input_DOB_DOB'))

WebUI.sendKeys(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/input_DOB_DOB'), 
    '12121988')

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/img_Gender_img-responsive'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/label_Symptom Selector'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/button_Next'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/div_Map DataMap data 2020 GoogleMap DataMap_78bc35'))

WebUI.setText(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/input_Terms of Use_Address'), 
    'kigali')

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/div_Headache'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/button_Next_1_2'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/button_Yes'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/button_'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/button_Next_1_2_3'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/label_Mild'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/label_Less than 3 months'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/label_No'))

not_run: WebUI.click(findTestObject('Page_StandbyMD Directional Care/label_No'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/label_All over'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/label_Stabbing or piercing'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/button_Next_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/label_Over sensitivity to light'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/button_Next_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/div_Cashless Service'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/button_Select'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/span_Pharmacy Divine'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/button_Next_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/button_Ok'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/select_HouseHotel'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/i_City_fas fa-search'))

WebUI.setText(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/input_City_CityName'), 
    'kigali')

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/i_City_fas fa-search_1'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/button_Select_1'))

WebUI.setText(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/input_Country_HCZip'), 
    '12')

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/button_Next_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/a_Contact'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/a_Service'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/a_Triage'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/i_Coordinate Summary_fas fa-sync-alt fa-2x'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/i_Coordinate Summary_far fa-clipboard fa-2x'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/span_Submit Request'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/button_Done'))

WebUI.click(findTestObject('Object Repository/Client recommended House visit/Page_StandbyMD Directional Care/i_Ishimwe Laetitia_fas fa-sign-out-alt'))

WebUI.click(findTestObject('Login-Logout/Page_StandbyMD Directional Care/button_Yes'))

WebUI.closeBrowser()

