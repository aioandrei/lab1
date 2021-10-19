package com.company;
import java.util.Arrays;
public class Aufgabe3 {
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
