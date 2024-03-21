/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel.ui;



import Hotel.entity.HoaDonThanhToan;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JpanelHoaDonTest {

    @Test
    public void testInitHoaDon() {
        try {
            // Chuẩn bị dữ liệu mẫu cho kiểm thử
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            Date ngayBD = dateFormat.parse("2021-09-01 13:15:00.000");
            Date ngayTra = dateFormat.parse("2021-09-07 12:40:45.000");
            Date ngayLap = dateFormat.parse("2021-09-07 12:40:45.000");

            HoaDonThanhToan hd = new HoaDonThanhToan("HD003", 1, "NV02", "KH077", "2024-02-01 13:15:00.000", "2021-02-03 12:40:45.000", 1898000, "2024-01-07 12:40:45.000");

            // Tạo một instance của JpanelHoaDon
            Main mainForm = new Main(); 
            JpanelHoaDon panel = new JpanelHoaDon(mainForm);

            // Gọi phương thức initHoaDon
            panel.initHoaDon();

            // Lấy danh sách hiện tại từ bảng
            HoaDonThanhToan displayedHD = panel.listHD.get(0);

            // Kiểm tra xem dữ liệu đã được khởi tạo đúng hay không
            assertNotNull(displayedHD);
            assertEquals(hd.getMaHD(), displayedHD.getMaHD());
            assertEquals(hd.getMaDP(), displayedHD.getMaDP());
            assertEquals(hd.getMaNV(), displayedHD.getMaNV());
            assertEquals(hd.getMaKH(), displayedHD.getMaKH());
            assertEquals(hd.getNgayThue(), displayedHD.getNgayThue());
            assertEquals(hd.getNgayTraD(), displayedHD.getNgayTraD());
            assertEquals(hd.getThanhTien(), displayedHD.getThanhTien(), 0.001); // So sánh số thực với sai số 0.001
            assertEquals(hd.getNgayLap(), displayedHD.getNgayLap());
        } catch (ParseException e) {
            // Bắt ngoại lệ nếu có lỗi xảy ra trong quá trình chuyển đổi ngày tháng
            e.printStackTrace();
        }
    }
}


