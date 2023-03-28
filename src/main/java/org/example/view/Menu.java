package org.example.view;

import org.example.model.Db;

public class Menu {
    public static String actionMenu () {
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
        return null;
    }

    public static String arrayNames() {
        //Recebe uma matriz com os nomes e distancias entre cidades
        String[][] data = Db.cityDistance();
        //Gera uma matriz de 6 x 4 para exibir a escolha das cidades
        String[][] mat = new String[6][4];
        int marcador  = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = data[0][marcador];
                System.out.printf(marcador + " - " + "%-20s", mat[i][j]);
                marcador++;
            }
            System.out.println();
        }
        return null;
    }
    public static String modeOfTransportMenu() {
        System.out.println("********************************************************");
        System.out.println("*             ESCOLHA O TIPO DE TRANSPORTE             *");
        System.out.println("********************************************************");
        System.out.println();
        System.out.println("1 - Trasnporte rodoviario");
        System.out.println("********************************************************");
        return null;
    }

    public static String vehicleChoice() {
        System.out.println("********************************************************");
        System.out.println("*             ESCOLHA O TAMANHO DO VEICULO             *");
        System.out.println("********************************************************");
        System.out.println();
        System.out.println("1 - Caminhão pequeno (até 1 Ton)" +
                           "\n2 - Caminhão médio (até 4 Ton)" +
                           "\n3 - Caminhão grande (até 10Ton)");
        System.out.println("********************************************************");

        return null;
    }
}
