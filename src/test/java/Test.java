import org.example.entities.Vehicle;
import org.example.entities.enums.TruckSize;
import org.example.services.FreightCalculator;

public class Test {
    public static void main(String[] args) {
        Vehicle truck = new Vehicle(TruckSize.SMALL);
        double cost = FreightCalculator.calculateStretch("2735", truck);
        System.out.println(cost);
    }
}
