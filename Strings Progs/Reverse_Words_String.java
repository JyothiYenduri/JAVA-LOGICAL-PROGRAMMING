/*Program to reverse each word in a string*/
import java.util.*;
class Reverse_Words_String{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String st1;
    System.out.println("Enter a string: ");
    st1=sc.nextLine();
    String words[]=st1.split(" ");
    //Reversing Words of String
    for(int i=0;i<words.length;i++){
      String w=words[i];
      StringBuffer s=new StringBuffer(w);
      System.out.print(s.reverse()+" "); 
    }
  }
}