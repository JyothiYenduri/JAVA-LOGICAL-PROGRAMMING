/* Java program that uses a loop to find the longest palindromic substring in a string*/
import java.util.*;
class LargestPalindromicString{
  public static void main(String args[]){
    String s; 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a palindromic String, i.e., each of its word should be palindrome: ");
    s=sc.nextLine();
    s=s.toLowerCase();
    String words[]=s.split(" ");
    String largestWord=words[0];
    System.out.println("The largest palindromic word of given String is:");
    for(int i=0;i<words.length;i++){
        if(words[i].length()>largestWord.length()){
          largestWord=words[i];
        }
      }
    System.out.print(largestWord);
  }
}