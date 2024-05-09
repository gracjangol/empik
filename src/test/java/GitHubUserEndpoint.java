import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GitHubUserEndpoint {
    public Response getUserInfo(String username) {
        Response response = RestAssured.given()
                .get("/users/" + username);
        return response;
    }
}
