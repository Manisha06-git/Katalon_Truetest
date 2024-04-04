package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling

public class uploadFilesSubmitFormAndViewDraftInformation {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on link 'Upload files' -> Navigate to page 'productreturns/docs/showfileUpload.tsp'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/hyperlink_upload files'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showPartTypeInfo.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/hyperlink_upload files'))
        "Step 2: Click on button 'Submit1' -> Navigate to page 'productreturns/docs/showAnalogSummary.tsp'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showfileUpload_tsp/button_submit1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showfileUpload.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showfileUpload_tsp/button_submit1'))
        "Step 3: Click on link 'draftButton' -> Navigate to page 'productreturns/docs/showPartTypeInfo.tsp'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showAnalogSummary_tsp/hyperlink_draftbutton'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showAnalogSummary.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showAnalogSummary_tsp/hyperlink_draftbutton'))
        "Step 4: Click on label"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/label_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showPartTypeInfo.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/label_object'))
        "Step 5: Click on input field 'isPrgrmOrLowRfDevice1'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/input_isprgrmorlowrfdevice1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showPartTypeInfo.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/input_isprgrmorlowrfdevice1'))
        "Step 6: Click on input field 'temperature1'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/input_temperature1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showPartTypeInfo.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/input_temperature1'))
        "Step 7: Click on label"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/label_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showPartTypeInfo.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/label_object_1'))
        "Step 8: Click on label"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/label_object_2'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showPartTypeInfo.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/label_object_2'))
        "Step 9: Click on input field 'failPartsCondition1'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/input_failpartscondition1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showPartTypeInfo.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/input_failpartscondition1'))
        "Step 10: Click on label"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/label_object_3'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showPartTypeInfo.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/label_object_3'))
        "Step 11: Click on label"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/label_object_4'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showPartTypeInfo.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/label_object_4'))
        "Step 12: Click on input field 'boardFailPartSwap1'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/input_boardfailpartswap1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showPartTypeInfo.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/input_boardfailpartswap1'))
        "Step 13: Click on label"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/label_object_5'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showPartTypeInfo.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/label_object_5'))
        "Step 14: Click on link '1'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/hyperlink_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showPartTypeInfo.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/hyperlink_1'))
        "Step 15: Enter input value in input field 'totalOrderedQty'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/input_totalorderedqty'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showPartTypeInfo.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/input_totalorderedqty'), data['fn25_input_totalorderedqty'])
        "Step 16: Click on div"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/div_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showPartTypeInfo.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/div_object'))
        "Step 17: Click on link '1'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/hyperlink_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showPartTypeInfo.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showPartTypeInfo_tsp/hyperlink_1'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['fn25_input_totalorderedqty'] = testData.getValue('fn25_input_totalorderedqty', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['fn25_input_totalorderedqty'] = 'default_data'
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

