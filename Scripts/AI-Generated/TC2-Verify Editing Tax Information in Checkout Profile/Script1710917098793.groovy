import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://www-int.itg.ti.com/checkoutprofile/web/tax"

WebUI.navigateToUrl(GlobalVariable.application_domain + '/checkoutprofile/web/tax')

"Step 2: Click on span"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax/span_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax/span_object'))

"Step 3: Click on span  -> Navigate to page 'checkoutprofile/web/tax/add'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax/span_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax/span_object'))

"Step 4: Click on select 'taxCountryIsoCode'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/select_taxcountryisocode'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/select_taxcountryisocode'))

"Step 5: Click on select 'taxCountryIsoCode'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/select_taxcountryisocode'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/select_taxcountryisocode'))

"Step 6: Click on select 'taxCountryIsoCode'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/select_taxcountryisocode'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/select_taxcountryisocode'))

"Step 7: Click on select 'taxCountryIsoCode'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/select_taxcountryisocode'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/select_taxcountryisocode'))

"Step 8: Click on ti 'specialInvoiceRadio'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/ti_specialinvoiceradio'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/ti_specialinvoiceradio'))

"Step 9: Click on ti 'specialInvoiceRadio'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/ti_specialinvoiceradio'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/ti_specialinvoiceradio'))

"Step 10: Click on input field 'invoiceTitle'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'))

"Step 11: Click on input field 'invoiceTitle'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'))

"Step 12: Enter input value in input field 'invoiceTitle'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), input_invoicetitle)

"Step 13: Enter input value in input field 'invoiceTitle'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), input_invoicetitle_1)

"Step 14: Click on input field 'invoiceTitle'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'))

"Step 15: Click on input field 'invoiceTitle'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'))

"Step 16: Enter input value in input field 'invoiceTitle'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), input_invoicetitle_2)

"Step 17: Enter input value in input field 'invoiceTitle'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), input_invoicetitle_3)

"Step 18: Click on input field 'taxRegistrationNumber'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_taxregistrationnumber'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_taxregistrationnumber'))

"Step 19: Click on input field 'taxRegistrationNumber'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_taxregistrationnumber'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_taxregistrationnumber'))

"Step 20: Click on input field 'invoiceTitle'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'))

"Step 21: Click on input field 'invoiceTitle'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'))

"Step 22: Enter input value in input field 'invoiceTitle'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), input_invoicetitle_4)

"Step 23: Enter input value in input field 'invoiceTitle'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), input_invoicetitle_5)

"Step 24: Click on input field 'invoiceTitle'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'))

"Step 25: Click on input field 'invoiceTitle'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'))

"Step 26: Enter input value in input field 'invoiceTitle'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), input_invoicetitle_6)

"Step 27: Click on section"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'))

"Step 28: Enter input value in input field 'invoiceTitle'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), input_invoicetitle_7)

"Step 29: Click on section"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'))

"Step 30: Enter input value in input field 'invoiceTitle'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), input_invoicetitle_8)

"Step 31: Click on p"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/p_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/p_object'))

"Step 32: Enter input value in input field 'invoiceTitle'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), input_invoicetitle_9)

"Step 33: Click on p"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/p_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/p_object'))

"Step 34: Click on ti 'cancelBtn'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/ti_cancelbtn'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/ti_cancelbtn'))

"Step 35: Click on ti 'cancelBtn' -> Navigate to page 'checkoutprofile/web/tax'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/ti_cancelbtn'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/ti_cancelbtn'))

"Step 36: Click on span"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax/span_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax/span_object'))

"Step 37: Click on span  -> Navigate to page 'checkoutprofile/web/tax/add'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax/span_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax/span_object'))

"Step 38: Click on select 'taxCountryIsoCode'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/select_taxcountryisocode'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/select_taxcountryisocode'))

"Step 39: Click on select 'taxCountryIsoCode'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/select_taxcountryisocode'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/select_taxcountryisocode'))

"Step 40: Click on select 'taxCountryIsoCode'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/select_taxcountryisocode'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/select_taxcountryisocode'))

"Step 41: Click on select 'taxCountryIsoCode'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/select_taxcountryisocode'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/select_taxcountryisocode'))

"Step 42: Click on ti 'specialInvoiceRadio'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/ti_specialinvoiceradio'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/ti_specialinvoiceradio'))

"Step 43: Click on ti 'specialInvoiceRadio'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/ti_specialinvoiceradio'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/ti_specialinvoiceradio'))

"Step 44: Click on input field 'invoiceTitle'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'))

"Step 45: Click on input field 'invoiceTitle'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'))

"Step 46: Enter input value in input field 'invoiceTitle'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), input_invoicetitle_10)

"Step 47: Click on p"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/p_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/p_object_1'))

"Step 48: Enter input value in input field 'invoiceTitle'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_invoicetitle'), input_invoicetitle_11)

"Step 49: Click on p"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/p_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/p_object_1'))

"Step 50: Click on input field 'recepientName'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_recepientname'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_recepientname'))

"Step 51: Click on input field 'recepientName'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_recepientname'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_recepientname'))

"Step 52: Click on input field 'companyName'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_companyname'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_companyname'))

"Step 53: Click on input field 'companyName'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_companyname'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_companyname'))

"Step 54: Enter input value in input field 'companyName'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_companyname'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_companyname'), input_companyname)

"Step 55: Enter input value in input field 'companyName'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_companyname'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_companyname'), input_companyname_1)

"Step 56: Enter input value in input field 'vatInvoicePhoneNumber'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_vatinvoicephonenumber'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_vatinvoicephonenumber'), input_vatinvoicephonenumber)

"Step 57: Click on input field 'address1'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_address1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_address1'))

"Step 58: Enter input value in input field 'vatInvoicePhoneNumber'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_vatinvoicephonenumber'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_vatinvoicephonenumber'), input_vatinvoicephonenumber_1)

"Step 59: Click on input field 'address1'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_address1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_address1'))

"Step 60: Click on div"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/div_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/div_object'))

"Step 61: Click on div"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/div_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/div_object'))

"Step 62: Click on input field 'address1'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_address1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_address1'))

"Step 63: Click on input field 'address1'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_address1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_address1'))

"Step 64: Click on input field 'town'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_town'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_town'))

"Step 65: Click on input field 'town'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_town'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_town'))

"Step 66: Click on input field 'state'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_state'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_state'))

"Step 67: Click on input field 'state'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_state'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_state'))

"Step 68: Click on input field 'town'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_town'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_town'))

"Step 69: Click on input field 'town'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_town'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_town'))

"Step 70: Click on div"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/div_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/div_object'))

"Step 71: Click on div"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/div_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/div_object'))

"Step 72: Click on section"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'))

"Step 73: Click on section"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'))

"Step 74: Enter input value in input field 'town'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_town'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_town'), input_town)

"Step 75: Click on section"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'))

"Step 76: Enter input value in input field 'town'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_town'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_town'), input_town_1)

"Step 77: Click on section"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'))

"Step 78: Enter input value in input field 'state'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_state'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_state'), input_state)

"Step 79: Click on section"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'))

"Step 80: Enter input value in input field 'state'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_state'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_state'), input_state_1)

"Step 81: Click on section"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'))

"Step 82: Enter input value in input field 'address1'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_address1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_address1'), input_address1)

"Step 83: Click on section"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'))

"Step 84: Enter input value in input field 'address1'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_address1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_address1'), input_address1_1)

"Step 85: Click on section"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'))

"Step 86: Enter input value in input field 'companyName'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_companyname'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_companyname'), input_companyname_2)

"Step 87: Click on div"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/div_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/div_object'))

"Step 88: Enter input value in input field 'companyName'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_companyname'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_companyname'), input_companyname_3)

"Step 89: Click on div"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/div_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/div_object'))

"Step 90: Click on section"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'))

"Step 91: Click on section"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/section_object'))

"Step 92: Enter input value in input field 'companyName'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_companyname'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_companyname'), input_companyname_4)

"Step 93: Enter input value in input field 'companyName'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_companyname'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_companyname'), input_companyname_5)

"Step 94: Click on input field ' submitbtn'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_submitbtn'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_submitbtn'))

"Step 95: Click on input field ' submitbtn' -> Navigate to page 'checkoutprofile/web/tax'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_submitbtn'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkoutprofile/web/tax/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkoutprofile_web_tax_add/input_submitbtn'))

"Step 96: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Editing Tax Information in Checkout Profile_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
