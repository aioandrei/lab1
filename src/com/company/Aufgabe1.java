package com.company;

public class Aufgabe1 {
    static int checkNote(int x) { //functie de verificare si de rotunjire a unei note
        if (x >= 38) {
            int cx = (x / 5) * 5;
            if (x - cx >= 3) {
                x = cx + 5;
            }
        }
        return x;
    }
    static int[] nichtPassNoten(int[] v){ //functie de afisare a notelor care sunt < 40
        //int[] cv = v;
        int j=0, k=0;
        for (int i : v) {
            if (checkNote(i) < 40) {
                j += 1;
            }
        }

        int[] cv = new int [j];
        for (int i : v){
            if(k < j) {
                if (checkNote(i) < 40) {
                    cv[k] = checkNote(i);
                    k += 1;
                }
            }
            else {
                break;
            }
        }
        return cv;
    }
    static int durchschnitt(int[] v){ //functie de calculare a mediei notelor
        int summe = 0;
        for (int i : v){
            summe += i;
        }
        return summe/v.length;
    }
    static int[] abgerundeteNoten(int[] v){ //functie de afisare a notelor rotunjite
        int j = 0, k = 0;
        for (int i : v) {
            if (i != checkNote(i)) {
                j += 1;
            }
        }

        int[] cv = new int [j];
        for (int i : v){
            if(k < j) {
                if (i != checkNote(i)) {
                    cv[k] = checkNote(i);
                    k += 1;
                }
            }
            else {
                break;
            }
        }
        return cv;

    }
    static int maxNote(int[] v){ //functie de afisare a notei maxime rotunjite
        int maxx = 0;
        for (int i : v) {
            if (checkNote(i) > maxx) {
                maxx = checkNote(i);
            }
        }
        return maxx;
    }
    public static void main(String[] args) {
        int[] v = {13, 20, 30, 40, 50, 54, 63, 88};
        int[] passn;
        int[] abge;
        System.out.println("XXXXXX - durchschnitt");
        System.out.println(durchschnitt(v));
        System.out.println("XXXXXX - nichtPassNoten");
        passn = nichtPassNoten(v);
        for (int i : passn) System.out.println(i);
        System.out.println("XXXXXX - abgeNoten");
        abge = abgerundeteNoten(v);
        for (int i : abge) System.out.println(i);
        System.out.println("XXXXXX - maxNote");
        System.out.println(maxNote(v));
    }
}
