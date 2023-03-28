import org.example.entities.Vehicle;
import org.example.model.*;

public class Test {
    public static void main(String[] args) {
        String[][] data = Db.cityDistance();
        Freight freight = new Freight();
        Charge charge = new Charge();
        City city = new City();
        Product product = new Product();



        city.addCity(data[0][21], 21);
        freight.addCityOrigin(city);
        city.addCity(data[0][1], 1);
        freight.addCityDestiny(city);
        freight.setContractCompany("DRT");
        product.addProduct("Celular", 0.5);
        charge.addProduct(product, 300.0);
        product.addProduct("Geladeira", 60.0);
        charge.addProduct(product, 70.0);
        freight.addCharge(charge);
        System.out.println(freight.toString());

    }
}
