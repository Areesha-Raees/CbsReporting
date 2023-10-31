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
selenium.open("http://202.69.40.229:7003/cbs9/#/workspace")
selenium.click("xpath=//div[3]/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav/div/perfect-scrollbar/div/div/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[7]/div/tree-node-wrapper/div/div/tree-node-content/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav/div/perfect-scrollbar/div/div/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[7]/div/tree-node-children/div/tree-node-collection/div/tree-node[4]/div/tree-node-wrapper/div/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav/div/perfect-scrollbar/div/div/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[7]/div/tree-node-children/div/tree-node-collection/div/tree-node[4]/div/tree-node-children/div/tree-node-collection/div/tree-node[3]/div/tree-node-wrapper/div/tree-node-expander")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav/div/perfect-scrollbar/div/div/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[7]/div/tree-node-children/div/tree-node-collection/div/tree-node[4]/div/tree-node-children/div/tree-node-collection/div/tree-node[3]/div/tree-node-wrapper/div/tree-node-expander/span/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav/div/perfect-scrollbar/div/div/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[7]/div/tree-node-children/div/tree-node-collection/div/tree-node[4]/div/tree-node-children/div/tree-node-collection/div/tree-node[3]/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/div/tree-node-content/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-loan-type-query/cbs-query-screen/div/mat-card/mat-card-content/div/mat-toolbar/span[6]/button/span/mat-icon")
selenium.click("id=mat-input-2")
selenium.type("id=mat-input-2", "NWR")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-loan-type-detail/cbs-detail-screen/mat-card/mat-card-content/dynamic-form/form/div/form-input[2]/div/mat-form-field/div/div/div")
selenium.type("id=mat-input-3", "Testing")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-loan-type-detail/cbs-detail-screen/mat-card/mat-card-content/dynamic-form/form/div/form-input-date/div/mat-form-field/div/div/div[2]/span/button/span/mat-icon")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-0']/div[2]/owl-date-time-calendar/div")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-0']/div[2]/owl-date-time-calendar/div/div/button/span")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-0']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-multi-year-view/table/tbody/tr[3]/td[2]/span")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-0']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-year-view/table/tbody/tr[4]/td/span")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-0']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr/td[3]/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-loan-type-detail/cbs-detail-screen/mat-card/mat-card-content/cbs-grid-popup-editor/div/div/span[4]/button/span/mat-icon")
selenium.click("id=mat-input-7")
selenium.type("id=mat-input-7", "SPD")
selenium.click("id=mat-input-8")
selenium.type("id=mat-input-8", ("Single Payment Down").toString())
selenium.click("xpath=//mat-select[@id='mat-select-9']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-49']/span")
selenium.click("xpath=//mat-select[@id='mat-select-8']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-37']/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-1']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-select[5]/div/mat-form-field/div/div/div")
selenium.click("xpath=//mat-option[@id='mat-option-44']/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-1']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-select[4]/div/mat-form-field/div/div/div")
selenium.click("xpath=//mat-option[@id='mat-option-53']/span")
selenium.click("xpath=//mat-select[@id='mat-select-13']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-55']/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-1']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-input-date/div/mat-form-field/div/div/div[2]/span/button/span")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-2']/div[2]/owl-date-time-calendar/div/div/button/span")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-2']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-multi-year-view/table/tbody/tr[3]/td[2]/span")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-2']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-year-view/table/tbody/tr[4]/td/span")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-2']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr/td[7]/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-1']/cbs-grid-popup-editor-dialog/mat-dialog-actions/div/button[3]/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-loan-type-detail/cbs-detail-screen/mat-card/mat-card-content/cbs-grid-popup-editor/div/div/span[4]/button/span/mat-icon")
selenium.click("id=mat-input-7")
selenium.type("id=mat-input-7", "MPD")
selenium.click("id=mat-input-8")
selenium.type("id=mat-input-8", ("Multiple Payment Down").toString())
selenium.click("xpath=//mat-select[@id='mat-select-8']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-37']/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-2']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-select[2]/div/mat-form-field/div/div/div")
selenium.click("xpath=//mat-option[@id='mat-option-49']/span")
selenium.click("xpath=//mat-select[@id='mat-select-12']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-44']/span")
selenium.click("xpath=//mat-select[@id='mat-select-13']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-55']/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-2']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-input-date/div/mat-form-field/div/div/div[2]/span/button/span/mat-icon")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-2']/div[2]/owl-date-time-calendar/div/div/button/span")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-2']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-multi-year-view/table/tbody/tr[3]/td[2]/span")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-2']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-year-view/table/tbody/tr[4]/td/span")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-2']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr/td[7]/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-2']/cbs-grid-popup-editor-dialog/mat-dialog-actions/div/button[3]/span/mat-icon")
selenium.click("xpath=//mat-select[@id='mat-select-11']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-52']/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-2']/cbs-grid-popup-editor-dialog/mat-dialog-actions/div/button[3]/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-loan-type-detail/cbs-detail-screen/mat-card/mat-card-content/cbs-grid-popup-editor/div/div[2]/table/tbody/tr/td[6]")
selenium.doubleClick("xpath=//mat-dialog-container[@id='mat-dialog-3']/cbs-grid-popup-editor-dialog/mat-dialog-actions")
selenium.click("xpath=//mat-select[@id='mat-select-9']/div/div/span/span")
selenium.click("xpath=//mat-option[@id='mat-option-50']/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-3']/cbs-grid-popup-editor-dialog/mat-dialog-actions/div/button[3]/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-loan-type-detail/cbs-detail-screen/mat-card/mat-card-content/cbs-grid-popup-editor/div/div[2]/table/tbody/tr[2]/td[5]")
selenium.doubleClick("id=cdk-overlay-14")
selenium.click("xpath=//mat-select[@id='mat-select-9']/div/div/span/span")
selenium.click("xpath=//mat-option[@id='mat-option-50']/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-4']/cbs-grid-popup-editor-dialog/mat-dialog-actions/div/button[3]/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-loan-type-detail/cbs-detail-screen/mat-card/mat-card-header/mat-card-actions/button[4]/span/mat-icon")
selenium.click("xpath=//a[@id='Loan Types']/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-loan-type-query/cbs-query-screen/div/mat-card/mat-card-content/div/div/table/th/span/mat-icon")
selenium.click("xpath=//mat-slide-toggle[@id='mat-slide-toggle-4']/label/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-loan-type-query/cbs-query-screen/div/mat-card/mat-card-content/div/div/table/th/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-loan-type-query/cbs-query-screen/div/mat-card/mat-card-content/div/div/table/th/span/span/cbs-grid-options/button/span/mat-icon")
selenium.click("xpath=//mat-select[@id='mat-select-24']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-112']/span")
selenium.click("id=mat-input-24")
selenium.type("id=mat-input-24", "NWR")
selenium.click("xpath=//div[@id='cdk-overlay-20']/div/div/div/button")
