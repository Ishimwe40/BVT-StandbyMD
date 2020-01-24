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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://standbymd-qa3.globalexcel.com/')

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_Choose your account/button_Client Sign-in'))

WebUI.setText(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_Sign in to your account/input_concat(Sorry but we  re having troubl_5aa0e7'), 
    'gem3@globalexcel.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_Sign in to your account/input_Redirecting_passwd'), 
    'axFQsTjMQqya7oMWgLoxVA==')

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_Sign in to your account/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/div_No'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/input_DOB_DOB'))

WebUI.sendKeys(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/input_DOB_DOB'), 
    '10271957')

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/label_Male'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/label_NLP (English Only)'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/button_Next'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/button_Next_1'))

WebUI.setText(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/textarea_Describe the members symptoms or p_874eed'), 
    'Headache\nFever')

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/div_Headache'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/div_Fever'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/button_Next_1_2'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/button_'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/button__1'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/button__1'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/button_'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/button_'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/button__1'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/button__1'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/button_Next_1_2_3'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/label_I havent checked my temperature'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/label_Moderate'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/label_Mild'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/label_In the lower area below my belly button'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/label_Upper right'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/button_Next_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/label_2 to 7 days'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/label_More than 3 months'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/label_From a few minutes to 4 hours'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/div_No'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/select_Client DeclinedNo email addressNo US_3dda4c'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/textarea_Comments_Comments'), 
    'None')

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/button_Submit'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/button_Select'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/select_Online VideoChat Consultation'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/button_Next_1_2_3_4_5'))

WebUI.setText(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/input_Claim_LinkClaimNumber'), 
    '123456')

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/input_Claim_bttn-pill bttn-md bttn-primary'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/button_Link Claim'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/img_Gender_img-responsive'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/label_NLP (English Only)'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/button_Next'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/button_Next_1_2'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/button_Next_1_2_3'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/label_I havent checked my temperature'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/label_Moderate'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/label_Mild'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/label_In the lower area below my belly button'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/label_Upper right'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/button_Next_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/label_2 to 7 days'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/label_More than 3 months'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/label_From a few minutes to 4 hours'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/div_Would the member like to speak directly_9506df'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/select_Online VideoChat Consultation'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/span_PJC Jean Coutu Health-Beauty'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/button_Next_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Client recommended Talemedicine Available/Page_StandbyMD Directional Care/span_Submit Request'))

WebUI.closeBrowser()

