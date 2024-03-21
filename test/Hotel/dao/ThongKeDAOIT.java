/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Hotel.dao;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Phạm Thị Thuý Huyền
 */
public class ThongKeDAOIT {
            private ThongKeDAO thongKeDAO;

    public ThongKeDAOIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        thongKeDAO = new ThongKeDAO();
        // Các thiết lập khác nếu cần thiếts
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDoanhThuPhong method, of class ThongKeDAO.
     */
     @Test
    public void testGetDoanhThuPhong() {
        // Tạo các tham số đầu vào cho phương thức
        int thang = 9;
        int nam = 2022;

        // Gọi phương thức để lấy danh sách kết quả
        List<Object[]> doanhThuPhong = thongKeDAO.getDoanhThuPhong(thang, nam);

        // Kiểm tra kết quả trả về
        assertNotNull(doanhThuPhong);
        assertFalse(doanhThuPhong.isEmpty());

        // Kiểm tra cấu trúc của mỗi mục trong danh sách kết quả
        for (Object[] item : doanhThuPhong) {
            assertEquals(4, item.length);
            assertNotNull(item[0]); // STT
            assertNotNull(item[1]); // MaPhong
            assertNotNull(item[2]); // PhuThu
            assertNotNull(item[3]); // ThanhTien
        }
    }

    @Test
    public void testGetDoanhThuDV() {
        // Tạo các tham số đầu vào cho phương thức
        int thang = 9;
        int nam = 2022;

        // Gọi phương thức để lấy danh sách kết quả
        List<Object[]> doanhThuDV = thongKeDAO.getDoanhThuDV(thang, nam);

        // Kiểm tra kết quả trả về
        assertNotNull(doanhThuDV);
        assertFalse(doanhThuDV.isEmpty());

        // Kiểm tra cấu trúc của mỗi mục trong danh sách kết quả
        for (Object[] item : doanhThuDV) {
            assertEquals(6, item.length);
            assertNotNull(item[0]); // STT
            assertNotNull(item[1]); // MaDV
            assertNotNull(item[2]); // TenDV
            assertNotNull(item[3]); // Số lượng
            assertNotNull(item[4]); // Gia
            assertNotNull(item[5]); // Thành Tiền
        }
    }
}
