
package minicrm.entity;

/**
 *
 * @author Elmira
 */
public class Customer {
    
    int customerID;
    String nameFirst;
    String nameLast;
    String address;
    String postalCode;
    String phoneNumber;
    String SIN;

    public Customer(int customerID, String nameFirst, String nameLast, String address, String postalCode, String phoneNumber, String SIN) {
        this.customerID = customerID;
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.address = address;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.SIN = SIN;
    }

    @Override
    public String toString() {
        return String.format( nameFirst+ ";" + nameLast + ";" + address + ";" + postalCode + ";" + phoneNumber + ";" + SIN);
    }

   
    
    
}
