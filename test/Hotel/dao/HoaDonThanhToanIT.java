/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Hotel.dao;

import Hotel.entity.HoaDonThanhToan;
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
public class HoaDonThanhToanIT {
    
    public HoaDonThanhToanIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class HoaDonThanhToan.
     */
     @Test
    public void testToString() {
        // Create a HoaDonThanhToan object with test data
        HoaDonThanhToan hoaDon = new HoaDonThanhToan();
        hoaDon.setNgayLap("2022-01-01");
        hoaDon.setNgayThue("2022-01-01");
        hoaDon.setNgayTraD("2022-01-02");

        // Call the toString() method
        String result = hoaDon.toString();

        // Perform assertions to verify the result
        assertEquals("2022-01-01 (2022-01-01)", result);
    }
    /**
     * Test of getMaHD method, of class HoaDonThanhToan.
     */
    @Test
    public void testGetMaHD() {
        // Create a HoaDonThanhToan object
        HoaDonThanhToan instance = new HoaDonThanhToan();

        // Get the MaHD value
        String result = instance.getMaHD();

        // Assert that the initial MaHD value is an empty string
        assertEquals("", result);
    }

    @Test
    public void testSetMaHD() {
        // Create a HoaDonThanhToan object
        HoaDonThanhToan instance = new HoaDonThanhToan();

        // Set the MaHD value
        String MaHD = "HD001";
        instance.setMaHD(MaHD);

        // Get the MaHD value and assert that it matches the expected value
        String result = instance.getMaHD();
        assertEquals(MaHD, result);
    }
    /**
     * Test of getMaDP method, of class HoaDonThanhToan.
     */
    @Test
    public void testGetMaDP() {
        // Create a HoaDonThanhToan object
        HoaDonThanhToan instance = new HoaDonThanhToan();

        // Get the MaDP value
        int result = instance.getMaDP();

        // Assert that the initial MaDP value is 0
        assertEquals(0, result);
    }

    @Test
    public void testSetMaDP() {
        // Create a HoaDonThanhToan object
        HoaDonThanhToan instance = new HoaDonThanhToan();

        // Set the MaDP value
        int MaDP = 123;
        instance.setMaDP(MaDP);

        // Get the MaDP value and assert that it matches the expected value
        int result = instance.getMaDP();
        assertEquals(MaDP, result);
    }

    @Test
    public void testGetMaNV() {
        // Create a HoaDonThanhToan object
        HoaDonThanhToan instance = new HoaDonThanhToan();

        // Get the MaNV value
        String result = instance.getMaNV();

        // Assert that the initial MaNV value is an empty string
        assertEquals("", result);
    }

    /**
     * Test of setMaNV method, of class HoaDonThanhToan.
     */
    @Test
    public void testSetMaNV() {
        // Create a HoaDonThanhToan object
        HoaDonThanhToan instance = new HoaDonThanhToan();

        // Set the MaNV value
        String MaNV = "ABC";
        instance.setMaNV(MaNV);

        // Get the MaNV value and assert that it matches the expected value
        String result = instance.getMaNV();
        assertEquals(MaNV, result);
    }

    @Test
    public void testGetMaKH() {
        // Create a HoaDonThanhToan object
        HoaDonThanhToan instance = new HoaDonThanhToan();

        // Get the MaKH value
        String result = instance.getMaKH();

        // Assert that the initial MaKH value is an empty string
        assertEquals("", result);
    }

    @Test
    public void testSetMaKH() {
        // Create a HoaDonThanhToan object
        HoaDonThanhToan instance = new HoaDonThanhToan();

        // Set the MaKH value
        String MaKH = "123";
        instance.setMaKH(MaKH);

        // Get the MaKH value and assert that it matches the expected value
        String result = instance.getMaKH();
        assertEquals(MaKH, result);
    }

    @Test
    public void testGetNgayThue() {
        // Create a HoaDonThanhToan object
        HoaDonThanhToan instance = new HoaDonThanhToan();

        // Get the NgayThue value
        String result = instance.getNgayThue();

        // Assert that the initial NgayThue value is an empty string
        assertEquals("", result);
    }

    @Test
    public void testSetNgayThue() {
        // Create a HoaDonThanhToan object
        HoaDonThanhToan instance = new HoaDonThanhToan();

        // Set the NgayThue value
        String NgayThue = "2022-01-01";
        instance.setNgayThue(NgayThue);

        // Get the NgayThue value and assert that it matches the expected value
        String result = instance.getNgayThue();
        assertEquals(NgayThue, result);
    }
    /**
     * Test of getNgayTraD method, of class HoaDonThanhToan.
     */
    @Test
    public void testGetNgayTraD() {
        System.out.println("getNgayTraD");
        HoaDonThanhToan instance = new HoaDonThanhToan();
        String expResult = "";
        String result = instance.getNgayTraD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNgayTraD method, of class HoaDonThanhToan.
     */
    @Test
    public void testSetNgayTraD() {
        System.out.println("setNgayTraD");
        String NgayTraD = "";
        HoaDonThanhToan instance = new HoaDonThanhToan();
        instance.setNgayTraD(NgayTraD);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNgayLap method, of class HoaDonThanhToan.
     */
    @Test
    public void testGetNgayLap() {
        System.out.println("getNgayLap");
        HoaDonThanhToan instance = new HoaDonThanhToan();
        String expResult = "";
        String result = instance.getNgayLap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNgayLap method, of class HoaDonThanhToan.
     */
    @Test
    public void testSetNgayLap() {
        System.out.println("setNgayLap");
        String ngayLap = "";
        HoaDonThanhToan instance = new HoaDonThanhToan();
        instance.setNgayLap(ngayLap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getThanhTien method, of class HoaDonThanhToan.
     */
    @Test
    public void testGetThanhTien() {
        // Create a HoaDonThanhToan object
        HoaDonThanhToan instance = new HoaDonThanhToan();

        // Get the ThanhTien value
        float result = instance.getThanhTien();

        // Assert that the initial ThanhTien value is 0.0
        assertEquals(0.0F, result, 0);
    }

    @Test
    public void testSetThanhTien() {
        // Create a HoaDonThanhToan object
        HoaDonThanhToan instance = new HoaDonThanhToan();

        // Set the ThanhTien value
        float thanhTien = 100.0F;
        instance.setThanhTien(thanhTien);

        // Get the ThanhTien value and assert that it matches the expected value
        float result = instance.getThanhTien();
        assertEquals(thanhTien, result, 0);
    }
    
}
