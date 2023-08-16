import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page_buyer_login'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/buyer/login')

'step 2: At Page_buyer_login click on input_loginkey'

testObj = findTestObject('Object Repository/Page_buyer_login/input_loginkey')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/buyer/login(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_buyer_login input on input_loginkey'

testObj = findTestObject('Object Repository/Page_buyer_login/input_loginkey')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/buyer/login(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_input_loginkey)

'step 4: At Page_buyer_login click on input_password'

testObj = findTestObject('Object Repository/Page_buyer_login/input_password')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/buyer/login(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page_buyer_login input on input_password'

testObj = findTestObject('Object Repository/Page_buyer_login/input_password')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/buyer/login(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_2_input_password)

'step 6: At Page_buyer_login click on button_object'

testObj = findTestObject('Object Repository/Page_buyer_login/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/buyer/login(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: At Page_buyer_login click on div_object'

testObj = findTestObject('Object Repository/Page_buyer_login/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/buyer/login(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: At Page_buyer_login input on input_loginkey'

testObj = findTestObject('Object Repository/Page_buyer_login/input_loginkey')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/buyer/login(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_3_input_loginkey)

'step 9: At Page_buyer_login click on div_object'

testObj = findTestObject('Object Repository/Page_buyer_login/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/buyer/login(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 10: At Page_buyer_login input on input_password'

testObj = findTestObject('Object Repository/Page_buyer_login/input_password')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/buyer/login(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_4_input_password)

'step 11: At Page_buyer_login click on button_object'

testObj = findTestObject('Object Repository/Page_buyer_login/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/buyer/login(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 12: At Page_buyer_login click on button_object'

testObj = findTestObject('Object Repository/Page_buyer_login/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/buyer/login(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 13: At Page_buyer_login click on hyperlink_buyer_signup --> navigate to Page_buyer_signup'

testObj = findTestObject('Object Repository/Page_buyer_login/hyperlink_buyer_signup')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/buyer/login(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 14: Add visual checkpoint at Page_buyer_signup'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00000_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
