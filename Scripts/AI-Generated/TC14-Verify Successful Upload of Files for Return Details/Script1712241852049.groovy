import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import katalon.common.enterContactDetailsOrderPartsAndProvideReturnDetails
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

"Step 3: Click on link 'Upload files' -> Navigate to page 'productreturns/docs/showfileUpload.tsp'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_productreturns_docs_showReturnDetails_tsp/hyperlink_upload files'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/productreturns/docs/showReturnDetails.tsp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_productreturns_docs_showReturnDetails_tsp/hyperlink_upload files'))

"Step 4: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC14-Verify Successful Upload of Files for Return Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
