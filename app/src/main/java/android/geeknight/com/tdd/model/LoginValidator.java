package android.geeknight.com.tdd.model;

public class LoginValidator {
  public boolean isValid(String email, String password) {
    return email.equals("gurgaon@thoughtworks.com") && password.equals("$12345");
  }
}
