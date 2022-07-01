package demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("/app")
public class LoginResource {

  @GET
  @Path("login")
  public Response login(@QueryParam("redirect") String redirect) {
    return Response.temporaryRedirect(URI.create("http://localhost:3000/dashboard")).build();
  }
}
