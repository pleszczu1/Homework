package Praca_domowa;

import java.util.Scanner;

public class J19_2 {

    public static void main(String[] args) {

            Plansza nowa = new Plansza();
            Scanner input = new Scanner(System.in);
            String gracz1 = "";
            String gracz = "";
            String gracz2 = "";
            boolean sprawdz = true;
            boolean zajete = true;
            boolean remis = true;

            int x;
            int y;

            System.out.println("Witam w grze kółko i krzyżyk ");
            System.out.println("Gracz numer 1 proszę wybrać \"X\" lub \"O\": ");
            gracz1 = input.nextLine().toUpperCase();
            if (gracz1.equals("X")) {
                System.out.println("Pierwszy gracz wybrał \"" + gracz1 + "\" drugiemu graczowi zostało \"O\"");
                gracz2 = "O";
            }else {
                System.out.println("Pierwszy gracz wybrał \"" + gracz1 + "\" drugiemu graczowi został \"X\"");
                gracz2 = "X";
            }
            nowa.rysujPlansze();
            gracz = gracz1;

            while(true){

                System.out.println("Grający: \"" + gracz + "\" podaj współrzędne gdzie chcesz wstawić swój znak: ");
                x = input.nextInt();
                if(nowa.czyDobraWsp(x) == false){
                    System.out.println("Podaj współrzędną jeszcze raz, musi być z przedziału 0-2: ");
                    x = input.nextInt();
                }
                y = input.nextInt();
                if(nowa.czyDobraWsp(y) == false){
                    System.out.println("Podaj współrzędną jeszcze raz, musi być z przedziału 0-2: ");
                    y = input.nextInt();
                }
                zajete = nowa.czyZajete(x,y);
                if(zajete == true){
                    System.out.println("Grający: \"" + gracz + "\" podaj współrzędne jeszcze raz: ");
                    x = input.nextInt();
                    y = input.nextInt();
                    nowa.wstawZnak(gracz, x, y);
                }else{
                    nowa.wstawZnak(gracz, x, y);
                }

                sprawdz = nowa.czyWygrana();
                if(sprawdz == true){
                    System.out.println("Wygrał gracz grający: \""+gracz+"\"");
                    break;
                }
                remis = nowa.czyRemis();
                if(remis == true){
                    System.out.println("Remis");
                    break;
                }

                if(gracz == gracz1){
                    gracz = gracz2;
                }else{
                    gracz = gracz1;
                }

            }
    }


}


