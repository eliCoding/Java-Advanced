package minicrm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import minicrm.entity.Customer;
import minicrm.entity.Interaction;
import minicrm.entity.Representative;

/**
 *
 * @author Elmira
 */
public class Database {

    private Connection conn;

    public Database() throws SQLException {

        conn = DriverManager.getConnection("jdbc:sqlite:minicrm.db");
    }

    public ArrayList<Representative> getAllReps() throws SQLException {
        final String query = "SELECT * FROM Representative";
        ArrayList<Representative> result = new ArrayList<>();
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("representetiveID");
                String nameFirst = rs.getString("nameFirst");
                String namelast = rs.getString("nameLast");
                Representative r = new Representative(id, nameFirst, namelast);
                result.add(r);
            }
        }
        return result;
    }

    public void addRep(String nameFirst, String nameLast) throws SQLException {
        String query = "INSERT INTO Representative VALUES (NULL, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, nameFirst);
        ps.setString(2, nameLast);

        ps.execute();
    }

    public ArrayList<Customer> getAllCusts() throws SQLException {
        final String query = "SELECT * FROM Customers";
        ArrayList<Customer> result = new ArrayList<>();
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("customerID");
                String nameFirst = rs.getString("nameFirst");
                String namelast = rs.getString("nameLast");
                String address = rs.getString("address");
                String postalCode = rs.getString("postalCode");
                String phoneNumber = rs.getString("phoneNumber");
                String SIN = rs.getString("SIN");

                Customer c = new Customer(id, nameFirst, namelast, address, postalCode, phoneNumber, SIN);
                result.add(c);
            }
        }
        return result;
    }

    public void addCust(String nameFirst, String nameLast, String address, String postalCode, String phoneNo, String SIN) throws SQLException {
        String query = "INSERT INTO Customers VALUES (NULL,?, ?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, nameFirst);
        ps.setString(2, nameLast);
        ps.setString(3, address);
        ps.setString(4, postalCode);
        ps.setString(5, phoneNo);
        ps.setString(6, SIN);

        ps.execute();
    }

    public ArrayList<Interaction> getAllInteractions() throws SQLException {
        final String query = "SELECT * FROM Interaction";
        ArrayList<Interaction> result = new ArrayList<>();
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int interactionId = rs.getInt("interactionID");
                int customerID = rs.getInt("customerID");
                int repID = rs.getInt("repID");
                // Date date = rs.getDate("date");
                String date = rs.getString("date");
                String notes = rs.getString("notes");

                Interaction i = new Interaction(interactionId, customerID, repID,date, notes);
                result.add(i);
            }
        }
        return result;

    }

    public void addInteraction(int customerId, int repId, String date, String notes) throws SQLException {
        String query = "INSERT INTO Interaction VALUES (NULL,?, ?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, customerId);
        ps.setInt(2, repId);
        //ps.setDate(3, (java.sql.Date) date);
        ps.setString(3, date);
        ps.setString(4, notes);

        ps.execute();
    }

}
