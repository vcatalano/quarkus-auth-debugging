package demo;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class Profile {

  String email;

  String name;

  public Profile(String email, String name) {
    this.email = email;
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public String getName() {
    return this.name;
  }


}
