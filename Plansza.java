package Praca_domowa;

public class Plansza {

    String[][] plansza = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};

    public void wstawZnak(String znak, int x, int y) {
        plansza[x][y] = znak;
        rysujPlansze();
    }

    public void rysujPlansze() {
        System.out.println("    0 1 2");
        System.out.println("0   " + plansza[0][0] + "|" + plansza[0][1] + "|" + plansza[0][2]);
        System.out.println("   -------");
        System.out.println("1   " + plansza[1][0] + "|" + plansza[1][1] + "|" + plansza[1][2]);
        System.out.println("   -------");
        System.out.println("2   " + plansza[2][0] + "|" + plansza[2][1] + "|" + plansza[2][2]);
    }

    public boolean czyWygrana() {
        if ((plansza[0][0] == plansza[0][1] && plansza[0][1] == plansza[0][2] && plansza[0][2] != " ") ||
                (plansza[1][0] == plansza[1][1] && plansza[1][1] == plansza[1][2] && plansza[1][2] != " ") ||
                (plansza[2][0] == plansza[2][1] && plansza[2][1] == plansza[2][2] && plansza[2][2] != " ") ||
                (plansza[0][0] == plansza[1][0] && plansza[1][0] == plansza[2][0] && plansza[2][0] != " ") ||
                (plansza[0][1] == plansza[1][1] && plansza[1][1] == plansza[2][1] && plansza[2][1] != " ") ||
                (plansza[0][2] == plansza[1][2] && plansza[1][2] == plansza[2][2] && plansza[2][2] != " ") ||
                (plansza[0][0] == plansza[1][1] && plansza[1][1] == plansza[2][2] && plansza[2][2] != " ") ||
                (plansza[0][2] == plansza[1][1] && plansza[1][1] == plansza[2][0] && plansza[2][0] != " ")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean czyZajete(int x, int y){
        if(plansza[x][y].equals("X") || plansza[x][y].equals("O")){
            System.out.println("To pole jest zajęte, podaj inne współrzędne: ");
            return true;
        }
        return false;
    }

    public boolean czyRemis() {
        if (((plansza[0][0].equals("X") || plansza[0][0].equals("O")) && (plansza[0][1].equals("X") || plansza[0][1].equals("O")) &&
                        (plansza[0][2].equals("X") || plansza[0][2].equals("O")) && (plansza[1][0].equals("X") || plansza[1][0].equals("O")) &&
                (plansza[1][1].equals("X") || plansza[1][1].equals("O")) && (plansza[1][2].equals("X") || plansza[1][2].equals("O")) &&
                (plansza[2][0].equals("X") || plansza[2][0].equals("O")) && (plansza[2][1].equals("X") || plansza[2][1].equals("O")) &&
                (plansza[2][2].equals("X") || plansza[2][2].equals("O")))){

            return true;
        }else {
            return false;
        }
    }

    public  boolean czyDobraWsp(int x){
        if(x >= 0 && x <= 2){
            return true;
        }else{
            return false;
        }
    }

}


