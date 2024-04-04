import katalon.common.submitFormWithMultipleUploadDescriptions
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import katalon.common.enterContactDetailsOrderPartsAndProvideReturnDetails
import katalon.common.uploadFilesSubmitFormAndViewDraftInformation
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://www-int.itg.ti.com/"

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

"Step 2: Call functional action"

WebUI.takeScreenshot()

enterContactDetailsOrderPartsAndProvideReturnDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Call functional action"

WebUI.takeScreenshot()

uploadFilesSubmitFormAndViewDraftInformation.execute(data_path_1, Integer.valueOf(index_1))

"Step 4: Call functional action"

WebUI.takeScreenshot()

submitFormWithMultipleUploadDescriptions.execute()

"Step 5: Click on button 'Submit1' -> Navigate to page 'productreturns/docs/showAnalogSummary.tsp'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showfileUpload_tsp/button_submit1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showfileUpload.tsp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showfileUpload_tsp/button_submit1'))

"Step 6: Click on link 'Modify return' -> Navigate to page 'productreturns/docs/editReturn.tsp'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showAnalogSummary_tsp/hyperlink_modify return'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showAnalogSummary.tsp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showAnalogSummary_tsp/hyperlink_modify return'))

"Step 7: Click on link 'Upload files' -> Navigate to page 'productreturns/docs/showfileUpload.tsp'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_editReturn_tsp/hyperlink_upload files'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/editReturn.tsp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_editReturn_tsp/hyperlink_upload files'))

"Step 8: Click on button 'Submit1' -> Navigate to page 'productreturns/docs/showAnalogSummary.tsp'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showfileUpload_tsp/button_submit1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showfileUpload.tsp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showfileUpload_tsp/button_submit1'))

"Step 9: Click on link 'Modify return'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showAnalogSummary_tsp/hyperlink_modify return'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showAnalogSummary.tsp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showAnalogSummary_tsp/hyperlink_modify return'))

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC36-Verify Contact Details Entry and Form Submission Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
