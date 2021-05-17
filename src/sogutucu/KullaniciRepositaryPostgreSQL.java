//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sogutucu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class KullaniciRepositaryPostgreSQL {
    public KullaniciRepositaryPostgreSQL() {
    }

    private Connection baglan() {
        Connection conn = null;
        Statement st = null;
        Object var3 = null;

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/untitled", "postgres", "Beratbyr241");
            if (conn != null) {
                System.out.println("Veritabanına bağlandı!");
            } else {
                System.out.println("Bağlantı girişimi başarısız!");
            }
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        return conn;
    }

    public boolean kullanıcıGiris(String isim, String sifre) {
        String sql = "SELECT count(kullanici_ismi) as giris FROM kullanici WHERE kullanici_ismi = '" + isim + "' AND sifre = '" + sifre + "'";
        Connection conn = this.baglan();
        Statement stmt = null;
        ResultSet rs = null;
        int x = 0;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            conn.close();
            rs.next();
            x = rs.getInt("giris");
        } catch (SQLException var9) {
            var9.printStackTrace();
        }

        return x == 1;
    }
}
