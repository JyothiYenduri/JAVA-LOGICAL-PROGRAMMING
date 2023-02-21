/*equals()
  equalsIgnoreCase()*/
import java.util.*;
class checkingEquality_2Strings{
  public static void main(String args[]){
    String st1,st2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1st string: ");
    st1=sc.nextLine();
    System.out.println("Enter 2nd string: ");
    st2=sc.nextLine();
    System.out.println(st1.equals(st2));
    System.out.println(st1.equalsIgnoreCase(st2));
    if(st1.equals(st2)){
      System.out.println("Both the strings are equal");
    }
    else{
    System.out.println("Both the strings are not equal");  
    }
    
    
  }
}