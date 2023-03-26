package org.example.application;

import org.example.model.Db;

import java.util.Scanner;

public class Program {
    public static void Start() {
        int option;
        Scanner sc =  new Scanner(System.in);


        do {
            System.out.println("********************************************************");
            System.out.println("*      SISTEMA DE GESTÃO DE FRETES ERICSSON v 1.0      *");
            System.out.println("********************************************************");
            System.out.println();
            System.out.println("********************************************************");
            System.out.println("*   DIGITE O NÚMERO DE QUAL OPERAÇÃO DESEJA EFETUAR    *");
            System.out.println("********************************************************");
            System.out.println("*            1 - Consultar trechos x modalidade        *");
            System.out.println("*            2 - Cadastrar transporte                  *");
            System.out.println("*            3 - relatorio de transportes              *");
            System.out.println("*            4 - Encerrar programa                     *");
            System.out.println("********************************************************");
            System.out.print("Digite aqui a operação:");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    String[][] data = Db.cityDistance();
                    //Imprime um menu com as cidades para o usuario escolher

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
                    int numberCity = sc.nextInt();

                    System.out.printf("A cidade de origem é %s", data[0][numberCity]);
                    System.out.println();

                    System.out.println("ESCOLHA A CIDADE DE DESTINO: ");
                    int numberCityDestiny = sc.nextInt();

                    System.out.println();
                    System.out.printf("\nA cidade de destino é %s\n", data[0][numberCityDestiny]);



                    String distance = data[numberCityDestiny+1][numberCity];
                    System.out.printf("A distancia entre a cidade de %s e %s é de %s KM", data[0][numberCity], data[0][numberCityDestiny], distance);
                    break;

                case 4:
                    System.out.println("Seu programa está sendo encerrado!");
                    //o método System.exit encerra o processamento do JVM. Passamos o valor 0 para exit() para indicar que ele irá terminar sem nenhum erro.
                    //se for passado um número diferente de 0 (como 1 ou -1) o compilador entende que irá terminar o programa com algum erro ou mensagem.
                    System.exit(0);
                    break;

            }
        } while (option != 0);
    }
}
