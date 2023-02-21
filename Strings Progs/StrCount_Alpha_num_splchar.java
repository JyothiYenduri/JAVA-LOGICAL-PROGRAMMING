/* Write a JAVAprogram to find total number of alphabets, digits or special character in a string. */
import java.util.*;
class StrCount_Alpha_num_splchar{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String st1;
    int c1=0,c2=0,c3=0; //Count for Alphabets,Digits & Spl_Char
    char temp;  //temporary variable to store & compare each char of String 
    System.out.println("Enter a string: ");
    st1=sc.nextLine();
    //Calculating Count for Alphabets,Digits & Spl_Char
    for(int i=0;i<st1.length();i++){
      temp=st1.charAt(i);
      if(temp>'a'&&temp<'z'||temp>'A'&&temp<'Z'){
        c1++;  
      }
      else if(temp>='0'&&temp<='9'){
        c2++;
      }
      else{
        c3++;
      }
    }
    //Printing Count of Alphabets,Digits & Spl_Char
    System.out.println("The number of Alphabets in the given String is: "+c1);
    System.out.println("The number of Digits in the given String is: "+c2);
    System.out.println("The number of Special characters in the given String is: "+c3);
  }
}