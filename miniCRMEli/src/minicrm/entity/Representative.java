package minicrm.entity;

/**
 *
 * @author Elmira
 */
public class Representative {

    public int representativeID;
    public String nameFirst;
    public String nameLast;

    public Representative(int representativeID, String nameFirst, String nameLast) {
        this.representativeID = representativeID;
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
    }

    @Override
    public String toString() {
        return String.format( nameFirst + " " + nameLast);
    }

}
