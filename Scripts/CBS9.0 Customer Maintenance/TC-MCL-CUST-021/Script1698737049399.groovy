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
selenium.click("xpath=//div[4]/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav/div/perfect-scrollbar/div/div/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[3]/div/tree-node-wrapper/div/div/tree-node-content/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav/div/perfect-scrollbar/div/div/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[3]/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav/div/perfect-scrollbar/div/div/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[3]/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/div/tree-node-content/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-customer-query/cbs-query-screen/div/mat-card/mat-card-content/div/mat-toolbar/span[6]/button/span/mat-icon")
selenium.open("http://202.69.40.229:7003/cbs9/#/customer-workspace/new/mcl-cw/detail-screen/client-detail;clientName=new")
selenium.click("xpath=//mat-select[@id='mat-select-17']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-128']/span")
selenium.click("xpath=//div[@id='ui-tabpanel-0']/dynamic-form/form/div/form-lov/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-1']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr/td[2]")
selenium.click("id=mat-input-3")
selenium.type("id=mat-input-3", "PARTNERSHIP")
selenium.click("xpath=//mat-select[@id='mat-select-18']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-115']/span")
selenium.click("xpath=//a[@id='ui-tabpanel-1-label']/span")
selenium.click("xpath=//div[@id='ui-tabpanel-1']/cbs-grid-popup-editor/div/div/span[4]/button/span/mat-icon")
selenium.click("xpath=//mat-select[@id='mat-select-19']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-104']/span")
selenium.click("id=mat-input-10")
selenium.type("id=mat-input-10", "32435")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-2']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-input-date/div/mat-form-field/div/div/div[2]/span/button/span/mat-icon")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-0']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[5]/td")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-2']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-lov/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-3']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr[3]/td[2]/div")
selenium.click("xpath=//mat-select[@id='mat-select-22']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-138']/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-2']/cbs-grid-popup-editor-dialog/mat-dialog-actions/div/button[3]/span/mat-icon")
selenium.click("xpath=//a[@id='ui-tabpanel-2-label']/span")
selenium.click("xpath=//div[@id='ui-tabpanel-2']/cbs-grid-popup-editor/div/div/span[4]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-4']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-lov/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-5']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr/td/div")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-4']/cbs-grid-popup-editor-dialog/mat-dialog-actions/div/button[3]/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div[2]/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div[3]/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div[5]")
selenium.click("xpath=//mat-select[@id='mat-select-56']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-365']/span")
selenium.click("xpath=//div[@id='ui-tabpanel-14']/dynamic-form/form/div/form-select[3]/div/mat-form-field/div/div/div")
selenium.click("xpath=//mat-option[@id='mat-option-367']/span")
selenium.click("xpath=//div[@id='ui-tabpanel-14']/dynamic-form/form/div/form-select[2]/div/mat-form-field/div/div/div")
selenium.click("xpath=//mat-option[@id='mat-option-369']/span")
selenium.click("id=mat-input-105")
selenium.type("id=mat-input-105", "IT")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div[2]")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-header/mat-card-actions/button[3]/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-6']/cbs-message-dialog/button/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab[2]/app-client-class/cbs-grid-popup-editor/div/div[2]/table/tbody/tr[2]/td")
selenium.click("xpath=//mat-checkbox[@id='mat-checkbox-504']/label/div")
selenium.click("xpath=//mat-checkbox[@id='mat-checkbox-505']/label/div")
selenium.click("xpath=//mat-checkbox[@id='mat-checkbox-405']/label/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab[2]/app-client-class/cbs-grid-popup-editor/div/div/span[5]/button/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-header/mat-card-actions/button[3]/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-7']/cbs-message-dialog/button/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab[2]/app-client-class/cbs-grid-popup-editor/div/div/span[4]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-8']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-lov/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-9']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/td-paging-bar/div/div/button[2]/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-9']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/td-paging-bar/div/div/button[2]/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-9']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/td-paging-bar/div/div/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-9']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/td-paging-bar/div/div/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-9']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr[7]/td/div")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-8']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-lov[2]/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-10']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr[2]/td/div")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-8']/cbs-grid-popup-editor-dialog/mat-dialog-actions/div/button[3]/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab[2]/app-client-class/cbs-grid-popup-editor/div/div/span[4]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-11']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-lov/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-12']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr[7]/td/div")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-11']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-lov[2]/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-13']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr[2]/td/div")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-11']/cbs-grid-popup-editor-dialog/mat-dialog-actions/div/button[3]/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-header/mat-card-actions/button[3]/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-14']/cbs-message-dialog/mat-dialog-actions/div[2]/button/span/mat-icon")
