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

WebUI.click(findTestObject('Object Repository/Page_Choose your account/button_Client Sign-in'))

WebUI.setText(findTestObject('Page_Sign in to your account/input_concat(Sorry but we  re having troubl_5aa0e7'), 'qa3@globalexcel.com')

WebUI.setEncryptedText(findTestObject('Page_Sign in to your account/input_Redirecting_passwd'), 'axFQsTjMQqya7oMWgLoxVA==')

WebUI.click(findTestObject('Page_Sign in to your account/button_Sign in'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/div_Yes'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/div_Yes'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_Next'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/i_Distance_far fa-edit'))

WebUI.click(findTestObject('Object Repository/Page_StandbyMD Directional Care/div_Distance_col-10'))

WebUI.setText(findTestObject('Page_StandbyMD Directional Care/input_Distance_Address'), 'kigali')

WebUI.click(findTestObject('Page_StandbyMD Directional Care/i_Distance_far fa-check-square'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_StandbyMD Directional Care/span_HOSPITAL -UBUZIMA POLYCLINIC'))

WebUI.click(findTestObject('Object Repository/Page_StandbyMD Directional Care/div_Distance'))

WebUI.click(findTestObject('Object Repository/Page_StandbyMD Directional Care/span_Baho International Hospital'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_Next_1'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/a_Contact'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/a_Service'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/a_Triage'))

WebUI.click(findTestObject('Object Repository/Page_StandbyMD Directional Care/a_Coordinate Summary_tabRefreshBtn'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/span_Submit Request'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_Ok'))

WebUI.setText(findTestObject('Page_StandbyMD Directional Care/input_Member_Member'), 'Laetitia Ishimwe')

WebUI.selectOptionByValue(findTestObject('Page_StandbyMD Directional Care/select_Test'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_StandbyMD Directional Care/select_Test_1'), '11', true)

WebUI.setText(findTestObject('Page_StandbyMD Directional Care/input_Policy _Policy'), '5')

WebUI.setText(findTestObject('Page_StandbyMD Directional Care/input_Case _ClaimRef'), '5')

WebUI.setText(findTestObject('Page_StandbyMD Directional Care/input_Phone_Phone'), '0788509927')

WebUI.setText(findTestObject('Page_StandbyMD Directional Care/input_Email_Email'), 'laetitia.i@muraho.tech')

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_Save'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/span_Submit Request'))

WebUI.click(findTestObject('Page_StandbyMD Directional Care/button_Done'))

WebUI.closeBrowser()

