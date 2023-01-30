//Write a program to convert a given number into its binary equivalent.

import java.util.*;
class DecimaltoBinary{
  public static void main(String args[]){
  int n,rem=0,q=0;
  String  bin="";
  String bin2="";
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    n=sc.nextInt();
   while(n>0){//10>0-->5>0-->2>0-->1>0
       rem=n%2;//10%2=0-->5%2=1-->2%2=0-->1%2=1
       String s=Integer.toString(rem);//s=0-->s=1-->s=0-->s=1
       bin+=s;//bin=0 concatinating-->0101
       n=n/2;//10/2=5-->5/2=2-->2/2=1-->1/2=0
     
   }
   for (int i=0; i<bin.length(); i++)
      {
        char ch= bin.charAt(i); 
        bin2= ch+bin2; //1010
      }
   
    System.out.println(bin2);
   
  }
    
}