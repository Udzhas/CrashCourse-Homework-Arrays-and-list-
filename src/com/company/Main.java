package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void comparing(double a, double b) {
        if (a > b) {
            System.out.println("middle arifmetic in arr1 is bigger than in arr2!");
        }
        if (a < b) {
            System.out.println("middle arifmetic in arr2 is bigger than in arr1!");
        }
        if (a == b) {
            System.out.println("middle arifmetic in arr1 is equal to arr2!");
        }
    }

    public static void addingToArray(String[] arr, int n){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]=");
            arr[i] = in.next();
        }
    }
    public  static void printingStringArray(String[] arr,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public  static void printingIntArray(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // number 1
        /*Scanner in = new Scanner(System.in);
        System.out.print("Enter length=");
        int n = in.nextInt();
        String[] arr = new String[n];
        String temp;
        System.out.println("Enter elements of array:");
        addingToArray(arr,n);

        System.out.println("Your array:");
        printingArray(arr,n);

        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;

        }
        System.out.println("\nNew array:");
        printingArray(arr,n);
     */

        //number two
        /*int n=5;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = ((int) (Math.random() * 6));
            arr2[i] = ((int) (Math.random() * 6));
        }
        System.out.println("first array:");
        printingIntArray(arr1,n);
        System.out.println("\nsecond array:");
        printingIntArray(arr2,n);
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 = sum1 + arr1[i];
            sum2 = sum2 + arr2[i];
        }
        double rez1 = (double)sum1 / (double)n;
        double rez2 = (double)sum2 / (double)n;
        System.out.println("\n");
        comparing(rez1,rez2);*/

        //number three
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("12");
        arr1.add("pas");
        arr1.add("is");
        arr1.add("good");
        arr1.add("with");
        arr1.add("big");
        arr1.add("heavy");
        arr1.add("100");
        arr1.add("years");
        arr1.add("old");
        arr1.add("grandmother");
        arr1.add("!");
        for (String i : arr1) {
            System.out.print(i + " ");
        }

    }
}
