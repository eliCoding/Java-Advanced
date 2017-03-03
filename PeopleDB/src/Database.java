
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Elmira
 */
public class Database {

    private Connection conn;

    Database() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost/people", "root", "root");
    }

    public void addPerson(String name, int age) throws SQLException {

        String query = "INSERT INTO person VALUES(NULL, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, name);
        ps.setInt(2, age);
        ps.execute();
    }
}
