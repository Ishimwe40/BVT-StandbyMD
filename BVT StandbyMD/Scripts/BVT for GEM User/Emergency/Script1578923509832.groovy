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

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_Choose your account/button_Client Sign-in'))

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_Sign in to your account/input_concat(Sorry but we  re having troubl_5aa0e7'), 
    'gem3@globalexcel.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Start with Emergency/Page_Sign in to your account/input_Redirecting_passwd'), 
    'axFQsTjMQqya7oMWgLoxVA==')

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_Sign in to your account/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/div_Yes'))

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/div_Yes'))

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/i_Contacts_fas fa-plus-circle'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/select_PatientNonPatient'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_Yes_opCaller'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/select_MrMrsMsDr'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_Name_FirstName'), 
    'Laetitia Ishimwe')

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_Phone_Phone'), 
    '0788509927')

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_Mobile_Mobile'), 
    '0788509927')

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_Fax_Fax'), '12')

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_E-Mail_EMail'), 
    'laetitia.i@muraho.tech')

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_Address_Address'), 
    'Kigali')

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/i_City_fas fa-search'))

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_City_CityName'), 
    'kigali')

WebUI.sendKeys(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_City_CityName'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/button_Select'))

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_Postal Code_Zip'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_Reference_Reference'), 
    '100')

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_Attention_Attention'), 
    'hi')

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/textarea_Remark_Remark'), 
    'hello')

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/button_Save changes'))

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/i_Contacts_fas fa-plus-circle'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/select_MrMrsMsDr'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_Name_FirstName'), 
    'Janet')

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_Phone_Phone'), 
    '0788509927')

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_Mobile_Mobile'), 
    '0788509927')

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_Fax_Fax'), '12')

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_E-Mail_EMail'), 
    'laetitia.i@muraho.tech')

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_Address_Address'), 
    'kigali')

WebUI.selectOptionByValue(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/select_Afghanistanland IslandsAlbaniaAlgeri_e5d3ee'), 
    'RW', true)

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/div_Country                                _ebc3f0'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/select_Prfecture de Butare  Prfecture de By_8a0cdc'), 
    '09', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/select_Bandazi  Bicumbi  Bihembe  Bugaragar_989edf'), 
    '47887', true)

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_Postal Code_Zip'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_Reference_Reference'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_Attention_Attention'), 
    'ok')

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/textarea_Remark_Remark'), 
    'Right')

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/button_Save changes'))

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/i_Phone_fas fa-trash-alt'))

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/button_Yes'))

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/button_Next'))

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/span_Hospital Center And Accommodation Memphrmagog'))

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/button_Next_1'))

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_Claim_LinkClaimNumber'), 
    '123456')

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_Claim_bttn-pill bttn-md bttn-primary'))

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/button_Link Claim'))

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/i_Coordinate Summary_fas fa-comment-medical fa-2x'))

WebUI.switchToWindowTitle('Summary')

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_Summary/span_Hospital Center And Accommodation Memp_af5ee4'))

WebUI.switchToWindowTitle('StandbyMD: Directional Care')

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/span_Submit Request'))

WebUI.click(findTestObject('Client sign-Login-Forget password-Contacts form-City search icon-link claim-Submit/Page_StandbyMD Directional Care/button_Yes'))

WebUI.setText(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_E-Mail_Email (1)'), 
    'laetitia.i@muraho.tech')

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/input_Mobile_btnSendClientSum'))

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/button_Done'))

WebUI.click(findTestObject('Object Repository/Start with Emergency/Page_StandbyMD Directional Care/i_Ishimwe Laetitia_fas fa-sign-out-alt'))

WebUI.closeBrowser()

