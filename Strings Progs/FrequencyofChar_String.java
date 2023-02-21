/* Write a JAVAprogram to count frequency of each character in a string */
import java.util.*;
class FrequencyofChar_String{
  public static void main(String args[]){
    String s;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String: ");
    s=sc.nextLine();
    s=s.toLowerCase();
    System.out.println("\n"+"The frequecy of each character in the given string is: ");
    for(char ch='a';ch<='z';ch++){
      int c=0;  //for count
      for(int i=0;i<s.length();i++){
        if(ch==s.charAt(i)){
          c++;
        }
      }
      if(c!=0){
        System.out.println(ch+"===>"+c);
      }
    }
    
  }
}
