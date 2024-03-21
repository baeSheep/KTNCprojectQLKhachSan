/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel.ui;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

public class FormHoaDonChiTietTest {

    @Test
    public void testInitDataWithValidData() {
        try {
            String maHD = "HD003";
            Main mainForm = new Main(); // Main class should be properly initialized
            FormHoaDonChiTiet form = new FormHoaDonChiTiet(maHD, mainForm);
            form.initData();

            // Check if data is correctly initialized
            assertEquals("HD003", form.txtMaHD.getText());
            assertEquals("2022-09-12 00:00:00.000", form.txtNgayThue.getText());
            assertEquals("0", form.txtPhuThu.getText());

            // Check if combo box contains correct items
            assertTrue(form.cboMaDV.getItemCount() > 0); // Make sure combo box is not empty

        } catch (Exception e) {
            fail("An unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test
    public void testInitDataWithInvalidData() {
        try {
            String maHD = "HD003"; // Using invalid ID to fetch data
            Main mainForm = new Main(); // Main class should be properly initialized
            FormHoaDonChiTiet form = new FormHoaDonChiTiet(maHD, mainForm);
            form.initData();

            // The code should throw an exception when trying to fetch data with invalid ID
            fail("No exception thrown when invalid data is provided.");

        } catch (Exception e) {
            // Check if the correct exception is thrown
            assertTrue(e instanceof NullPointerException);
        }
    }
}


