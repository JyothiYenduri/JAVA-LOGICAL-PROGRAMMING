import java.util.*;
class Alphabetornot{
  public static void main(String args[]){
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any character: ");
    ch=sc.next().charAt(0);
    if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
      System.out.println(ch+" is an Alphabet");
    }
    else{
      System.out.println(ch+" is not an Alphabet");
    }
  }
}