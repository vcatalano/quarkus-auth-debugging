package demo;

import javax.ws.rs.GET;
import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("/app")
public class LogoutCallbackResource {

  @Context HttpHeaders headers;

  @GET
  @Path("/logout/callback")
  public String logout() {
    Cookie cookie = headers.getCookies().get("q_post_logout");
    if (cookie == null) {
      throw new InternalServerErrorException("q_post_logout cookie is not available");
    }

    return "test";
//    return Response.temporaryRedirect(URI.create("http://localhost:3000/auth/sign-in"))
//        .header("Set-Cookie", "q_auth=; Max-Age=0; Expires=Fri, 24 Jun 2000 02:30:18 GMT; Path=/")
//        .build();
  }
}
