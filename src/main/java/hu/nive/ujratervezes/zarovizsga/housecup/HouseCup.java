package hu.nive.ujratervezes.zarovizsga.housecup;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HouseCup {

    MariaDbDataSource dataSource;

    public HouseCup(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public int getPointsOfHouse(String house) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("select points_earned from house_points where house_name = ?")
                ) {
            ps.setString(1, house);

            try (ResultSet rs = ps.executeQuery()) {
                int sum = 0;
                while (rs.next()) {
                    sum += rs.getInt("points_earned");
                }
                return sum;
            } catch (SQLException e) {
                throw new IllegalStateException("Cannot query", e);
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect", e);
        }
    }
}
