package assignment2.assignment3;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int[] arr1 = new int[4];
        int[] arr2 = new int[4];
        int[] arr3 = new int[4];
        int r1, r2, r3;
        int i = 0;
        while (n1 != 0 && n2 != 0 && n3 != 0) {
            r1 = n1 % 10;
            arr1[i] = r1;
            r2 = n2 % 10;
            arr2[i] = r2;
            r3 = n3 % 10;
            arr3[i] = r3;
            n1 = n1 / 10;
            n2 = n2 / 10;
            n3 = n3 / 10;
            i++;
        }
        int min1 = arr1[0], min2 = arr2[0], min3 = arr3[0], max1 = 0, max2 = 0, max3 = 0;
        for (int j = 0; j < 4; j++) {
            if (arr1[j] < min1) {
                min1 = arr1[j];
            }
            if (arr2[j] < min2) {
                min2 = arr2[j];
            }
            if (arr3[j] < min3) {
                min3 = arr3[j];
            }
            if (arr1[j] > max1) {
                max1 = arr1[j];
            }
            if (arr2[j] > max2) {
                max2 = arr2[j];
            }
            if (arr3[j] > max3) {
                max3 = arr3[j];
            }
        }
        int key = (min1 + min2 + min3) - (max1 + max2 + max3);
        System.out.println(key);

    }
}
