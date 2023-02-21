/* Write a JAVAprogram to find first occurrence of a character in a given string. */

import java.util.*;
class Char_1stOccurance_String{
  public static void main(String args[]){
    String st1;
    char ch;
    int index=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a strings: ");
    st1=sc.nextLine();
    System.out.println("Enter a character from given string: ");
    ch=sc.next().charAt(0);
    for(int i=0;i<st1.length();i++){
      if(st1.charAt(i)==ch){
        index=st1.indexOf(ch);
        System.out.println("The first occurance of character in the given string is at index: "+index);
      }
    }
    
  }
}