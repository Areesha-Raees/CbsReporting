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
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-header-perspective-bar/mat-toolbar/button/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav/div/perfect-scrollbar/div/div/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[3]/div/tree-node-wrapper/div/div/tree-node-content/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav/div/perfect-scrollbar/div/div/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[3]/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/div/tree-node-content/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav/div/perfect-scrollbar/div/div/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[3]/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-customer-query/cbs-query-screen/div/mat-card/mat-card-content/div/mat-toolbar/span[6]/button/span/mat-icon")
selenium.open("http://202.69.40.229:7003/cbs9/#/customer-workspace/new/mcl-cw/detail-screen/client-detail;clientName=new")
selenium.click("xpath=//div[@id='ui-tabpanel-14']/dynamic-form/form/div/form-select/div/mat-form-field/div/div/div")
selenium.click("xpath=//mat-option[@id='mat-option-432']/span")
selenium.click("xpath=//mat-select[@id='mat-select-65']/div/div[2]")
selenium.click("xpath=//mat-option[@id='mat-option-439']/span")
selenium.click("xpath=//div[@id='ui-tabpanel-14']/dynamic-form/form/div/form-lov/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-1']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr[5]/td[2]/div")
selenium.click("xpath=//mat-select[@id='mat-select-66']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-457']/span")
selenium.click("xpath=//div[@id='ui-tabpanel-14']/dynamic-form/form/div/form-input/div/mat-form-field/div/div/div")
selenium.type("id=mat-input-106", "ALIED")
selenium.click("xpath=//div[@id='ui-tabpanel-14']/dynamic-form/form/div/form-lov[2]/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-2']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr[3]/td/div")
selenium.click("xpath=//div[@id='ui-tabpanel-14']/dynamic-form/form/div/form-lov[3]/div/mat-form-field/div/div/div[2]/button/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-3']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr/td[2]/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab/app-client-basic-info/p-tabview/div/ul/li[2]")
selenium.click("xpath=//div[@id='ui-tabpanel-15']/cbs-grid-popup-editor/div/div/span[4]/button/span/mat-icon")
selenium.click("xpath=//mat-select[@id='mat-select-67']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-460']/span")
selenium.click("id=mat-input-113")
selenium.type("id=mat-input-113", "34242")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-4']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-input-date/div/mat-form-field/div/div/div[2]/span/button/span/mat-icon")
selenium.click("xpath=//owl-date-time-container[@id='owl-dt-picker-22']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[5]/td/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-4']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-lov/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-5']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr[3]/td[2]/div")
selenium.click("xpath=//mat-select[@id='mat-select-69']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-438']/span")
selenium.click("xpath=//mat-select[@id='mat-select-70']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-437']/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-4']/cbs-grid-popup-editor-dialog/mat-dialog-actions/div/button[3]/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab/app-client-basic-info/p-tabview/div/ul/li[3]")
selenium.click("xpath=//div[@id='ui-tabpanel-16']/cbs-grid-popup-editor/div/div/span[4]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-6']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-lov/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-select[@id='mat-select-108']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-701']/span")
selenium.click("id=mat-input-223")
selenium.type("id=mat-input-223", "123457")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-7']/cbs-lov-dialog/mat-dialog-content/form/button")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-7']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr/td/div")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-6']/cbs-grid-popup-editor-dialog/mat-dialog-actions/div/button[3]/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div[2]")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div[3]/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div[4]/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div[5]/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div[6]")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div[5]/span")
selenium.click("id=mat-input-208")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab[5]/app-client-bank/div/dynamic-form/form/div/form-lov/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-8']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr[2]/td")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div[6]")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab[6]/app-client-branch/dynamic-form/form/div/form-input/div/mat-form-field/div/div/div")
selenium.click("id=mat-input-217")
selenium.type("id=mat-input-217", ("ALIED BANK").toString())
selenium.click("id=mat-input-218")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content")
selenium.click("id=mat-input-217")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab[6]")
selenium.click("id=mat-input-217")
selenium.type("id=mat-input-217", "U234")
selenium.click("id=mat-input-218")
selenium.type("id=mat-input-218", "ALIED")
selenium.click("id=mat-input-219")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-9']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr[2]/td[2]")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab[6]/app-client-branch/dynamic-form/form/div/form-lov[2]/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-10']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr/td[2]/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div[5]/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab[5]/app-client-bank/dynamic-form/form/div/form-lov/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-11']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr[3]/td[2]")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-header/mat-card-actions/button[3]")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-12']/cbs-message-dialog/button/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab/app-client-basic-info/p-tabview/div/ul/li")
selenium.click("xpath=//mat-select[@id='mat-select-64']/div/div/span/span")
selenium.click("xpath=//mat-option[@id='mat-option-434']/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-header/mat-card-actions/button[3]/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-13']/cbs-message-dialog/mat-dialog-actions/div[2]/button/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div[6]/span")
