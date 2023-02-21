/* Arrange all characters in a string in alphabetical order */
import java.util.*;
class Arranging_Char_Alphabet_Order{
  public static void main(String args[]){
    String s; 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String: ");
    s=sc.nextLine();
    s=s.toLowerCase();
    System.out.print("\n"+"After arranging the given String into alphabetical order"+"\n");
    for(char ch='a';ch<='z';ch++){
      int c=0;  //for count
      for(int i=0;i<s.length();i++){
        if(ch==s.charAt(i)){
          System.out.print(ch);
        }
      }
    }
  }
}