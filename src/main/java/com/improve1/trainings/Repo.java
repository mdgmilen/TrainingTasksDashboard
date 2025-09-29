package com.improve1.trainings;

public class Repo {


    // 1+2+3+4=10 +5=15 +6=21
    private int sumTill(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x + sumTill(x-1);
        }
//        int sum = 0;
//        for (int i = 0; i < x; i++) {
//            sum = sum + i+1;
//        }
//        return sum;
    }

    // main method backup
//    public static void main(String[] args) {
//        System.out.println("Start<<<<<<<<<<<<<<<<<<");
//        int N = 6;
//        Main obj = new Main();
//        int result = obj.sumTill(N);
//        System.out.println(String.format("The sum till '%d' is '%d'", N, result));
//        System.out.println("End>>>>>>>>>>>>>>>>>>>>>");
//    }


}
