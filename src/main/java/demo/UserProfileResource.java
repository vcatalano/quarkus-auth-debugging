package demo;

import io.quarkus.oidc.UserInfo;
import io.quarkus.security.Authenticated;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/app")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserProfileResource {

  @Inject UserInfo userInfo;

  @GET
  @Path("profile")
  @Authenticated
  public Profile getUserProfile() {
    return new Profile(userInfo.getString("email"), userInfo.getString("name"));
  }
}
