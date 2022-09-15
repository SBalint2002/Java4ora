package hu.petrik.pontoop;

import static java.lang.System.*;

import hu.petrik.pontoop.pont.Pont;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pont p1 = new Pont();
        Pont p2 = new Pont(0, 0);
        Pont p3 = new Pont(3, 4);
        Pont p4 = new Pont(100);

          System.out.println(p1);
          System.out.println(p2);
          System.out.println(p3);
          System.out.println(p4);

        Pont[] pontok = new Pont[10];
        for (int i = 0; i < pontok.length; i++) {
            pontok[i] = new Pont(100);
        }
        for (Pont p : pontok) {
            out.println(p);
        }
        //Origótól legtávolabb eső pont
        int legtavolabbiPontIndex = 0;
        for (int i = 1; i < pontok.length; i++) {
            if (pontok[legtavolabbiPontIndex].getOrigotolMertTavolsag() < pontok[i].getOrigotolMertTavolsag()) {
                legtavolabbiPontIndex = i;
            }
        }

        out.printf("A legtávolabbi pont az origótól a(z) %d. pont, koordinátái: %s, origótól mért távolsága: %f\n",
                (legtavolabbiPontIndex+1), pontok[legtavolabbiPontIndex], pontok[legtavolabbiPontIndex].getOrigotolMertTavolsag());


          Scanner sc = new Scanner(in);

          out.println("Adja meg a másik pont koordinátáit");
          out.print("x: ");
          int masikX = sc.nextInt();
          out.print("y: ");
          int masikY = sc.nextInt();

          Pont masikpont = new Pont(masikX, masikY);

          out.printf("Két pont távolsága %f", p3.getTavolsag(masikpont));

        out.println("Adjon meg egy pontot");
        out.print("x: ");
        int sikX = sc.nextInt();
        out.print("y: ");
        int sikY = sc.nextInt();
        Pont megadottPont = new Pont(sikX, sikY);
        out.println(megadottPont.getSikNegyed(megadottPont));
    }
}
