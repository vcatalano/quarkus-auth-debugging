package demo;

import io.quarkus.vertx.web.Route;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.FileSystemAccess;
import io.vertx.ext.web.handler.StaticHandler;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StaticRoutes {

  @Route(path = "/login", methods = Route.HttpMethod.GET)
  void login(RoutingContext rc) {
    StaticHandler.create(FileSystemAccess.RELATIVE, "content/index.html").handle(rc);
  }

  @Route(path = "/dashboard", methods = Route.HttpMethod.GET)
  void dashboard(RoutingContext rc) {
    StaticHandler.create(FileSystemAccess.RELATIVE, "content/dashboard.html").handle(rc);
  }

}