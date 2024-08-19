package org.example;

public class Main {
    public static void main(String[] args) {

        // Das sind Arrays:
        int[] coinbox = {1,20,5,50,12345}; //Werte in {} müssen immer vom gleichen Typ sein
        int[] coinbox2 = new int[5]; //leeres Array (leer = 0) mit 5 Plätzen

        //Werte im Array umschreiben:
        coinbox[0] = 1000;

        //manuelle Ausgabe:
        System.out.println("Das ist die manuelle Ausgabe des Arrays:");
        System.out.println(coinbox[0]);
        System.out.println(coinbox[1]);
        System.out.println(coinbox[2]);
        System.out.println(coinbox[3]);
        System.out.println(coinbox[4]);

        //automatische Ausgabe des Arrays mit Hilfe einer "for" Schleifen:
        System.out.println("Das ist die Ausgabe des Arrays als for-Schleife:");
        //For Schleife immer mit 3 Bedingungnen in ():
        // (Variable z.B. int i = 0; Bedingung als boolean Wert z.B. i < coinbox.length; Variable inkremmentieren bzw. hochzählen mit i++)
        for (int i = 0; i < coinbox.length; i++) {
            System.out.println(coinbox[i]);
        }

        //kürzere Variante der for-Schleife = for-each Schleife:
        //gelesen: Für (jeden coin : in coinbox) {mache das}
        for (int coin : coinbox) {
            System.out.println(coin);
        }


    }
}