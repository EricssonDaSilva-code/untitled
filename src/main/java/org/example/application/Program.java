package org.example.application;

import org.example.entities.Vehicle;
import org.example.entities.enums.TruckSize;
import org.example.model.Citys;
import org.example.model.Db;
import org.example.model.Freight;
import org.example.model.Product;
import org.example.services.FreightCalculator;
import org.example.view.Menus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.example.view.Menus.actionMenu;

public class Program {
    public static void Start() {
        int option;
        Scanner sc =  new Scanner(System.in);
        //Recebe uma matriz com os nomes e distancias entre cidades
        String[][] data = Db.cityDistance();
        List<Citys> citysList = new ArrayList<>();
        List<Product> productList = new ArrayList<>();

        do {
            String actionMenu = actionMenu();

            option = sc.nextInt();

            switch (option) {
                case 1:
                    //Imprime um menu com as cidades para o usuario escolher
                    String arrayNames = Menus.arrayNames();

                    System.out.println("ESCOLHA A CIDADE DE ORIGEM: ");
                    System.out.println();
                    //Guarda na variavel numberCity o número da coluna na linha 0 onde esta localizada o nome da cidade
                    System.out.print("-> ");
                    int numberCity = sc.nextInt();

                    System.out.printf("A cidade de origem é %s", data[0][numberCity]);
                    System.out.println();

                    System.out.println("ESCOLHA A CIDADE DE DESTINO: ");

                    //Guarda na variavel numberCityDestiny o númeroi da coluna na linha 0 onde está localizado o nome da cidade de destino
                    System.out.print("-> ");
                    int numberCityDestiny = sc.nextInt();

                    System.out.println();
                    System.out.printf("\nA cidade de destino é %s\n", data[0][numberCityDestiny]);
                    //Exibe um submenu onde haveria a escolha do tipo de transporte, só coloquei o rodoviario portando ele
                    //apenas aparece na tela sem nenhuma interação
                    System.out.println();
                    String modeTransport = Menus.modeOfTransportMenu();
                    System.out.println();

                    //Exibe um menu para o usuario escolher qual dos 3 tipos de caminhões ele quer usar para calcular
                    //o frete
                    String vehicleChoiceMenu = Menus.vehicleChoice();

                    System.out.print("-> ");
                    int option2 = sc.nextInt();


                    Vehicle truck = new Vehicle();
                    if (option2 == 1) {
                        truck = new Vehicle(TruckSize.PEQUENO);
                    } else if (option2 == 2) {
                        truck = new Vehicle(TruckSize.MEDIO);
                    } else if (option2 == 3) {
                        truck = new Vehicle(TruckSize.GRANDE);

                    } else {
                        System.out.println("Escolha um opção válida");
                    }

                    System.out.println();
                    String distance = data[numberCityDestiny + 1][numberCity];
                    double cost = FreightCalculator.calculateStretch(distance, truck);
                    System.out.printf("A distancia entre a cidade de %s e %s é de %s KM, utilizando um caminhão %s " +
                                    " o custo será de R$%.2f reais.\n"
                            , data[0][numberCity], data[0][numberCityDestiny], distance, truck.getSize().toString(), cost);
                    break;
                case 2:
                    data = Db.cityDistance();
                    System.out.println("********************************************************");
                    System.out.println("*                  CADASTRO DE FRETE                   *");
                    System.out.println("********************************************************");
                    System.out.println();
                    System.out.print("Digite o nome da empresa contratante: ");
                    String requestingCompany = sc.nextLine();

                    //Imprime um menu com as cidades para o usuario escolher
                    arrayNames = Menus.arrayNames();

                    System.out.println("ESCOLHA A CIDADE DE ORIGEM: ");

                    System.out.print("-> ");
                    numberCity = sc.nextInt();

                    System.out.printf("A cidade de origem é %s", data[0][numberCity]);
                    System.out.println();

                    String choice;
                    do {
                        int cont = 0;
                        System.out.println("ESCOLHA A CIDADE DE DESTINO: ");

                        System.out.print("-> ");
                        numberCityDestiny = sc.nextInt();

                        System.out.println();
                        System.out.printf("\nA cidade de destino é %s\n", data[0][numberCityDestiny]);

                        System.out.println("********************************************************");
                        System.out.println("*      ENTRE COM OS PRODUTOS A SEREM TRANSPORTADOS     *");
                        System.out.println("********************************************************");
                        System.out.println();
                        System.out.println();
                        System.out.println("Quantos tipos de produtos deseja transportar? ");
                        int quantity = sc.nextInt();
                        for (int i=0; i < quantity; i++) {
                            System.out.print("-> Tipo de produto: ");
                            sc.nextLine();
                            String name = sc.nextLine();

                            System.out.print("-> Digite o peso do produto: ");
                            double weight = sc.nextDouble();

                            System.out.print("-> Digite a quantidade a ser transportada: ");
                            int amount = sc.nextInt();
                            System.out.println();
                            Product product = new Product(name, weight, amount);
                            productList.add(product);
                        }

                        System.out.print("Continuar cadastrando mais destinos? [S/N]");
                        sc.nextLine();
                        choice = sc.nextLine().toUpperCase();

                        System.out.println();
                        distance = data[numberCityDestiny + 1][numberCity];
                        Integer distanceInt = Integer.valueOf(distance);
                        Citys city = new Citys(data[0][numberCity], numberCityDestiny, distanceInt, productList);
                        citysList.add(city);
                        for (Citys p: citysList) {
                            System.out.println(citysList.toString());
                        }
                        numberCity = numberCityDestiny;
                    } while (!(choice == "N"));
                    break;

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
