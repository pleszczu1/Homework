package Praca_domowa;

import java.util.Arrays;
import java.util.Random;

public class J20 {

    public static void main(String[] args) {

        int[] liczby = new int[20];
        int[] liczniki = new int[11];
        int licznik = 0;
        Random rnd = new Random();

        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = rnd.nextInt(10) + 1;
        }

        for(int k: liczby){
            System.out.print(k+" ");
        }
        for (int x : liczby) {
            liczniki[x] +=1;
        }
        System.out.println();
        for(int i = 1; i < liczniki.length; i++){
            if(liczniki[i] != 0) {
                System.out.println("Liczba: " + i + " występuje: " + liczniki[i] + " razy w ciągu wylosowanych liczb");
            }else {
                System.out.println("Liczba: " + i + " nie występuje w ciągu wylosowanych liczb");
            }
        }
    }
}




