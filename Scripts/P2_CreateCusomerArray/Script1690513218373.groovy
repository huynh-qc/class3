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

def email_list = new String[3]
email_list[0] = 'a@x.com'
email_list[1] = 'b@d.com'
email_list[2] = 'c@l.com'

WebUI.openBrowser('https://auto2023.myshopify.com/account/register')


WebUI.setText(findTestObject('Object Repository/SPFRegisterCustomer/input_first_name'), 'huy')

WebUI.setText(findTestObject('Object Repository/SPFRegisterCustomer/input_last_name'), 'nh')

WebUI.setText(findTestObject('Object Repository/SPFRegisterCustomer/input_email'), email_list[0])

WebUI.setEncryptedText(findTestObject('Object Repository/SPFRegisterCustomer/input_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/SPFRegisterCustomer/btn_create'))