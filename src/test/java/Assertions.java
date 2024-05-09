import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.Assert;

public class Assertions {

        public static void verifyLogin(ExtentTest test, String expectedLogin, String actualLogin) {
            if (!expectedLogin.equals(actualLogin)) {
                test.log(Status.FAIL, "Expected login '" + expectedLogin + "' but received: " + actualLogin);
                Assert.fail("Expected login '" + expectedLogin + "' but received: " + actualLogin);
            } else {
                test.log(Status.PASS, "Received expected login '" + expectedLogin + "'");
            }
        }

        public static void verifyStatusCode(ExtentTest test, int expectedStatusCode, int actualStatusCode) {
            if (expectedStatusCode != actualStatusCode) {
              test.log(Status.FAIL, "Expected status code " + expectedStatusCode + " but received: " + actualStatusCode);
             Assert.fail("Expected status code " + expectedStatusCode + " but received: " + actualStatusCode);
            } else {
            test.log(Status.PASS, "Received status code " + expectedStatusCode + " as expected");
            }
        }

}
