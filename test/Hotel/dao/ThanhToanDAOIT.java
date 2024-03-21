/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Hotel.dao;

import Hotel.entity.HoaDonThanhToan;
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
public class ThanhToanDAOIT {
    private  ThanhToanDAO thanhToanDAO;
    public ThanhToanDAOIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        thanhToanDAO = new ThanhToanDAO();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of selectYears method, of class ThanhToanDAO.
     */
    @Test
    public void testSelectYears() {
        // Call the selectYears() method
        List<Integer> years = thanhToanDAO.selectYears();

        assertNotNull(years);
        assertFalse(years.isEmpty());
        assertTrue(years.contains(2024));
        assertTrue(years.contains(2023));
        // ...
    }

    /**
     * Test of selectHoaDons method, of class ThanhToanDAO.
     */    
}
