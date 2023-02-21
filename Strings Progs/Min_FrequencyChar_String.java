/* Write a JAVAprogram to find lowest frequency character in a string.*/
import java.util.*;
class Min_FrequencyChar_String{
  public static void main(String args[]){
    
    char tch='0';
    String s;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String: ");
    s=sc.nextLine();
    s=s.toLowerCase();
    int Min=s.length();
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
        if(c<Min){
            Min=c;
            tch=ch;
      }
        }
      
    }
    System.out.println("Minimum occurance is:"+Min+"that character is "+tch);
  }
}