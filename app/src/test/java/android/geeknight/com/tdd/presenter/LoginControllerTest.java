package android.geeknight.com.tdd.presenter;

import android.geeknight.com.tdd.controller.LoginController;
import android.geeknight.com.tdd.model.LoginValidator;
import android.geeknight.com.tdd.view.ILoginView;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class LoginControllerTest {

  @Test
  public void shouldNotifyViewForLoginSuccess() throws Exception {
    String email = "gurgaon@thoughtworks.com";
    String password = "$12345";
    LoginValidator validator = mock(LoginValidator.class);
    ILoginView view = mock(ILoginView.class);
    when(validator.isValid(email, password)).thenReturn(true);

    LoginController loginController = new LoginController(view, validator);

    loginController.performLogin(email, password);

    verify(view, times(1)).onLoginSuccess();
  }

  @Test
  public void shouldNotifyViewForLoginFailure() throws Exception {
    String email = "invalidmail@thoughtworks.com";
    String password = "$12345";
    LoginValidator validator = mock(LoginValidator.class);
    ILoginView view = mock(ILoginView.class);
    when(validator.isValid(email, password)).thenReturn(false);

    LoginController loginController = new LoginController(view, validator);

    loginController.performLogin(email, password);

    verify(view, times(1)).onLoginFailure();
  }
}