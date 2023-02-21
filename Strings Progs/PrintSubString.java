// substring(S):-
// substring(S,E-1):-
import java.util.*;
class PrintSubString{
  public static void main(String args[]){
    String st1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a strings: ");
    st1=sc.nextLine();
    System.out.println("The sub string is: "+st1.substring(3));
    System.out.println("The sub string is: "+st1.substring(2,5));
    
  }
}
    
