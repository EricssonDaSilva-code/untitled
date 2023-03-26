package org.example.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Db {
    public static String[][] cityDistance() {
        String path = "C:\\Users\\dasil\\Desktop\\PUC DELL\\DNIT-Distancias.csv";
        // Obtem o número de linhas e de colunas
        String[][] data;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            int rows = 0;
            int columns = 0;
            String line = br.readLine();
            while (line != null) {
                rows++;
                String[] array = line.split(";");
                if (columns == 0) {
                    columns = array.length;
                }
                line = br.readLine();
            }

            //Cria a Matriz para armazenar os dados do arquivo .CSV
            data = new String[rows][columns];

            //Lê novamente o arquivo CSV e adiciona os dados na matriz
            int row = 0;
            br.close();
            BufferedReader br2 = new BufferedReader(new FileReader(path));
            line = br2.readLine();
            while (line != null) {
                String[] array = line.split(";");
                for (int col = 0; col < columns; col++) {
                    data[row][col] = array[col];
                }
                row++;
                line = br2.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
}