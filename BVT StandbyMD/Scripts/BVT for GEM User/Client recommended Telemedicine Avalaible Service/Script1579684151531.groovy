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

WebUI.setText(findTestObject('Page_Sign in to your account/input_concat(Sorry but we  re having troubl_5aa0e7'), 'gem3@globalexcel.com')

WebUI.setEncryptedText(findTestObject('Page_Sign in to your account/input_Redirecting_passwd'), 'axFQsTjMQqya7oMWgLoxVA==')

WebUI.click(findTestObject('Page_Sign in to your account/button_Sign in'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/div_No'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/input_DOB_DOB'))

WebUI.sendKeys(findTestObject('Page_StandbyMD Directional Care/input_DOB_DOB'), '01181958')

WebUI.click(findTestObject('Page_StandbyMD Directional Care/img_Male_img-responsive'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/label_Symptom Selector'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_Next'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_Next_1'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/div_Back pain'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/div_Cough'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_Next_1_2'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/label_No'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/label_Less than 3 weeks'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/label_Dry cough without phlegm or mucus'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_Next_1_2_3'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/label_No'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/label_No'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/label_No'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/label_Yes'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/div_Yes'))

WebUI.selectOptionByValue(findTestObject('Page_StandbyMD Directional Care/select_Online VideoChat Consultation'), '2', true)

WebUI.click(findTestObject('Page_StandbyMD Directional Care/span_PJC Jean Coutu Health-Beauty'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_Next_1_2_3_4'))

WebUI.setText(findTestObject('Page_StandbyMD Directional Care/input_Claim_LinkClaimNumber'), '123456')

WebUI.click(findTestObject('Page_StandbyMD Directional Care/input_Claim_bttn-pill bttn-md bttn-primary'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_Link Claim'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/span_Submit Request'))

WebUI.setText(findTestObject('Page_StandbyMD Directional Care/input_E-Mail_EMail'), 'laetitia.i@muraho.tech')

WebUI.click(findTestObject('Page_StandbyMD Directional Care/input_Mobile_btnSendClientSum'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_Done'))

WebUI.closeBrowser()

