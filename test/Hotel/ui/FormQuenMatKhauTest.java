package Hotel.ui;

import org.junit.Test;
import static org.junit.Assert.*;

public class FormQuenMatKhauTest {

    @Test
    public void testKhoiPhuc() {
        FormQuenMatKhau form = new FormQuenMatKhau();
        
        // Test khi mã nhân viên và email hợp lệ
        form.khoiphuc("NV01", "huyenpttps35245@fpt.edu.vn");
        // Kiểm tra rằng form xác nhận mật khẩu đã hiển thị
        assertTrue(form.isVisible());

        // Test khi mã nhân viên không tồn tại
        form.khoiphuc("NV999", "huyenpttps35245@fpt.edu.vn");
        // Kiểm tra rằng không có form xác nhận mật khẩu nào được hiển thị
        assertFalse(form.isVisible());
        
        // Test khi email không khớp với mã nhân viên
        form.khoiphuc("NV01", "email_khong_hop_le@domain.com");
        // Kiểm tra rằng không có form xác nhận mật khẩu nào được hiển thị
        assertFalse(form.isVisible());
        
        // Test khi gửi email thất bại (ví dụ: không có kết nối internet)
        form.khoiphuc("NV01", "huyenpttps35245@fpt.edu.vn");
        // Kiểm tra rằng không có form xác nhận mật khẩu nào được hiển thị
        assertFalse(form.isVisible());
    }
}
