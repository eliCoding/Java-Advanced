package minicrm.entity;

import java.sql.Date;

/**
 *
 * @author ipd
 */
public class Interaction {

    int interactionId;
    int customerId;
    int repId;
    String Date;
    String notes;

    public Interaction(int interactionId, int customerId, int repId, String Date, String notes) {
        this.interactionId = interactionId;
        this.customerId = customerId;
        this.repId = repId;
        this.Date = Date;
        this.notes = notes;
    }

    @Override
    public String toString() {
        return customerId + ";" + repId + ";" + Date + ";" + notes;
    }

}
