package com.juaracoding;

public class SoalDua {
    public static void main(String[] args) {
        int n = 9;

        for (int i = 1; i <= n ; i++) {
            for (int j = i; j <= n ; j++) {
                if (j % 2 == 1) {
                    System.out.print(j);
                }
                else {
                    System.out.print("_");
                }
            }
            n--;
            System.out.println();
        }
    }
    public SoalDua(){
        for (int i = 1; i <= 7 ; i++) {
            for (int j = i; j <= 7 ; j++) {
                if (j%2 == 1) {
                    System.out.print(j);
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
