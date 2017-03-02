
public class Car {
    
    String MakeModel;
    int yop;
    double SecsTo100;

    public Car(String MakeModel, int yop, double SecsTo100) {
        this.MakeModel = MakeModel;
        this.yop = yop;
        this.SecsTo100 = SecsTo100;
    }

    @Override
    public String toString() {
        return String.format("%s From %d has %f",MakeModel,yop,SecsTo100);
    }
    
    
}
