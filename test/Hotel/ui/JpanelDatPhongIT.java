import static org.junit.Assert.*;
import org.junit.*;
import java.sql.*;
import Hotel.dao.*;
import Hotel.entity.*;

public class JpanelDatPhongIT {

    // Biến dùng để thực hiện kết nối đến cơ sở dữ liệu
    private Connection connection;

    @Before
    public void setUp() {
        // Thực hiện kết nối đến cơ sở dữ liệu trước mỗi phương thức kiểm thử
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database_name?useSSL=false", "username", "password");
        } catch (SQLException e) {
            e.printStackTrace();
            fail("Không thể kết nối đến cơ sở dữ liệu.");
        }
    }

    @Test
    public void testInsertDatPhong() {
        // Dữ liệu mẫu
        String maDP = "3";
        String ngayDen = "2022-09-12 20:30:00.000";
        String ngayDi = "2022-09-12";
        String maNV = "NV06";
        String maKH = "KH011";
        String maPhong = "PT104";
        String maKieuThue = "K002";

        // Thực hiện thêm dữ liệu vào cơ sở dữ liệu
        try {
            DatPhongDAO dao = new DatPhongDAO(connection);
            DatPhong dp = new DatPhong(maDP, ngayDen, ngayDi, maNV, maKH, maPhong, maKieuThue);
            dao.insert(dp);

            // Kiểm tra xem dữ liệu đã được thêm thành công hay không
            DatPhong insertedDp = dao.findById(maDP);
            assertNotNull("Dữ liệu DatPhong không được thêm vào cơ sở dữ liệu.", insertedDp);

            // Kiểm tra xem dữ liệu được thêm vào có chính xác hay không
            assertEquals("Sai ngày đến.", ngayDen, insertedDp.getNgayDen());
            assertEquals("Sai ngày đi.", ngayDi, insertedDp.getNgayDi());
            assertEquals("Sai mã nhân viên.", maNV, insertedDp.getMaNV());
            assertEquals("Sai mã khách hàng.", maKH, insertedDp.getMaKH());
            assertEquals("Sai mã phòng.", maPhong, insertedDp.getMaPhong());
            assertEquals("Sai mã kiểu thuê.", maKieuThue, insertedDp.getMaKieuThue());
        } catch (Exception e) {
            e.printStackTrace();
            fail("Lỗi khi thêm dữ liệu DatPhong vào cơ sở dữ liệu.");
        }
    }

    @After
    public void tearDown() {
        // Đóng kết nối đến cơ sở dữ liệu sau mỗi phương thức kiểm thử
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
