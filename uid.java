package package1;

import java.util.*;

public class Sol1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String fn = sc.nextLine();
        String ln = sc.nextLine();
        int pin = sc.nextInt();
        int n = sc.nextInt();
        int lf = fn.length();
        int ll = ln.length();
        String snme, lnme;
        if (lf < ll) {
            snme = fn;
            lnme = ln;
        } else if (lf > ll) {
            snme = ln;
            lnme = fn;
        } else {
            if (fn.compareTo(ln) < 0) {
                snme = fn;
                lnme = ln;
            } else {
                snme = ln;
                lnme = fn;
            }
        }
        String spin =String.valueOf(pin);
        char lr = spin.charAt(n-1);
        char rl = spin.charAt(spin.length()-n);

        String iuid = lnme.charAt(0) + snme + lr+rl;
        int idl = iuid.length();
        for (int i = 0; i < idl; i++) {
            if (Character.isAlphabetic(iuid.charAt(i))) {
                if (Character.isUpperCase(iuid.charAt(i))) {
                    System.out.print(Character.toLowerCase(iuid.charAt(i)));
                } else {
                    System.out.print(Character.toUpperCase(iuid.charAt(i)));
                }
            } else {
                System.out.print(iuid.charAt(i));
            }
        }








//*********************************************************

import java.util.Scanner;
import java.io.*;
public class HelloWorld {
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int n1=sc.nextInt();
 int n2=sc.nextInt();
 int n3=sc.nextInt();
 int in1,in2,in3,c1=0,c2=0,c3=0;
 in1=n1;
 in2=n2;
 in3=n3;
 while(n1!=0 && n2!=0 && n3!=0)
 {
   n1=n1/10;
   c1++;
   n2=n2/10;
   c2++;
   n3=n3/10;
   c3++;
 }
 
 int arr1[]=new int[c1];
 int arr2[]=new int[c2];
 int arr3[]=new int[c3];
 int r1,r2,r3;
 int i=0;
 while(in1!=0 && in2!=0 && in3!=0)
 {
   r1=in1%10;
   arr1[i]=r1;
   r2=in2%10;
    arr2[i]=r2;
   r3=in3%10;
    arr3[i]=r3;
   in1=in1/10;
   in2=in2/10;
   in3=in3/10;
   if(in1!=0 && in2!=0 && in3!=0)
   {
     i++;
   }
 }
int min1=0,min2=0,min3=0,max1=0,max2=0,max3=0;
for(int j=0;j<c1;j++)
{
  min1=arr1[0];
  if(arr1[j]<min1)
  {
    min1=arr1[j];
  }
    min2=arr2[0];
  if(arr2[j]<min2)
  {
    min2=arr2[j];
  }
    min3=arr3[0];
  if(arr3[j]<min3)
  {
    min3=arr3[j];
  }

    max1=arr1[0];
  if(arr1[j]>max1)
  {
    max1=arr1[j];
  }
    max2=arr2[0];
  if(arr2[j]>max2)
  {
    max2=arr2[j];
  }
    max3=arr3[0];
  if(arr3[j]>max3)
  {
    max3=arr3[j];
  }
}
int key=(min1+min2+min3)-(max1+max2+max3);
System.out.println(key);
 
    }
}}