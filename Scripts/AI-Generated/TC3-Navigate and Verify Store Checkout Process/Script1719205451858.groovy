import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://www-int.itg.ti.com/store/en-us/samples-checkout"

TrueTestScripts.navigate('/store/en-us/samples-checkout')

"Step 2: Click on link cart -> Navigate to page 'store/en-us/samples-cart'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/store/en-us/samples-checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_store_en_us_samples_checkout/link_cart'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2: Click on link cart - Navigate to page storeen-ussamples-cart.png')

"Step 3: Click on ti addToSamplesCart"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/store/en-us/samples-cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_store_en_us_samples_cart/ti_addToSamplesCart'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3: Click on ti addToSamplesCart.png')

"Step 4: Click on header roleHeading -> Navigate to page ''"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/store/en-us/samples-cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_store_en_us_samples_cart/header_roleHeading'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4: Click on header roleHeading - Navigate to page .png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Navigate and Verify Store Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
