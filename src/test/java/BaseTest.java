import com.aventstack.extentreports.ExtentReports;
import io.restassured.RestAssured;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected static final String BASE_URI = "https://api.github.com";
    protected ExtentReports extent;

    @BeforeMethod
    public void setUpExtentReport() {
        extent = ExtentManager.getInstance();
    }

    @BeforeMethod
    public void setUp() {
        RestAssured.baseURI = BASE_URI;
    }

    @AfterMethod
    public void tearDownExtentReport() {
        extent.flush();
    }
}
