package Praca_domowa;

import java.util.Random;

public class Zadanie {

    public static void main(String[] args) {

        int[][] tablica = new int[5][5];
        Random rnd = new Random();
        int max = 0;
        int min = 0;

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = rnd.nextInt(11) - 5;
                System.out.printf("|%2d|",tablica[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < tablica.length; i++) {
            max = tablica[0][i];
            min = tablica[0][i];
            for (int j =0; j < tablica[i].length; j++) {
                max = (tablica[j][i] > max) ? tablica[j][i] : max;
                min = (tablica[j][i] < min) ? tablica[j][i] : min;
            }
            System.out.println("w kolumnie: "+ i + " min: "+ min+ " max: "+max);
        }
   }
}

