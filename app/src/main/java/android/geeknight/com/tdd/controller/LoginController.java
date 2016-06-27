package android.geeknight.com.tdd.controller;

import android.geeknight.com.tdd.model.LoginValidator;
import android.geeknight.com.tdd.view.ILoginView;

public class LoginController {

  private ILoginView loginView;

  public LoginController(ILoginView loginView, LoginValidator loginValidator) {
    this.loginView = loginView;
  }

  public void performLogin(String email, String password) {

  }
}
