package com.company;

public class Aufgabe4 {
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
