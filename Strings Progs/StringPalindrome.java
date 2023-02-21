/* Write a JAVAprogram to check whether a string is palindrome or not. */
import java.util.*;
class StringPalindrome{
  public static void main(String args[]){
    String st1,rev="";
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string: ");
    st1=sc.nextLine();
    for(i=st1.length()-1;i>=0;i--){
      rev=rev+st1.charAt(i);
    }
    System.out.println("After reversing the given string is: "+rev);
    System.out.println("\n"+"When i use equals() method: ");
    if(st1.equals(rev)){
      System.out.println("The given String is palindrome");
    }
    else{
      System.out.println("The given String is not a palindrome");
    }
    System.out.println("\n"+"When i use equalsIgnoreCase() method: ");
    if(st1.equalsIgnoreCase(rev)){
      System.out.println("The given String is palindrome");
    }
    else{
      System.out.println("The given String is not a palindrome");
    }
      
  }
}