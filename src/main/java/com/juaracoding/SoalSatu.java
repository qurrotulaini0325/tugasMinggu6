package com.juaracoding;

public class SoalSatu {
    public static void main(String[] args) {

        for (int i = 1; i <=100 ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("BIZZBUZZ");
            }
            else if (i % 3 == 0){
                System.out.print("BIZZ");
            }
            else if (i % 5 == 0){
                System.out.print("BUZZ");
            }
            else {
                System.out.println(i);
            }
            System.out.println();
        }
    }
}
