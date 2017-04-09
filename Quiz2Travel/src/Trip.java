
import java.util.Date;

public class Trip {

    String destination;
    String travellerName;
    String travellerPassportNo;
    Date departureDate;
    Date returnDate;

    public Trip(String destination, String travellerName, String travellerPassportNo, Date departureDate, Date returnDate) {
        this.destination = destination;
        this.travellerName = travellerName;
        this.travellerPassportNo = travellerPassportNo;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return String.format("%s(%s) to %s on %s", travellerName, travellerPassportNo, destination, departureDate);
    }

}
