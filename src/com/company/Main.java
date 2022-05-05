package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[100];
        Scanner scanner = new Scanner(System.in);
        int konsol = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + ", ");

        }
        System.out.println();
        int san = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == konsol) {
                san = i;
                System.out.println("siz bergen san-> " + arr[i] + " katarda " + san);
            }
        }
        if (san == 0) {
            System.out.println("bul sandardyn arasynda jok");
        }
    }
}



