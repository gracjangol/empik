import com.aventstack.extentreports.ExtentTest;
import io.restassured.response.Response;
import org.testng.annotations.Test;


public class TestsGithub extends BaseTest {
    private GitHubUserEndpoint gitHubUserEndpoint = new GitHubUserEndpoint();

    @Test
    public void testGitHubUser() {
        ExtentTest test = extent.createTest("GitHub User Test");

        Response response = gitHubUserEndpoint.getUserInfo("octocat");

        String login = response.getBody().jsonPath().getString("login");

        Assertions.verifyLogin(test, "octocat", login);
    }


    @Test
    public void testGitHubStatusCode() {
        ExtentTest test = extent.createTest("GitHub Status Code Test");

        Response response = gitHubUserEndpoint.getUserInfo("octocat");

        Assertions.verifyStatusCode(test, 200, response.statusCode());
    }

}







