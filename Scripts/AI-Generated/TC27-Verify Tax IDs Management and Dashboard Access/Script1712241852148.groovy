import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.exploreTaxIDsAndManageTaxCountries
import katalon.common.navigateMytiDashboardAndTaxIDs
import internal.GlobalVariable as GlobalVariable

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

exploreTaxIDsAndManageTaxCountries.execute()

"Step 3: Call functional action"

WebUI.takeScreenshot()

navigateMytiDashboardAndTaxIDs.execute()

"Step 4: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC27-Verify Tax IDs Management and Dashboard Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
