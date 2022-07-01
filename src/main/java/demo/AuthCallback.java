package demo;

import org.jboss.resteasy.annotations.cache.NoCache;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.net.URI;

@Path("/app/auth")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AuthCallback {

  @Context UriInfo uriInfo;

  @GET
  @Path("/callback")
  @NoCache
  public Response callback() {
    return Response.temporaryRedirect(URI.create("http://localhost:3000/dashboard")).build();
  }
}
