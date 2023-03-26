package org.example.view;

public class Menus {
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
