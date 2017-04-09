
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

class SQLExceptionResultEmpty extends SQLException {
}

public class Database {

    private Connection conn;

    Database() throws SQLException {
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/people",
                    "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void addPerson(String name, int age) throws SQLException {
        String query = "INSERT INTO person VALUES (NULL, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, name);
        ps.setInt(2, age);
        ps.execute();
    }

    public ArrayList<Person> getAllPersons() throws SQLException {
        final String SELECT_PERSON = "SELECT * FROM person";
        ArrayList<Person> result = new ArrayList<>();
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(SELECT_PERSON);
            while (rs.next()) {
                int id = rs.getInt("idperson");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                Person p = new Person(id, name, age);
                result.add(p);
            }
        }
        return result;
    }

    public Person getPersonById(int id) throws SQLException {
        String query = "SELECT * FROM person WHERE personid=" + id;
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            if (!rs.next()) {
                throw new SQLExceptionResultEmpty();
            }
            id = rs.getInt("idperson");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            Person p = new Person(id, name, age);
            return p;
        }
    }

    public void updatePerson(Person p) throws SQLException {
        String query = "UPDATE person SET name=?, age=? WHERE personid=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, p.name);
        ps.setInt(2, p.age);
        ps.setInt(3, p.id);
        ps.execute();
    }

    public void deletePerson(int id) throws SQLException {
        String query = "DELETE FROM PERSON WHERE personid=" + id;
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(query);
        }
    }
}
