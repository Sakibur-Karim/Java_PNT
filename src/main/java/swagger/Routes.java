package swagger;
// Swagger URI :---> https://petstore.swagger.io/v2
/* Get user (Get): https://petstore.swagger.io/v2/user/{username}
 * Create user (Post): https://petstore.swagger.io/v2/user
 * Update user (Put): https://petstore.swagger.io/v2/user/{username}
 * Delete user (Delete):https://petstore.swagger.io/v2/user/{username}
*/
public class Routes {
    public static String base_url = "https://petstore.swagger.io/v2";

    public static String post_url = base_url + "/user";

    public static String get_url = base_url + "/user/{username}";

    public static String put_url = base_url + "/user/{username}";

    public static String del_url = base_url + "/user/{username}";

}
