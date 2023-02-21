/*Program to find the largest and smallest word in a string*/
import java.util.*;
class FindLargestWord{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String st1;
    
    int c=1; //Count for Words
    System.out.println("Enter a string: ");
    st1=sc.nextLine();
    String words[]=st1.split(" ");
    String largestWord=words[0];
    String smallestWord=words[0];
    //Calculating for largest Words
    for(int i=1;i<words.length;i++){
      if(words[i].length()>largestWord.length()){
        largestWord=words[i];
        
      }
      if(words[i].length()<smallestWord.length()){
        smallestWord=words[i];
        
      }
      } 
    //Printing largest of Words
    System.out.println("The largest word in the given String is: "+largestWord);
    System.out.println("The smallest word in the given String is: "+smallestWord);
  }
}