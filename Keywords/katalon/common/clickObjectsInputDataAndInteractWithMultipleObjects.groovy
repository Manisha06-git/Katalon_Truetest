package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling

public class clickObjectsInputDataAndInteractWithMultipleObjects {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_15'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_15'))
        "Step 2: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_16'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_16'))
        "Step 3: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_5'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_5'))
        "Step 4: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_6'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_6'))
        "Step 5: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_6'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_6'), data['fn15_ti_object'])
        "Step 6: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_7'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_7'))
        "Step 7: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_7'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_7'), data['fn15_ti_object_1'])
        "Step 8: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_8'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_8'))
        "Step 9: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_8'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_8'), data['fn15_ti_object_2'])
        "Step 10: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_9'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_9'))
        "Step 11: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_9'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_9'), data['fn15_ti_object_3'])
        "Step 12: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_10'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_10'))
        "Step 13: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_10'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_10'), data['fn15_ti_object_4'])
        "Step 14: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_11'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_11'))
        "Step 15: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_11'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_11'), data['fn15_ti_object_5'])
        "Step 16: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_12'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_12'))
        "Step 17: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object'))
        "Step 18: Click on div"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/div_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/div_object'))
        "Step 19: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_12'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_12'))
        "Step 20: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_12'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_12'), data['fn15_ti_object_6'])
        "Step 21: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_13'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_13'))
        "Step 22: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_13'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_13'), data['fn15_ti_object_7'])
        "Step 23: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_14'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_14'))
        "Step 24: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_14'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_14'), data['fn15_ti_object_8'])
        "Step 25: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object'))
        "Step 26: Click on div"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/div_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/div_object'))
        "Step 27: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_5'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_5'))
        "Step 28: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_6'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_6'))
        "Step 29: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_6'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_6'), data['fn15_ti_object_9'])
        "Step 30: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_7'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_7'))
        "Step 31: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_7'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_7'), data['fn15_ti_object_10'])
        "Step 32: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_8'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_8'))
        "Step 33: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_8'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_8'), data['fn15_ti_object_11'])
        "Step 34: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_9'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_9'), data['fn15_ti_object_12'])
        "Step 35: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_10'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_10'), data['fn15_ti_object_13'])
        "Step 36: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_11'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_11'), data['fn15_ti_object_14'])
        "Step 37: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object'))
        "Step 38: Click on div"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/div_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/div_object'))
        "Step 39: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_5'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_5'))
        "Step 40: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_6'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_6'))
        "Step 41: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_6'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_6'), data['fn15_ti_object_15'])
        "Step 42: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_7'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_7'), data['fn15_ti_object_16'])
        "Step 43: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_8'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_8'), data['fn15_ti_object_17'])
        "Step 44: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_9'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_9'), data['fn15_ti_object_18'])
        "Step 45: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_10'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_10'), data['fn15_ti_object_19'])
        "Step 46: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_11'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_11'), data['fn15_ti_object_20'])
        "Step 47: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_12'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_12'))
        "Step 48: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_12'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_12'), data['fn15_ti_object_21'])
        "Step 49: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_13'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_13'))
        "Step 50: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_13'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_13'), data['fn15_ti_object_22'])
        "Step 51: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_14'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_14'))
        "Step 52: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_14'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_14'), data['fn15_ti_object_23'])
        "Step 53: Click on ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_17'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_17'))
        "Step 54: Enter input value in ti"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_17'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_17'), data['fn15_ti_object_24'])
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['fn15_ti_object'] = testData.getValue('fn15_ti_object', rowIndex)
        data['fn15_ti_object_1'] = testData.getValue('fn15_ti_object_1', rowIndex)
        data['fn15_ti_object_2'] = testData.getValue('fn15_ti_object_2', rowIndex)
        data['fn15_ti_object_3'] = testData.getValue('fn15_ti_object_3', rowIndex)
        data['fn15_ti_object_4'] = testData.getValue('fn15_ti_object_4', rowIndex)
        data['fn15_ti_object_5'] = testData.getValue('fn15_ti_object_5', rowIndex)
        data['fn15_ti_object_6'] = testData.getValue('fn15_ti_object_6', rowIndex)
        data['fn15_ti_object_7'] = testData.getValue('fn15_ti_object_7', rowIndex)
        data['fn15_ti_object_8'] = testData.getValue('fn15_ti_object_8', rowIndex)
        data['fn15_ti_object_9'] = testData.getValue('fn15_ti_object_9', rowIndex)
        data['fn15_ti_object_10'] = testData.getValue('fn15_ti_object_10', rowIndex)
        data['fn15_ti_object_11'] = testData.getValue('fn15_ti_object_11', rowIndex)
        data['fn15_ti_object_12'] = testData.getValue('fn15_ti_object_12', rowIndex)
        data['fn15_ti_object_13'] = testData.getValue('fn15_ti_object_13', rowIndex)
        data['fn15_ti_object_14'] = testData.getValue('fn15_ti_object_14', rowIndex)
        data['fn15_ti_object_15'] = testData.getValue('fn15_ti_object_15', rowIndex)
        data['fn15_ti_object_16'] = testData.getValue('fn15_ti_object_16', rowIndex)
        data['fn15_ti_object_17'] = testData.getValue('fn15_ti_object_17', rowIndex)
        data['fn15_ti_object_18'] = testData.getValue('fn15_ti_object_18', rowIndex)
        data['fn15_ti_object_19'] = testData.getValue('fn15_ti_object_19', rowIndex)
        data['fn15_ti_object_20'] = testData.getValue('fn15_ti_object_20', rowIndex)
        data['fn15_ti_object_21'] = testData.getValue('fn15_ti_object_21', rowIndex)
        data['fn15_ti_object_22'] = testData.getValue('fn15_ti_object_22', rowIndex)
        data['fn15_ti_object_23'] = testData.getValue('fn15_ti_object_23', rowIndex)
        data['fn15_ti_object_24'] = testData.getValue('fn15_ti_object_24', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['fn15_ti_object'] = 'default_data'
        data['fn15_ti_object_1'] = 'default_data'
        data['fn15_ti_object_2'] = 'default_data'
        data['fn15_ti_object_3'] = 'default_data'
        data['fn15_ti_object_4'] = 'default_data'
        data['fn15_ti_object_5'] = 'default_data'
        data['fn15_ti_object_6'] = 'default_data'
        data['fn15_ti_object_7'] = 'default_data'
        data['fn15_ti_object_8'] = 'default_data'
        data['fn15_ti_object_9'] = 'default_data'
        data['fn15_ti_object_10'] = 'default_data'
        data['fn15_ti_object_11'] = 'default_data'
        data['fn15_ti_object_12'] = 'default_data'
        data['fn15_ti_object_13'] = 'default_data'
        data['fn15_ti_object_14'] = 'default_data'
        data['fn15_ti_object_15'] = 'default_data'
        data['fn15_ti_object_16'] = 'default_data'
        data['fn15_ti_object_17'] = 'default_data'
        data['fn15_ti_object_18'] = 'default_data'
        data['fn15_ti_object_19'] = 'default_data'
        data['fn15_ti_object_20'] = 'default_data'
        data['fn15_ti_object_21'] = 'default_data'
        data['fn15_ti_object_22'] = 'default_data'
        data['fn15_ti_object_23'] = 'default_data'
        data['fn15_ti_object_24'] = 'default_data'
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

