/* Write a JAVAprogram to search all occurrences of a character in given string. */
import java.util.*;
class AllOccurances_Char_String{
  public static void main(String args[]){
    String st1;
    char ch;
    int count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a strings: ");
    st1=sc.nextLine();
    System.out.println("Enter a character from given string: ");
    ch=sc.next().charAt(0);
    for(int i=0;i<st1.length();i++){
      if(st1.charAt(i)==ch){
        count++;
       }
    }
    System.out.println("Total number of occurances of "+ch+" in the given string is : "+count);
  }
}