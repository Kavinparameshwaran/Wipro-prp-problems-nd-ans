package kavin;

import java.util.Scanner;

public class Program4 {
    public static int findkey(int input1, int input2, int input3)
    {

        int ip1, ip2, ip3,max;

        ip1 = (input1/100)%10;
        ip2 = (input2/10)%10;

        ip3 = input3 % 10;
        int ip4=(input3/10)%10;
        int ip5=(input3/100)%10;
        int ip6=input3/1000;

        max = Math.max(ip3, ip4);
        max = Math.max(max, ip5);
        max = Math.max(max, ip6);

        int pin=(ip1*ip2)-max;
        return pin;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int input3=sc.nextInt();
        int pin2=findkey(input1,input2,input3);
        System.out.println(pin2);
    }
}
