package easbasdat;
import java.sql.*;

public class rekapDAO {
    private Connection conn;

    public rekapDAO(Connection conn) {
        this.conn = conn;
    }

    // Memanggil stored procedure berdasarkan jenis rekap (mingguan/bulanan)
    public void tampilkanRekap(String jenis) {
        String procedure = jenis.equalsIgnoreCase("mingguan") ? "rekap_mingguan" : "rekap_bulanan";
        String call = "{CALL " + procedure + "()}";
        try (CallableStatement stmt = conn.prepareCall(call)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("ID Ruang: " + rs.getInt("id_ruang") +
                                   ", Jumlah Rapat: " + rs.getInt("jumlah_rapat"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
