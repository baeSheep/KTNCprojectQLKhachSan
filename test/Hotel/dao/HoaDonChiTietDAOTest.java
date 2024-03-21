/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Hotel.dao;

import Hotel.entity.HoaDonChiTiet;
import Hotel.entity.HoaDonThanhToan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HoaDonChiTietDAOTest {

    private HoaDonChiTietDAO hoaDonChiTietDAO;
    private HoaDonChiTiet testHoaDonChiTiet;
    
    private HoaDonThanhToanDAO hoaDonThanhToanDAO;
    private HoaDonThanhToan testHoaDon;

    @Before
    public void setUp() {
        hoaDonThanhToanDAO = new HoaDonThanhToanDAO();
        testHoaDon = new HoaDonThanhToan("HD002", 1, "NV02", "KH004", "2021-09-01 13:15:00.000",
                "2021-09-07 12:40:45.000", 1898000, "2021-09-07 00:00:00.000");
        
        hoaDonChiTietDAO = new HoaDonChiTietDAO();
        testHoaDonChiTiet = new HoaDonChiTiet("HD002", "DV01", "2022-09-01 00:00:00.000", 0);
    }

    @After
    public void tearDown() {
        hoaDonChiTietDAO = null;
        testHoaDonChiTiet = null;
    }

    @Test
    public void testInsertAndFindById() {
        hoaDonChiTietDAO.insert(testHoaDonChiTiet);
        HoaDonChiTiet insertedHoaDonChiTiet = hoaDonChiTietDAO.findById(testHoaDonChiTiet.getMaHD());
        assertNotNull(insertedHoaDonChiTiet);
        assertEquals(testHoaDonChiTiet.getMaHD(), insertedHoaDonChiTiet.getMaHD());
    }

    @Test
    public void testDelete() {
        hoaDonChiTietDAO.delete(testHoaDonChiTiet.getMaHD());
        HoaDonChiTiet deletedHoaDonChiTiet = hoaDonChiTietDAO.findById(testHoaDonChiTiet.getMaHD());
        assertEquals(null, deletedHoaDonChiTiet);
    }

    @Test
    public void testSelect() {
        List<HoaDonChiTiet> result = hoaDonChiTietDAO.select();
        assertNotNull(result);
    }
}


