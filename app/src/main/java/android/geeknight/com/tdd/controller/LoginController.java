package android.geeknight.com.tdd.controller;

import android.geeknight.com.tdd.model.LoginValidator;
import android.geeknight.com.tdd.view.ILoginView;

public class LoginController {

  private ILoginView loginView;
  private LoginValidator loginValidator;

  public LoginController(ILoginView loginView, LoginValidator loginValidator) {
    this.loginView = loginView;
    this.loginValidator = loginValidator;
  }

  public void performLogin(String email, String password) {
    if (loginValidator.isValid(email, password)) {
      loginView.onLoginSuccess();
    } else {
      loginView.onLoginFailure();
    }
  }
}
