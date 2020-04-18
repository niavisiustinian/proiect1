package com.jetbrains;

public class Main {

    public static void main(String[] args) {

        System.out.println("Rezultatul adunarii este: " + adunare(5, 3));
        System.out.println("Rezultatul inmultirii este: " + inmultire(4, 5));
        System.out.println("Rezultatul scaderi este: " + scadere(5, 3));
        System.out.println("Rezultatul impartiri este: " + impartire(90, 24));
        printeazaJava();
        System.out.println("Rezultatul medie este:" +medie3Numere(7.3,12.11,8.2));
        System.out.println("Restul impartirii este:"+restulImpartirii(90,60));
        System.out.println("Transformare Celsius:"+transformaInCelsius(78));
        System.out.println("Transformare inch in metrii: "+ inch(112));
        viteza(1,0,0,1000);
        omulet();



    }

    public static int adunare(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar + alDoileaNumar;
        return rezultat;
    }

    public static int inmultire(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar * alDoileaNumar;
        return rezultat;
    }

    public static int scadere(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar - alDoileaNumar;
        return rezultat;
    }

    public static double impartire(double primulNumar, double alDoileaNumar) {
        double rezultat = primulNumar / alDoileaNumar;
        return rezultat;
    }

    public static void printeazaJava() {
        System.out.println("   J    a   v     v  a" );
        System.out.println("   J   a a   v   v  a a" );
        System.out.println("J  J  aaaaa   V V  aaaaa" );
        System.out.println(" JJ  a     a   V  a     a" );
    }

     public static double medie3Numere(double x,double y,double z) {
         double rezultat = ((x + y + z)/3);
         return rezultat;
     }

     public static double  inch (double inch) {
        double rezultat = ((inch * 2.54)/100);
        return rezultat;

      }

     public static int restulImpartirii(int x,int y) {
         int rezultat = x % y;
         return rezultat;
     }

     public static double transformaInCelsius(double f){
         double rezultat =  5.0 / 9.0 *(f-32.0);
         return rezultat;
     }

        public static void omulet(){
        System.out.println(" +\"\"\"\"\"+");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
        System.out.println(" +-----+");

        }



     public static void viteza(double ore,double minute,double secunde,double metrii) {
         double rezultat = (metrii / (secunde + minute * 60.0 + ore * 3600.0));
         System.out.println("Viteza in m/s:" +rezultat);
          rezultat=  ((metrii / (secunde + minute * 60.0 + ore * 3600.0)) * 3.6);
         System.out.println("Viteza in km/h:" +rezultat);
          rezultat= ((metrii / (secunde + minute * 60.0 + ore * 3600.0)) * 2.237);
         System.out.println("Viteza in mile/h:" +rezultat);
    }
}






