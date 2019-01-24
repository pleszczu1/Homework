package Praca_domowa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J22_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String szukanyWyraz = "";
        String litera = "";
        String wybor = "";
        String wyraz = "";
        int index = 0;
        int licznik = 1;
        int dlugosc = 0;


        System.out.println("Witaj w grze wisielec. \n Podaj hasło do odgadnięcia: ");

        szukanyWyraz = input.nextLine().toLowerCase();
        dlugosc = szukanyWyraz.length();

        String[] zagadka = new String[dlugosc];
        String[] szyfr = new String[dlugosc];
        zagadka = szukanyWyraz.split("");

        for (int i = 0; i < zagadka.length; i++) {
            szyfr[i] = "_";
        }

        for (String str : szyfr) {
            System.out.print(" " + str);
        }

        System.out.println();
        System.out.println("Co chcesz zrobić:\n A - zgadujesz normalnie,\n B - zgadujesz w trzech podejściach,\n " +
                "C - znasz hasło i chcesz je wpisać w całości");
        wybor = input.nextLine().toUpperCase();

        if (wybor.equals("A")) {
            while (!Arrays.equals(zagadka, szyfr)) {
                System.out.println();
                System.out.println("Podaj literę: ");
                litera = input.nextLine().toLowerCase();
                if (!szukanyWyraz.contains(litera)) {
                    System.out.println("Nie ma takiej litery.");
                    for (String str : szyfr) {
                        System.out.print(" " + str);
                    }

                } else {
                    for (int j = 0; j < zagadka.length; j++) {
                        if (zagadka[j].equals(litera)) {
                            index = j;
                            szyfr[index] = litera;
                        }
                    }
                    for (String str : szyfr) {
                        System.out.print(" " + str);
                    }

                }
            }
            System.out.println();
            System.out.println("GRATULACJE");

        } else if (wybor.equals("B")) {
            while (licznik <= 3 || Arrays.equals(zagadka, szyfr)) {
                System.out.println();
                System.out.println("Podaj literę: ");
                litera = input.nextLine().toLowerCase();
                for (int j = 0; j < zagadka.length; j++) {
                    if (zagadka[j].equals(litera)) {
                        index = j;
                        szyfr[index] = litera;
                    }
                }
                for (String str : szyfr) {
                    System.out.print(" " + str);
                }
                if(Arrays.equals(zagadka, szyfr)){
                    System.out.println();
                    System.out.println("Gratulacje udało Ci się");
                    break;
                }
                licznik++;
            }if(!Arrays.equals(zagadka, szyfr)){
                System.out.println();
                System.out.println("Sorki 3 ruchy to za mało");
            }


        }else if(wybor.equals("C")){
            znamWyraz(input, zagadka);

        }

    }


    public static void znamWyraz(Scanner input, String[] zagadka) {
        String wyraz;
        String[] szyfr;
        System.out.println("Proszę podaj hasło: ");
        wyraz = input.nextLine();
        szyfr = wyraz.split("");
        if(Arrays.equals(szyfr, zagadka)){
            System.out.println("Gratulacje zgadłeś");
        }else {
            System.out.println("Sorki to nie ten wyraz");
        }
    }
}
