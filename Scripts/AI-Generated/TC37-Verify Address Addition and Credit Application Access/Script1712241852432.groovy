import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import katalon.common.accessTiDashboardAndCreditApplication
import katalon.common.accessCreditApplicationAndViewDetails
import katalon.common.clickObjectsInputDataAndInteractWithMultipleObjects
import katalon.common.addAddressAndContactPhone
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

accessTiDashboardAndCreditApplication.execute()

"Step 3: Call functional action"

WebUI.takeScreenshot()

addAddressAndContactPhone.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Call functional action"

WebUI.takeScreenshot()

clickObjectsInputDataAndInteractWithMultipleObjects.execute(data_path_1, Integer.valueOf(index_1))

"Step 5: Click on ti"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object'))

"Step 6: Click on ti"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_1'))

"Step 7: Enter input value in ti  -> Navigate to page ''"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tisloc/web/credit-application/en-us/apply?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_tisloc_web_credit_application_en_us_apply/ti_object_1'), ti_object)

"Step 8: Call functional action"

WebUI.takeScreenshot()

accessCreditApplicationAndViewDetails.execute()

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC37-Verify Address Addition and Credit Application Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
