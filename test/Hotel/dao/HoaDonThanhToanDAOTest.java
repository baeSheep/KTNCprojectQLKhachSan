/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Hotel.dao;

import Hotel.entity.HoaDonThanhToan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HoaDonThanhToanDAOTest {

    private HoaDonThanhToanDAO hoaDonThanhToanDAO;
    private HoaDonThanhToan testHoaDon;

    @Before
    public void setUp() {
        hoaDonThanhToanDAO = new HoaDonThanhToanDAO();
        testHoaDon = new HoaDonThanhToan("HD002", 1, "NV02", "KH004", "2021-09-01 13:15:00.000",
                "2021-09-07 12:40:45.000", 1898000, "2021-09-07 00:00:00.000");
    }

    @After
    public void tearDown() {
        hoaDonThanhToanDAO = null;
        testHoaDon = null;
    }

    @Test
    public void testSelect() {
        List<HoaDonThanhToan> result = hoaDonThanhToanDAO.select();
        assertNotNull(result);
        assertTrue(result.size() > 0);
    }

    @Test
    public void testInsertAndFindById() {
        hoaDonThanhToanDAO.insert(testHoaDon);
        HoaDonThanhToan insertedHoaDon = hoaDonThanhToanDAO.findById(testHoaDon.getMaHD());
        assertNotNull(insertedHoaDon);
        assertEquals(testHoaDon.getMaHD(), insertedHoaDon.getMaHD());
    }

    @Test
    public void testDelete() {
        hoaDonThanhToanDAO.delete(testHoaDon.getMaHD());
        HoaDonThanhToan deletedHoaDon = hoaDonThanhToanDAO.findById(testHoaDon.getMaHD());
        assertEquals(null, deletedHoaDon);
    }

    @Test
    public void testSelectByKeyWord() {
        List<HoaDonThanhToan> result = hoaDonThanhToanDAO.selectByKeyWord("NV02");
        assertNotNull(result);
        assertTrue(result.size() > 0);
    }

    @Test
    public void testSelectMonthsAndYears() {
        List<String> result = hoaDonThanhToanDAO.selectMonthsAndYears();
        assertNotNull(result);
        assertTrue(result.size() > 0);
    }
}


