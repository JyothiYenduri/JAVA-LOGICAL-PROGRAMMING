/* Write a JAVAprogram to find reverse of a string. */
import java.util.*;
class String_Reverse{
  public static void main(String args[]){
    String st1,rev="";
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a strings: ");
    st1=sc.nextLine();
    for(i=st1.length()-1;i>=0;i--){
      rev=rev+st1.charAt(i);
    }
    System.out.println("After reversing the given string is: "+rev);
    
  }
}
