package org.example.application;

import org.example.entities.Vehicle;
import org.example.model.*;
import org.example.view.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.example.view.Menu.actionMenu;

public class Program {
    public static void Start() {
        int option;
        Scanner sc =  new Scanner(System.in);
        //Recebe uma matriz com os nomes e distancias entre cidades
        String[][] data = Db.cityDistance();
        List<City> citysList = new ArrayList<>();
        List<Product> productList = new ArrayList<>();

        do {
            String actionMenu = actionMenu();

            option = sc.nextInt();

            switch (option) {
                case 1:
                    //Imprime um menu com as cidades para o usuario escolher
                    String arrayNames = Menu.arrayNames();

                    System.out.println("ESCOLHA A CIDADE DE ORIGEM: ");
                    System.out.println();
                    //Guarda na variavel numberCity o número da coluna na linha 0 onde esta localizada o nome da cidade
                    System.out.print("-> ");
                    int numberCity = sc.nextInt();

                    System.out.printf("A cidade de origem é %s", data[0][numberCity]);
                    System.out.println();

                    System.out.println("ESCOLHA A CIDADE DE DESTINO: ");

                    //Guarda na variavel numberCityDestiny o número da coluna na linha 0 onde está localizado o nome da cidade de destino
                    System.out.print("-> ");
                    int numberCityDestiny = sc.nextInt();

                    System.out.println();
                    System.out.printf("\nA cidade de destino é %s\n", data[0][numberCityDestiny]);
                    //Exibe um submenu onde haveria a escolha do tipo de transporte, só coloquei o rodoviario portando ele
                    //apenas aparece na tela sem nenhuma interação
                    System.out.println();
                    String modeTransport = Menu.modeOfTransportMenu();
                    System.out.println();

                    //Exibe um menu para o usuario escolher qual dos 3 tipos de caminhões ele quer usar para calcular
                    //o frete
                    String vehicleChoiceMenu = Menu.vehicleChoice();

                    System.out.print("-> ");
                    int option2 = sc.nextInt();

                    Vehicle.TruckSize truck = null;
                    if (option2 == 1) {
                        truck = Vehicle.TruckSize.PEQUENO;
                    } else if (option2 == 2) {
                        truck = Vehicle.TruckSize.MEDIO;
                    } else if (option2 == 3) {
                        truck = Vehicle.TruckSize.GRANDE;

                    } else {
                        System.out.println("Escolha um opção válida");
                    }

                    System.out.println();
                    Double distance = Double.valueOf(data[numberCityDestiny + 1][numberCity]);
                    Double cost = distance * truck.getCostPerKm();
                    System.out.printf("A distancia entre a cidade de %s e %s é de %s KM, utilizando um caminhão %s " +
                                    " o custo será de R$%.2f reais.\n"
                            , data[0][numberCity], data[0][numberCityDestiny], distance, truck.getName(), cost);
                    break;
                case 2:
                    City city = new City();
                    Freight freight = new Freight();
                    Charge charge = new Charge();
                    System.out.print("Digite o nome da empresa contratante: ");
                    sc.nextLine();
                    String contractCompany = sc.nextLine();
                    freight.setContractCompany(contractCompany);

                    //Imprime um menu com as cidades para o usuario escolher
                    arrayNames = Menu.arrayNames();
                    System.out.println("ESCOLHA A CIDADE DE ORIGEM: ");
                    System.out.println();

                    //Guarda na variavel numberCity o número da coluna na linha 0 onde esta localizada o nome da cidade
                    System.out.print("-> ");
                    numberCity = sc.nextInt();
                    freight.addCityOrigin(city.addCity(data[0][numberCity], numberCity));

                    System.out.printf("A cidade de origem é %s", data[0][numberCity]);
                    System.out.println();

                    System.out.println("ESCOLHA A CIDADE DE DESTINO: ");
                    //Guarda na variavel numberCityDestiny o número da coluna na linha 0 onde está localizado o nome da cidade de destino
                    System.out.print("-> ");
                    numberCityDestiny = sc.nextInt();
                    freight.addCityDestiny(city.addCity(data[0][numberCityDestiny], numberCityDestiny));
                    System.out.printf("\nA cidade de destino é %s\n", data[0][numberCityDestiny]);

                    System.out.println();

                    System.out.print("Quantos produtos diferentes deseja cadastrar?");
                    int items = sc.nextInt();

                    for (int i = 0; i < items; i++) {
                        System.out.print("Nome do produto: ");
                        sc.nextLine();
                        String productName = sc.nextLine();
                        System.out.print("Peso do produto: ");
                        Double productWeight = sc.nextDouble();
                        System.out.println("Quantidade a ser transportada: ");
                        Integer quantity = sc.nextInt();
                        Product product = new Product(productName, productWeight);
                        System.out.println(product.toString());
                        charge.addProduct(product, quantity);
                        System.out.println(charge.toString());
                    }
                    freight.addCharge(charge);
                    System.out.println(freight.toString());

                    System.out.println(freight.toString());

                case 4:
                    System.out.println("Seu programa está sendo encerrado!");
                    //o método System.exit encerra o processamento do JVM. Passamos o valor 0 para exit() para indicar que ele irá terminar sem nenhum erro.
                    //se for passado um número diferente de 0 (como 1 ou -1) o compilador entende que irá terminar o programa com algum erro ou mensagem.
                    System.exit(0);
                    break;

                default:
                    System.out.println("Selecione uma opção válida");

            }
        } while (option != 0);
    }
}
