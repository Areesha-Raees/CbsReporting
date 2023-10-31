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
selenium.open("http://202.69.40.229:7003/cbs9/#/customer-workspace/00000000000000014536/mcl-cw/detail-screen/client-detail;clientName=john%20saab")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab/app-client-basic-info/p-tabview/div/ul/li[2]")
selenium.click("xpath=//a[@id='ui-tabpanel-20-label']/span")
selenium.click("xpath=//div[@id='ui-tabpanel-20']/cbs-grid-popup-editor/div/div/span[4]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-26']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-lov/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-27']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr[2]/td/div")
selenium.click("xpath=//mat-select[@id='mat-select-105']/div/div/span/span")
selenium.click("xpath=//mat-option[@id='mat-option-670']/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-26']/cbs-grid-popup-editor-dialog/mat-dialog-actions/div/button[3]/span/mat-icon")
selenium.click("xpath=//mat-select[@id='mat-select-155']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-1019']/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-26']/cbs-grid-popup-editor-dialog/mat-dialog-actions/div/button[3]/span/mat-icon")
selenium.click("xpath=//div[@id='ui-tabpanel-20']/cbs-grid-popup-editor/div/div/span[4]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-28']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-lov/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-29']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr[2]/td[2]/div")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-28']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-select[4]/div/mat-form-field/div/div/div")
selenium.click("xpath=//mat-option[@id='mat-option-670']/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-28']/cbs-grid-popup-editor-dialog/mat-dialog-actions/div/button[3]/span/mat-icon")
selenium.click("xpath=//mat-select[@id='mat-select-158']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-1089']/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-28']/cbs-grid-popup-editor-dialog/mat-dialog-actions/div/button[3]/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div[3]")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab[3]/app-client-relationships/p-tabview/div/ul/li[2]")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab[3]/app-client-relationships/p-tabview/div/ul/li")
selenium.click("xpath=//div[@id='ui-tabpanel-23']/cbs-grid-popup-editor/div/div/span[4]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-30']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-lov[2]/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-31']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr[2]/td")
selenium.click("id=mat-input-257")
selenium.type("id=mat-input-257", "joe")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-30']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-input-date[2]/div/mat-form-field/div/div/div[2]/span/button/span/mat-icon")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-44']/div[2]/owl-date-time-calendar/div/div/button/span/span")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-44']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-multi-year-view/table/tbody/tr[3]/td[2]/span")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-44']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-year-view/table/tbody/tr[3]/td[3]/span")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-44']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[5]/td[5]/span")
selenium.click("xpath=//mat-select[@id='mat-select-125']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-718']/span")
selenium.click("xpath=//mat-select[@id='mat-select-126']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-1156']/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-30']/cbs-grid-popup-editor-dialog/mat-dialog-actions/div/button[3]/span/mat-icon")
selenium.click("xpath=//div[@id='ui-tabpanel-23']/cbs-grid-popup-editor/div/div/span[4]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-32']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-lov[2]/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-33']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr/td[2]/div")
selenium.click("xpath=//mat-select[@id='mat-select-125']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-718']/span")
selenium.click("xpath=//mat-option[@id='mat-option-1160']/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-32']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-input-date[2]/div/mat-form-field/div/div/div[2]/span/button/span/mat-icon")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-44']/div[2]/owl-date-time-calendar/div/div/button/span")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-44']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-multi-year-view/table/tbody/tr[3]/td[2]/span")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-44']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-year-view/table/tbody/tr[3]/td[3]/span")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-44']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[5]/td[5]/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-32']/cbs-grid-popup-editor-dialog/mat-dialog-actions/div/button[3]/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div[2]")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab[2]/app-client-class/cbs-grid-popup-editor/div/div/span[4]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-34']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-lov/div/mat-form-field/div/div/div[2]/button/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-35']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/td-paging-bar/div/div/button[2]/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-35']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr[2]/td/div")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-34']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-lov[2]/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-36']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr/td[2]/div")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-34']/cbs-grid-popup-editor-dialog/mat-dialog-actions/div/button[3]/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab[2]/app-client-class/cbs-grid-popup-editor/div/div/span[4]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-37']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-lov/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-38']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/td-paging-bar/div/div/button[2]/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-38']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr[2]/td/div")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-37']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-lov[2]/div/mat-form-field/div/div/div[2]/button/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-39']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr/td")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-37']/cbs-grid-popup-editor-dialog/mat-dialog-actions/div/button[3]/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div[3]/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div[5]/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-header/mat-card-actions/button[3]")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-40']/cbs-message-dialog/mat-dialog-actions/div[2]/button/span/mat-icon")
