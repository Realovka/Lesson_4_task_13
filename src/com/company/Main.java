package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите размерность массива");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Введите число, с которым будут сравниваться элементы массива");
        Scanner scanner = new Scanner(System.in);
        int c = scan.nextInt();
        Random random = new Random();

        int[] array = new int[n];
        for (int i=0; i<array.length; i++){
            array[i]=random.nextInt(50);
        }

        System.out.println(Arrays.toString(array));

        int sum=0;
        int x=0;
        for (int i=0; i<array.length; i++){
            if (array[i]>c){
                sum+=array[i];
                x++;
            }
        }
        System.out.print("Среднее арифметическое элементов массива превосходящих "+c+" равно ");
        System.out.printf("%.2f",(double)sum/x);
    }
}
