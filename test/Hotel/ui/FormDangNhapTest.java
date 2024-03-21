package Hotel.ui;

import Hotel.ui.FormDangNhap;
import Hotel.utils.ShareHelper;
import org.junit.Test;
import static org.junit.Assert.*;

public class FormDangNhapTest {
    
    @Test
    public void testLoginWithCorrectCredentials() {
        // Kiểm tra khi người dùng nhập tên đăng nhập và mật khẩu đúng.
        FormDangNhap form = new FormDangNhap();
        form.txtUsername.setText("NV01");
        form.txtPassword.setText("Thuyhuyen");
        form.login();
        assertNotNull(ShareHelper.USER);
    }

    @Test
    public void testLoginWithIncorrectPassword() {
        // Kiểm tra khi người dùng nhập tên đăng nhập đúng nhưng mật khẩu sai.
        FormDangNhap form = new FormDangNhap();
        form.txtUsername.setText("NV01");
        form.txtPassword.setText("skajka");
        form.login();
        assertNull(ShareHelper.USER);
    }

    @Test
    public void testLoginWithIncorrectUsername() {
        // Kiểm tra khi người dùng nhập tên đăng nhập sai.
        FormDangNhap form = new FormDangNhap();
        form.txtUsername.setText("abc0");
        form.txtPassword.setText("Thuyhuyen");
        form.login();
        assertNull(ShareHelper.USER);
    }

    @Test
    public void testRememberPasswordCheckbox() {
        // Kiểm tra tính năng "Nhớ mật khẩu" khi được chọn 
        FormDangNhap form = new FormDangNhap();
        form.cboNho.setSelected(true);
        form.txtUsername.setText("NV01");
        form.txtPassword.setText("Thuyhuyen");
        form.saveCheckBoxState();
        form.readFromFile();
        assertEquals("NV01", form.txtUsername.getText());
        assertEquals("Thuyhuyen", String.valueOf(form.txtPassword.getPassword()));
    }
    @Test
public void testLoginWithEmptyCredentials() {
    // Kiểm tra khi người dùng không nhập tên đăng nhập và mật khẩu.
    FormDangNhap form = new FormDangNhap();
    form.txtUsername.setText("");
    form.txtPassword.setText("");
    form.login();
    assertNull(ShareHelper.USER);
}


    @Test
    public void testForgotPasswordLink() {
        // Kiểm tra khi người dùng nhấn nút "Quên mật khẩu".
        FormDangNhap form = new FormDangNhap();
        form.lblQuenMKMouseClicked(null);
      
    }
}
