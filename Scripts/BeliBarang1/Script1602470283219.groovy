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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://devmobile.goapotik.com/')

WebUI.click(findTestObject('1.FolderBeranda/Button_Skip'))

WebUI.delay(5)

WebUI.click(findTestObject('1.FolderBeranda/ClickPorfil'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('2.FoldergGoApotik.com/Goapotik.com'), 0)

WebUI.setText(findTestObject('2.FoldergGoApotik.com/InputText'), 'wsherwinsimbolon@gmail.com')

WebUI.setText(findTestObject('2.FoldergGoApotik.com/MasukanPassword'), 's!mbol0n123')

WebUI.click(findTestObject('2.FoldergGoApotik.com/Button_Masuk'))

WebUI.delay(3)

WebUI.click(findTestObject('3.PageProfile/Beranda'))

WebUI.scrollToElement(findTestObject('3.PageProfile/Klick_NoThanks'), 0)

WebUI.click(findTestObject('3.PageProfile/Klick_NoThanks'))

WebUI.verifyElementPresent(findTestObject('3.PageProfile/Tulisan_DataDiri'), 5)

WebUI.delay(3)

WebUI.click(findTestObject('4.FolderBeranda2/Klik_Produk'))

