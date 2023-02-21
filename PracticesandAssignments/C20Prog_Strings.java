//Java program that uses a loop to check if two strings are anagrams
import java.util.*;
class C20Prog_Strings{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
    String s1,s2;
    String a1="";
    String a2="";
    System.out.println("Enter any two strings: ");
    s1=sc.nextLine();
    s2=sc.nextLine();
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
    if(s1.length()!=s2.length()){
      System.out.println("Both String are not anagrams");
      }
    for(char ch='a';ch<'z';ch++){
    for(int i=0;i<s1.length();i++){
      if(ch==s1.charAt(i)){
        a1=a1+ch;
      }
      
    }
    }
    System.out.println("After arranging the 1st string into ascending order is: "+a1);
    for(char ch='a';ch<'z';ch++){
    for(int i=0;i<s2.length();i++){
      if(ch==s1.charAt(i)){
        a2=a2+ch;
      }
      
    }
    }
    System.out.println("After arranging the 2nd string into ascending order is: "+a2);
    if(a1.equalsIgnoreCase(a2)){
      System.out.println("Both the Strings are Anagrams");
    }
    else{
      System.out.println("Both the Strings are not Anagrams");
    }
  }
}