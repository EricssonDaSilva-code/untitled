package org.example.application;

import org.example.entities.Vehicle;
import org.example.entities.enums.TruckSize;
import org.example.model.Db;
import org.example.services.FreightCalculator;
import org.example.view.Menus;

import java.util.Scanner;

import static org.example.view.Menus.actionMenu;

public class Program {
    public static void Start() {
        int option;
        Scanner sc =  new Scanner(System.in);
        String actionMenu = actionMenu();
        String modeTransport = Menus.modeOfTransportMenu();


        do {
            actionMenu();

            option = sc.nextInt();

            switch (option) {
                case 1:
                    //Imprime um menu com as cidades para o usuario escolher
                    String[][] data = Db.cityDistance();
                    String[][] mat = new String[6][4];
                    int marcador  = 0;

                    System.out.println("ESCOLHA A CIDADE DE ORIGEM: ");

                    System.out.println();
                    for (int i=0; i < 6; i++) {
                        for (int j = 0; j < 4; j++) {
                            mat[i][j] = data[0][marcador];
                            System.out.printf(marcador + " - " + "%-20s", mat[i][j]);
                            marcador ++;
                        }
                        System.out.println();
                    }
                    System.out.print("-> ");
                    int numberCity = sc.nextInt();

                    System.out.printf("A cidade de origem é %s", data[0][numberCity]);
                    System.out.println();

                    System.out.println("ESCOLHA A CIDADE DE DESTINO: ");
                    System.out.print("-> ");
                    int numberCityDestiny = sc.nextInt();

                    System.out.println();
                    System.out.printf("\nA cidade de destino é %s\n", data[0][numberCityDestiny]);

                    System.out.println();
                    String modeTransport1 = modeTransport;
                    System.out.println();

                    String vehicleChoiceMenu = Menus.vehicleChoice();

                    System.out.print("-> ");
                    int option2 = sc.nextInt();

                    Vehicle truck = new Vehicle();
                    if (option2 == 1) {
                        truck = new Vehicle(TruckSize.SMALL);
                    }

                    else if (option2 == 2){
                        truck = new Vehicle(TruckSize.MID);
                    }

                    else if (option2 == 3) {
                        truck = new Vehicle(TruckSize.LARGE);

                    }

                    else {
                        System.out.println("Escolha um opção válida");
                    }

                    System.out.println();
                    String distance = data[numberCityDestiny+1][numberCity];
                    double cost = FreightCalculator.calculateStretch(distance, truck);
                    System.out.printf("A distancia entre a cidade de %s e %s é de %s KM, utilizando um caminhão %s " +
                            " o custo será de R$%.2f reais.\n"
                            , data[0][numberCity], data[0][numberCityDestiny], distance, truck.getSize().toString(), cost);
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
