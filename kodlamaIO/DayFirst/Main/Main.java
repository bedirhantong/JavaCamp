package kodlamaIO.DayFirst.Main;

import java.util.Scanner;
/**
 * @author Bedirhan Tong
 */

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World!");
        // Let's see how primitive datatypes work in Java.
        int i1 = 2;
        int i2 = 3;
        i1 = i2;
        // value copied
        i1 = 4;
        System.out.println(i2);


        // Let's see how referance datatypes work in Java.
        int[] arr = new int[1];
        arr[0] = 1;
        int[] arr2 = new int[1];
        arr2[0] = 2;
        arr = arr2;
        // address copied
        arr[0] = 3;
        System.out.println(arr2[0]);

        // Let's see how String datatypes work in Java.
        String s1 = "Hello";
        String s2 = "World";
        s1 = s2;
        s1 = "bedirhan";
        System.out.println(s2);
        sc.close();
    }
}