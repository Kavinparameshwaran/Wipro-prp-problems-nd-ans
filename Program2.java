package kavin;

import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class Program2 {
    public static int findkey(int input1, int input2, int input3)
    {

        int ip1, ip2, ip3,max;

        ip1 = input1 % 10;
        ip2 = input2 % 10;
        ip3 = input3 % 10;
        max = Math.max(ip1, ip2);
        max = Math.max(max, ip3);
        int max1=max;

        input1 /= 10;
        input2 /= 10;
        input3 /= 10;


        ip1 = input1 % 10;
        ip2 = input2 % 10;
        ip3 = input3 % 10;
        max = Math.max(ip1, ip2);
        max = Math.max(max, ip3);
        int max2=max;

        input1 /= 10;
        input2 /= 10;
        input3 /= 10;

        ip1 = input1 % 10;
        ip2 = input2 % 10;
        ip3 = input3 % 10;
        max = Math.max(ip1, ip2);
        max = Math.max(max, ip3);
        int max3=max;


        input1 /= 10;
        input2 /= 10;
        input3 /= 10;

        ip1 = input1 % 10;
        ip2 = input2 % 10;
        ip3 = input3 % 10;
        max = Math.max(ip1, ip2);
        max = Math.max(max, ip3);
        int max4=max;

        int pin=(max4*1000)+(max3*100)+(max2*10)+max1;
        //String s=Integer.toString(pin);
        return pin;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int input3=sc.nextInt();
        int pin2=findkey(input1,input2,input3);
        System.out.println(Integer.toString(pin2));
    }
}
