package com.company;

public class Aufgabe2 {
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
}
