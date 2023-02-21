/* Write a JAVAprogram to count total number of words in a string. */
import java.util.*;
class WordsCount_String{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String st1;
    int c=1; //Count for Words
    System.out.println("Enter a string: ");
    st1=sc.nextLine();
    //Calculating Count for Words
    for(int i=0;i<st1.length()-1;i++){
      if((st1.charAt(i)==' ') && (st1.charAt(i+1)!=' ')){
        c++;
      }
      } 
    //Printing Count of Words
    System.out.println("The number of words in the given String is: "+c);
  }
}