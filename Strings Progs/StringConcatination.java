//Write a JAVAprogram to find length of a string and compare and concatenate two strings.
import java.util.*;
class StringConcatination{
  public static void main(String args[]){
    String st1,st2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string: ");
    st1=sc.nextLine();
    System.out.println("Enter one more string: ");
    st2=sc.nextLine();
    //printing lengtgs of two strings
    System.out.println("The length of the first string is: "+st1.length());
    System.out.println("The length of the second string is: "+st2.length());
    //comparing lengths of two strings
    if(st1.length()==st2.length()){
      System.out.println("Both strings are of same length");
    }
    else
      System.out.println("Both strings are of different lengths");
    //comparing equality of two strings
    if(st1.equalsIgnoreCase(st2)){
      System.out.println("Both are same strings");
    }
    else
      System.out.println("Both are different strings");
    //Concatinating both the strings
    System.out.println("after concatination: "+st1.concat(st2));
  }
}