import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import katalon.common.submitProductReturnsAndModifyReturn
import katalon.common.uploadFilesAndSubmitDescriptions
import katalon.common.uploadFilesSelectUploadDescriptionAndSubmit
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://www-int.itg.ti.com/productreturns/docs/createReturn.tsp"

WebUI.navigateToUrl(GlobalVariable.application_domain + '/productreturns/docs/createReturn.tsp')

"Step 2: Click on link 'Product returns' -> Navigate to page 'productreturns/docs/productReturnLists'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/hyperlink_product returns'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/createReturn.tsp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_createReturn_tsp/hyperlink_product returns'))

"Step 3: Click on link  -> Navigate to page ''"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_productReturnLists/hyperlink_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/productReturnLists?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_productReturnLists/hyperlink_object'))

"Step 4: Call functional action"

WebUI.takeScreenshot()

uploadFilesAndSubmitDescriptions.execute()

"Step 5: Call functional action"

WebUI.takeScreenshot()

submitProductReturnsAndModifyReturn.execute()

"Step 6: Call functional action"

WebUI.takeScreenshot()

uploadFilesSelectUploadDescriptionAndSubmit.execute()

"Step 7: Click on button 'Submit1' -> Navigate to page 'productreturns/docs/showAnalogSummary.tsp'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showfileUpload_tsp/button_submit1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showfileUpload.tsp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showfileUpload_tsp/button_submit1'))

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC35-Verify Product Returns Submission and File Upload Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
