import org.example.entities.Vehicle;
import org.example.entities.enums.TruckSize;
import org.example.model.Citys;
import org.example.model.Db;
import org.example.model.Product;
import org.example.services.FreightCalculator;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Vehicle truck = new Vehicle(TruckSize.PEQUENO);
        double cost = FreightCalculator.calculateStretch("2735", truck);
        System.out.println(cost);
        String[][] data = Db.cityDistance();
        List<Citys> citysList = new ArrayList<>();
        List<Product> productList = new ArrayList<>();
        String distance = data[11 + 1][12];
        Citys city = new Citys(data[0][12], 11, new Integer(distance), productList);
        System.out.println(city.toString());
        citysList.add(city);

        for (Citys c: citysList) {
            System.out.println(c.toString());
        }
    }
}
