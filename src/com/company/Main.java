package com.company;

import java.util.Arrays;
import java.util.Scanner;
/*
//AUFGABE 1
public class Main {

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
 */
    /*
    //AUFGABE 2
    public static void main(String[] args) {
        int[] numArray = { 10, 20, 30, 40, 2, 10, 20, 60, 10};
        int minn = numArray[0];
        int maxx = numArray[0];
        for (int num: numArray) {
            if(maxx < num)
                maxx = num;
            if(minn > num)
                minn = num;
        }
        System.out.format("\nMax. element = %d \n", maxx);
        System.out.format("Min. element = %d \n", minn);
        int[] arrayOhneMin = numArray;
        int[] arrayOhneMax = numArray;
        int sum1 = 0, sum2 = 0, ok = 1;
        for (int num: arrayOhneMax) {
            if (num == maxx && ok == 1) {
                ok = 0;
            }
            else {
                sum1 += num;
            }
        }
        ok = 1;
        for (int num: arrayOhneMin) {
            if (num == minn && ok == 1) {
                ok = 0;
            }
            else {
                sum2 += num;
            }
        }
        System.out.format("\nSumm1= %d \n", sum1);
        System.out.format("Summ2= %d \n", sum2);
    }
    */
/*
//AUFGABE3
public class Main {
    static int[] Summe(int[] a, int[] b){ //calcularea sumei a doua nr mari
        int index = 0, i = a.length - 1;
        int[] c = new int [a.length + 1];
        Arrays.fill(c, 0);
        while (i >= 0){
            c[i+1] = (a[i] + b[i] + index) % 10;
            if ((a[i] + b[i] + index) > 9) index = 1;
            else index = 0;
            i -= 1;
        }
        if (index == 1) c[0] = 1;
        return c;
    }
    static int[] Differenz(int[] a, int[] b){ //calcularea diferentei a doua nr mari
        int i = a.length - 1;
        int[] c = new int [a.length];
        Arrays.fill(c, 0);
        while (i >= 0){
            if ((a[i] - b[i]) < 0){
                c[i] = (a[i] + 10) - b[i];
                c[i-1]--;
            }
            else c[i] = a[i] - b[i];
            i--;
        }
        return c;
    }
    static int[] Multiplikation(int[] a, int x){ //calcularea inmultirii
        int[] c = new int [a.length + 1];
        int index = 0, i = a.length - 1;
        Arrays.fill(c, 0);
        while (i >= 0){
            c[i+1] = (a[i] * x + index) % 10;
            if ((a[i] * x + index) > 9) index = (a[i] * x + index) / 10;
            else index = 0;
            i -= 1;
        }
        if (index != 0) c[0] = index;
        return c;
    }
    static int[] Division(int[] a, int x){ //calcularea impartirii
        int[] c = new int [a.length];
        Arrays.fill(c, 0);
        int index = 0, i = 0;
        while (i < a.length){
            c[i] = ((index * 10) + a[i]) / x;
            index = ((index * 10) + a[i]) - (c[i] * x);
            i += 1;
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 1, 2, 3};
        int[] summe = Summe(a, b);
        for (int i : summe) System.out.println(i);
        System.out.println("XXXXXXXXX");
        int[] diff = Differenz(b, a);
        for (int i : diff) System.out.println(i);
        System.out.println("XXXXXXXXX");
        int[] mull = Multiplikation(a, 9);
        for (int i : mull) System.out.println(i);
        System.out.println("XXXXXXXXX");
        int[] div = Division(b, 9);
        for (int i : div) System.out.println(i);

    }
}
*/
public class Main {
    static int bilig(int[] a){ //cel mai ieftin produs
        int minn = a[0];
        for (int i : a){
            if (i < minn){
                    minn = i;
            }
        }
        return minn;
    }
    static int teuer(int[] a, int[] b){ //cel mai scump produs total
        int maxx = a[0];
        for (int i : a){
            if (i > maxx){
                maxx = i;
            }
        }
        for (int i : b){
            if (i > maxx){
                maxx = i;
            }
        }
        return maxx;
    }
    static int maxUSB(int[] a, int budget){ //calcularea celui mai scump produs intr-un anumit buget
        int maxx = -1;
        for (int i : a){
            if (i > maxx && i < budget){
                maxx = i;
            }
        }
        return maxx;
    }
    static int maxBuy(int[] a, int[] b, int budget){ //calcularea celei mai scumpe combinatii de produse intr-un anumit buget
        int maxx = -1;
        for (int i : a){
            for (int j : b){
                if ((i+j) < budget && (i+j) > maxx) maxx = i + j;
            }
        }
        return maxx;
    }
    public static void main(String[] args) {
        int[] K = {10, 23, 43, 11, 55};
        int[] U = {11, 12, 13, 15, 56};
        System.out.println(bilig(K));
        System.out.println("XXXXXXX");
        System.out.println(teuer(K, U));
        System.out.println("XXXXXXX");
        System.out.println(maxUSB(U, 50));
        System.out.println("XXXXXXX");
        System.out.println(maxBuy(K, U, 10));


    }
}
