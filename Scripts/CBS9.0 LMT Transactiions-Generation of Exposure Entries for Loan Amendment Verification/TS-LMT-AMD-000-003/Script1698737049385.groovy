import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert
import com.kms.katalon.core.testdata.CSVData
import org.openqa.selenium.Keys as Keys

SoftAssert softAssertion = new SoftAssert();
WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("http://192.168.0.199:7003/cbs9/#/workspace")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-0']/cbs-message-dialog/button/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav/div/perfect-scrollbar/div/div/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav/div/perfect-scrollbar/div/div/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node/div/tree-node-children/div/tree-node-collection/div/tree-node[5]/div/tree-node-wrapper/div/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav/div/perfect-scrollbar/div/div/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node/div/tree-node-children/div/tree-node-collection/div/tree-node[5]/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/div/tree-node-content/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-query/cbs-query-screen/div/mat-card/mat-card-content/div/mat-toolbar/span[6]/button/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-detail/cbs-detail-screen/mat-card/mat-card-content/div/div[2]/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-detail/cbs-detail-screen/mat-card/mat-card-content/div/div[2]/div/span[2]/button/span")
selenium.click("id=mat-input-7")
selenium.type("id=mat-input-7", "FCL101")
selenium.click("id=mat-input-9")
selenium.type("id=mat-input-9", "DEMO001")
selenium.click("id=mat-input-7")
selenium.type("id=mat-input-7", "")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-detail/cbs-detail-screen/mat-card/mat-card-content/div/div[2]/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/div")
selenium.click("id=mat-input-12")
selenium.type("id=mat-input-12", "FCL101")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-detail/cbs-detail-screen/mat-card/mat-card-content/div/div[2]/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/div")
selenium.click("id=mat-input-19")
selenium.type("id=mat-input-19", "")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-detail/cbs-detail-screen/mat-card/mat-card-content/div/div[2]/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/div")
selenium.click("id=mat-input-24")
selenium.type("id=mat-input-24", "DEMO001")
selenium.click("xpath=//mat-select[@id='mat-select-11']/div/div/span/span")
selenium.click("xpath=//mat-option[@id='mat-option-39']/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-detail/cbs-detail-screen/mat-card/mat-card-content/div/div[2]/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/div")
selenium.click("id=mat-input-27")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-detail/cbs-detail-screen/mat-card/mat-card-content/div/div[2]/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/div")
selenium.click("id=mat-input-34")
selenium.type("id=mat-input-34", ("DEMO FACILITIES").toString())
selenium.type("id=mat-input-34", ("DEMO Facilities").toString())
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-detail/cbs-detail-screen/mat-card/mat-card-content/div/div[2]/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/div")
selenium.click("id=mat-input-37")
selenium.type("id=mat-input-37", "FCL102")
selenium.click("id=mat-input-39")
selenium.type("id=mat-input-39", ("Term Loans").toString())
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-detail/cbs-detail-screen/mat-card/mat-card-content/div/div[2]/div/span[2]/button/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-detail/cbs-detail-screen/mat-card/mat-card-content/div/div[2]/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/div")
selenium.click("id=mat-input-49")
selenium.type("id=mat-input-49", "Loans")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-detail/cbs-detail-screen/mat-card/mat-card-content/div/div[2]/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/div")
selenium.click("id=mat-input-52")
selenium.type("id=mat-input-52", "FCL301")
selenium.click("id=mat-input-54")
selenium.type("id=mat-input-54", ("Term Loans").toString())
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-detail/cbs-detail-screen/mat-card/mat-card-content/div/div[2]/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-detail/cbs-detail-screen/mat-card/mat-card-content/div/div[2]/div/span[2]/button/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-detail/cbs-detail-screen/mat-card/mat-card-content/div/div[2]/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node/div/tree-node-children/div/tree-node-collection/div/tree-node[2]/div/tree-node-wrapper/div/div")
selenium.click("id=mat-input-67")
selenium.type("id=mat-input-67", "FCL103")
selenium.click("id=mat-input-69")
selenium.type("id=mat-input-69", "Over")
selenium.type("id=mat-input-69", "Overdraft")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-detail/cbs-detail-screen/mat-card/mat-card-content/div/div[2]/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-detail/cbs-detail-screen/mat-card/mat-card-content/div/div[2]/div/span[2]/button/span")
selenium.click("id=mat-input-79")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-detail/cbs-detail-screen/mat-card/mat-card-content/div/div[2]/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node/div/tree-node-children/div/tree-node-collection/div/tree-node[3]/div/tree-node-wrapper/div/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-detail/cbs-detail-screen/mat-card/mat-card-content/div/div[2]/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node/div/tree-node-children/div/tree-node-collection/div/tree-node[3]/div/tree-node-wrapper/div/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-detail/cbs-detail-screen/mat-card/mat-card-content/div/div[3]/div/dynamic-form/form/div/form-input[2]/div/mat-form-field/div/div/div")
selenium.type("id=mat-input-89", ("Trade Facilities").toString())
selenium.click("id=mat-input-87")
selenium.type("id=mat-input-87", "FCL104")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-detail/cbs-detail-screen/mat-card/mat-card-header")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-detail/cbs-detail-screen/mat-card/mat-card-header/mat-card-actions/button[4]/span/mat-icon")
selenium.click("xpath=//a[@id='Facilities']/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-query/cbs-query-screen/div/mat-card/mat-card-content/div/div/table/th/span/span/cbs-grid-options/button/span/mat-icon")
selenium.click("xpath=//mat-select[@id='mat-select-29']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-105']/span")
selenium.click("xpath=//div[@id='cdk-overlay-9']/div/div/div/mat-list/mat-list-item[2]/div/mat-form-field/div/div/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-query/cbs-query-screen/div/mat-card/mat-card-content/div/div/table/th/span/span/cbs-grid-options/button/span/mat-icon")
selenium.click("xpath=//div[3]/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-facility-query/cbs-query-screen/div/mat-card/mat-card-content/div/div/table/tbody/tr[7]/td/div")
selenium.click("id=username")
selenium.type("id=username", ("cbs.manager1").toString())
selenium.type("id=password", "Manager1")
selenium.click("id=postForm")
selenium.open("http://192.168.0.199:7003/cbs9/index.html")
selenium.open("http://192.168.0.199:7003/cbs9/#/workspace")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-0']/cbs-message-dialog/mat-dialog-actions/p")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav/div/perfect-scrollbar/div/div/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[3]/div/tree-node-wrapper/div/div/tree-node-content/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav/div/perfect-scrollbar/div/div/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[3]/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/div/tree-node-content/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav/div/perfect-scrollbar/div/div/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[3]/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-children/div/tree-node-collection/div/tree-node[2]/div/tree-node-wrapper/div/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-contact-query/cbs-query-screen/div/mat-card/mat-card-content/div/div/table/tbody/tr[4]/td[2]/div")
selenium.doubleClick("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-contact-query/cbs-query-screen/div/mat-card/mat-card-content/div/div/table/tbody/tr[4]/td[2]/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-contact-query/cbs-query-screen/div/mat-card/mat-card-content/div/div/table/tbody/tr[4]/td[2]/div")
selenium.doubleClick("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-contact-query/cbs-query-screen/div/mat-card/mat-card-content/div/div/table/tbody/tr[4]/td[2]/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-contact-query/cbs-query-screen/div/mat-card/mat-card-content/div/div/table/tbody/tr[4]/td[2]/div")
