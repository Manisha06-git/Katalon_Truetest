import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://www-int.itg.ti.com/productreturns/docs/showAnalogSummary.tsp"

WebUI.navigateToUrl(GlobalVariable.application_domain + '/productreturns/docs/showAnalogSummary.tsp')

"Step 2: Click on link 'Modify return' -> Navigate to page 'productreturns/docs/editReturn.tsp'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showAnalogSummary_tsp/hyperlink_modify return'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showAnalogSummary.tsp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showAnalogSummary_tsp/hyperlink_modify return'))

"Step 3: Click on link 'Return details' -> Navigate to page 'productreturns/docs/showReturnDetails.tsp'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_editReturn_tsp/hyperlink_return details'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/editReturn.tsp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_editReturn_tsp/hyperlink_return details'))

"Step 4: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC16-Verify Modification of Return Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
