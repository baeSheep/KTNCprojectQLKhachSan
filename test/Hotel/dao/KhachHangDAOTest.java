package Hotel.dao;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Hotel.dao.KhachHangDAO;
import Hotel.entity.KhachHang;
import static org.junit.Assert.assertNotEquals;

public class KhachHangDAOTest {

    private KhachHangDAO khachHangDAO;

    @Before
    public void setUp() {
        khachHangDAO = new KhachHangDAO();

    }

    @After
    public void tearDown() {

    }

    @Test
    public void testInsert() {
        KhachHang khachHang = new KhachHang();
        khachHang.setMaKH("KH001");
        khachHang.setTenKH("Giang Vo");
        khachHang.setSoDT("123456789");
        khachHang.setCCCD("123456789");
        khachHang.setGioiTinh(true);
        khachHang.setDiaChi("Ho Chi Minh");

        khachHangDAO.insert(khachHang);

        KhachHang retrievedKhachHang = khachHangDAO.findById("KH001");
        assertNotNull(retrievedKhachHang);  
        assertEquals("Giang Vo", retrievedKhachHang.getTenKH());
    }

    @Test
    public void testSelectByKeyword() {

        List<KhachHang> khachHangList = khachHangDAO.selectByKeyword("Giang");
        assertEquals(1, khachHangList.size());
        assertEquals("Giang Vo", khachHangList.get(0).getTenKH());
    }

    @Test
    public void testSelect() {

        List<KhachHang> khachHangList = khachHangDAO.select();
        assertNotNull(khachHangList);
        // Kiểm tra dữ liệu trả về có ít nhất một phần tử hay không
        assertNotEquals(0, khachHangList.size());
    }

    @Test
    public void testFindById() {

        KhachHang retrievedKhachHang = khachHangDAO.findById("KH00");
        assertNotNull(retrievedKhachHang);
        assertEquals("Giang Vo", retrievedKhachHang.getTenKH());

        KhachHang nonExistentKhachHang = khachHangDAO.findById("KH0");
        assertNull(nonExistentKhachHang);
    }
}
