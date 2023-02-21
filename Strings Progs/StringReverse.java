import java.util.*;
class StringReverse{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s;
    System.out.println("Enter a string: ");
    s=sc.next();
    StringBuffer st1=new StringBuffer(s);
    System.out.println("The reverse of a given string is: "+st1.reverse());
   
  }
}
    
