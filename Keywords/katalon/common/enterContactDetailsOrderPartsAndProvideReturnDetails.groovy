package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling

public class enterContactDetailsOrderPartsAndProvideReturnDetails {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on input field 'contactState'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/input_contactstate'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/createReturn.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/input_contactstate'))
        "Step 2: Enter input value in input field 'contactState'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/input_contactstate'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/createReturn.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/input_contactstate'), data['fn18_input_contactstate'])
        "Step 3: Click on select 'contactCountryCode'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/select_contactcountrycode'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/createReturn.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/select_contactcountrycode'))
        "Step 4: Enter input value in input field 'contactPhone'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/input_contactphone'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/createReturn.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/input_contactphone'), data['fn18_input_contactphone'])
        "Step 5: Click on input field 'orderablePartNumber'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/input_orderablepartnumber'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/createReturn.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/input_orderablepartnumber'))
        "Step 6: Enter input value in input field 'orderablePartNumber'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/input_orderablepartnumber'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/createReturn.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/input_orderablepartnumber'), data['fn18_input_orderablepartnumber'])
        "Step 7: Click on list item"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/li_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/createReturn.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/li_object'))
        "Step 8: Click on label"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/label_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/createReturn.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/label_object'))
        "Step 9: Click on label"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/label_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/createReturn.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/label_object_1'))
        "Step 10: Click on input field 'purchaseType'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/input_purchasetype'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/createReturn.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/input_purchasetype'))
        "Step 11: Click on label"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/label_object_2'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/createReturn.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/label_object_2'))
        "Step 12: Click on input field 'endCustchk'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/input_endcustchk'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/createReturn.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/input_endcustchk'))
        "Step 13: Click on button 'Submit1' -> Navigate to page 'productreturns/docs/showReturnDetails.tsp'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/button_submit1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/createReturn.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/button_submit1'))
        "Step 14: Click on label"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showReturnDetails_tsp/label_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showReturnDetails.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showReturnDetails_tsp/label_object'))
        "Step 15: Click on input field 'reasonForReturn'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showReturnDetails_tsp/input_reasonforreturn'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showReturnDetails.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showReturnDetails_tsp/input_reasonforreturn'))
        "Step 16: Click on select 'defectApplicationId'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showReturnDetails_tsp/select_defectapplicationid'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showReturnDetails.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showReturnDetails_tsp/select_defectapplicationid'))
        "Step 17: Click on select 'defectPlaceId'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showReturnDetails_tsp/select_defectplaceid'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showReturnDetails.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showReturnDetails_tsp/select_defectplaceid'))
        "Step 18: Click on select 'electricalSubType'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showReturnDetails_tsp/select_electricalsubtype'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showReturnDetails.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showReturnDetails_tsp/select_electricalsubtype'))
        "Step 19: Enter input value in textarea 'provideDetailsForElectricalIssue'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showReturnDetails_tsp/textarea_providedetailsforelectricalissue'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showReturnDetails.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_productreturns_docs_showReturnDetails_tsp/textarea_providedetailsforelectricalissue'), data['fn18_textarea_providedetailsforelectricalissue'])
        "Step 20: Click on button 'Submit1'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showReturnDetails_tsp/button_submit1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showReturnDetails.tsp?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showReturnDetails_tsp/button_submit1'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['fn18_input_contactstate'] = testData.getValue('fn18_input_contactstate', rowIndex)
        data['fn18_input_contactphone'] = testData.getValue('fn18_input_contactphone', rowIndex)
        data['fn18_input_orderablepartnumber'] = testData.getValue('fn18_input_orderablepartnumber', rowIndex)
        data['fn18_textarea_providedetailsforelectricalissue'] = testData.getValue('fn18_textarea_providedetailsforelectricalissue', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['fn18_input_contactstate'] = 'default_data'
        data['fn18_input_contactphone'] = 'default_data'
        data['fn18_input_orderablepartnumber'] = 'default_data'
        data['fn18_textarea_providedetailsforelectricalissue'] = 'default_data'
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

