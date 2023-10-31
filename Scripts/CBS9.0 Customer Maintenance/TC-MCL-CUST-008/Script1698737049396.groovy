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
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav/div/perfect-scrollbar/div/div/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[3]/div/tree-node-wrapper/div/div/tree-node-content/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav/div/perfect-scrollbar/div/div/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[3]/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/div/tree-node-content/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav/div/perfect-scrollbar/div/div/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[3]/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-workspace/div/cbs-customer-query/cbs-query-screen/div/mat-card/mat-card-content/div/mat-toolbar/span[6]/button/span/mat-icon")
selenium.open("http://202.69.40.229:7003/cbs9/#/customer-workspace/new/mcl-cw/detail-screen/client-detail;clientName=new")
selenium.click("xpath=//div[@id='ui-tabpanel-0']/dynamic-form/form/div/form-select[2]/div/mat-form-field/div/div/div")
selenium.click("xpath=//mat-option[@id='mat-option-108']/span")
selenium.click("xpath=//div[@id='ui-tabpanel-0']/dynamic-form/form/div/form-lov/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-1']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr/td[2]/div")
selenium.click("xpath=//mat-select[@id='mat-select-18']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-126']/span")
selenium.click("xpath=//div[@id='ui-tabpanel-0']/dynamic-form/form/div/form-input/div/mat-form-field/div/div/div")
selenium.type("id=mat-input-3", ("KHAN BRANCH").toString())
selenium.click("xpath=//div[@id='ui-tabpanel-0']/dynamic-form/form/div/form-lov[2]/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-2']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr[3]/td[2]")
selenium.click("xpath=//div[@id='ui-tabpanel-0']/dynamic-form/form/div/form-lov[3]/div/mat-form-field/div/div/div[2]/button/span")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-3']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr/td[2]/div")
selenium.click("xpath=//mat-checkbox[@id='mat-checkbox-198']/label/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab/app-client-basic-info/p-tabview/div/ul/li[2]")
selenium.click("xpath=//a[@id='ui-tabpanel-2-label']/span")
selenium.click("xpath=//div[@id='ui-tabpanel-2']/cbs-grid-popup-editor/div/div/span[4]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-4']/cbs-grid-popup-editor-dialog/mat-dialog-content/reactive-dynamic-form/form/div/form-lov/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-select[@id='mat-select-59']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-368']/span")
selenium.click("id=mat-input-120")
selenium.type("id=mat-input-120", "123457")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-5']/cbs-lov-dialog/mat-dialog-content/form/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-5']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr/td[2]")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-4']/cbs-grid-popup-editor-dialog/mat-dialog-actions/div/button[3]/span/mat-icon")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div[2]/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div[3]")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div[4]/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div[5]/span")
selenium.click("id=mat-checkbox-504")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab[5]/app-client-bank/div/dynamic-form/form/div/form-input-checkbox")
selenium.click("xpath=//mat-checkbox[@id='mat-checkbox-504']/label/div")
selenium.click("id=mat-input-106")
selenium.type("id=mat-input-106", "243245")
selenium.click("id=mat-input-107")
selenium.type("id=mat-input-107", ("BANK OF KHAN").toString())
selenium.click("xpath=//mat-select[@id='mat-select-55']/div/div/span")
selenium.click("xpath=//mat-option[@id='mat-option-358']/span")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab[5]/app-client-bank/dynamic-form/form/div/form-lov/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-6']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr[3]/td[2]/div")
selenium.click("xpath=//mat-checkbox[@id='mat-checkbox-506']/label/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div/div/div/div[6]/span")
selenium.click("id=mat-input-114")
selenium.type("id=mat-input-114", "2343")
selenium.click("id=mat-input-115")
selenium.type("id=mat-input-115", ("KHAN BRANCH").toString())
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab[6]/app-client-branch/dynamic-form/form/div/form-lov/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-7']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr/td[2]/div")
selenium.click("id=mat-input-117")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab[6]/app-client-branch/dynamic-form/form/div/form-lov[2]/div/mat-form-field/div/div/div[2]/button/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-8']/cbs-lov-dialog/mat-dialog-content/cbs-query-list/mat-card/mat-card-content/div/table/tbody/tr/td[2]/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content/md2-tabs/div[2]/md2-tab[6]/app-client-branch/dynamic-form/form/div/form-input/div/mat-form-field/div/div/div")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-content")
selenium.type("id=mat-input-114", "CSD")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-header/mat-card-actions/button[3]/span/mat-icon")
selenium.click("xpath=//mat-dialog-container[@id='mat-dialog-9']/cbs-message-dialog/button/span/mat-icon")
selenium.click("id=mat-input-114")
selenium.type("id=mat-input-114", "CSDC")
selenium.click("xpath=//app-root[@id='container']/div/div[3]/mat-sidenav-container/mat-sidenav-content/layout-main-container/layout-side-navigation-container/mat-sidenav-container/mat-sidenav-content/layout-content-canvas/cbs-customer-workspace/div/cbs-client-detail/cbs-detail-screen/mat-card/mat-card-header/mat-card-actions/button[3]")
