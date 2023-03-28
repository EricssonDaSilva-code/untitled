import org.example.entities.Vehicle;
import org.example.model.*;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[][] data = Db.cityDistance();
        Freight freight = new Freight();
        Charge charge = new Charge();
        City city = new City();
        Product product = new Product();
        List<Product> productList = new ArrayList<>();



        city.addCity(data[0][21], 21);
        freight.addCityOrigin(city);
        city.addCity(data[0][1], 1);
        freight.addCityDestiny(city);
        freight.setContractCompany("DRT");
        product.addProduct("Celular", 0.5);
        productList.add(product);
        product.addProduct("Geladeira", 60.0);
        productList.add(product);
        charge.addProduct((Product) productList, 70);
        freight.addCharge(charge);


    }
}
