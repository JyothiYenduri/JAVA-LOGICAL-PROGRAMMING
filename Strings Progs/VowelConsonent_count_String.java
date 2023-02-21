/* Write a JAVAprogram to count total number of vowels and consonants in a string. */

import java.util.*;
class VowelConsonent_count_String{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String st1;
    int c1=0,c2=0; //Count for Vowels & Consonents
    char temp;  //temporary variable to store & compare each char of String 
    System.out.println("Enter a string: ");
    st1=sc.next();
    //Calculating Count for Vowels & Consonents
    for(int i=0;i<st1.length();i++){
      temp=st1.charAt(i);
      if(temp=='a'||temp=='A'||temp=='e'||temp=='E'||temp=='i'||temp=='I'||temp=='o'||temp=='O'||temp=='u'||temp=='U'){
        c1++;  
      }
      else{
        c2++;
      }
    }
    //Printing Count of Vowels & Consonents
    System.out.println("The number of Vowels in the given String is: "+c1);
    System.out.println("The number of Consonents in the given String is: "+c2);
  }
}