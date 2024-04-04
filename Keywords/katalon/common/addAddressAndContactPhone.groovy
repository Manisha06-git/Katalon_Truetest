package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling

public class addAddressAndContactPhone {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_16'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_16'))
        "Step 2: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_16'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_16'))
        "Step 3: Click on link 'Add address'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/hyperlink_add address'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/hyperlink_add address'))
        "Step 4: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_19'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_19'))
        "Step 5: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_20'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_20'))
        "Step 6: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_20'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_20'), data['fn14_ti_object'])
        "Step 7: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_21'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_21'), data['fn14_ti_object_1'])
        "Step 8: Click on input field 'phoneTel'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/input_phonetel'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/input_phonetel'))
        "Step 9: Enter input value in input field 'phoneTel'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/input_phonetel'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/input_phonetel'), data['fn14_input_phonetel'])
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['fn14_ti_object'] = testData.getValue('fn14_ti_object', rowIndex)
        data['fn14_ti_object_1'] = testData.getValue('fn14_ti_object_1', rowIndex)
        data['fn14_input_phonetel'] = testData.getValue('fn14_input_phonetel', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['fn14_ti_object'] = 'default_data'
        data['fn14_ti_object_1'] = 'default_data'
        data['fn14_input_phonetel'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

