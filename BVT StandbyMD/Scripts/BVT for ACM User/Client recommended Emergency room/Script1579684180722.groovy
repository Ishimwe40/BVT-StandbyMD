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

WebUI.click(findTestObject('Page_Choose your account/button_Client Sign-in'))

WebUI.setText(findTestObject('Page_Sign in to your account/input_concat(Sorry but we  re having troubl_5aa0e7'), 'acm3@globalexcel.com')

WebUI.setEncryptedText(findTestObject('Page_Sign in to your account/input_Redirecting_passwd'), 'axFQsTjMQqya7oMWgLoxVA==')

WebUI.click(findTestObject('Page_Sign in to your account/button_Sign in'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/div_No'))

WebUI.setText(findTestObject('Page_StandbyMD Directional Care/input_Member_Member'), 'Laetitia Ishimwe')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_StandbyMD Directional Care/select_OrionOtherSTARR  CanadaSTARR  US'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_StandbyMD Directional Care/select_STARR  Canada'), '20', 
    true)

WebUI.setText(findTestObject('Page_StandbyMD Directional Care/input_Policy _Policy'), '5')

WebUI.setText(findTestObject('Page_StandbyMD Directional Care/input_Case _ClaimRef'), '7')

WebUI.setText(findTestObject('Page_StandbyMD Directional Care/input_Phone_Phone'), '0788509927')

WebUI.setText(findTestObject('Page_StandbyMD Directional Care/input_Email_Email'), 'laetitia.i@muraho.tech')

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_Save'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/input_DOB_DOB'))

WebUI.sendKeys(findTestObject('Page_StandbyMD Directional Care/input_DOB_DOB'), '01181958')

WebUI.click(findTestObject('Page_StandbyMD Directional Care/img_Gender_img-responsive'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/label_Symptom Selector'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_Next'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_Next_1'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/div_Headache'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/div_Fever'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/div_Feeling sick'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/div_Cough'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_Next_1_2'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button__1'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button__1'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button__1'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button__1'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_Next_1_2_3'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/label_Severe'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/label_No'))

WebUI.click(findTestObject('Object Repository/Page_StandbyMD Directional Care/label_More than 8 weeks'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/label_Less than 3 months'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/label_Less than 3 months'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_Select'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/a_Contact'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/a_Service'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/a_Triage'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/i_Coordinate Summary_fas fa-sync-alt fa-2x'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/span_Submit Request'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_Done'))

WebUI.closeBrowser()

