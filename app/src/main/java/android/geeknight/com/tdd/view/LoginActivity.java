package android.geeknight.com.tdd.view;

import android.geeknight.com.tdd.R;
import android.geeknight.com.tdd.controller.LoginController;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, ILoginView {

  private EditText emailField;
  private EditText passwordField;
  private LoginController loginController;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    emailField = (EditText) findViewById(R.id.email_text);
    passwordField = (EditText) findViewById(R.id.password_text);
    findViewById(R.id.login_button).setOnClickListener(this);
    loginController = new LoginController(this);
  }

  @Override
  public void onClick(View view) {
    if(view.getId() == R.id.login_button) {
      String email = emailField.getText().toString();
      String password = passwordField.getText().toString();
      loginController.performLogin(email, password);
    }
  }

  @Override
  public void onLoginSuccess() {

  }

  @Override
  public void onLoginFailure() {

  }
}
