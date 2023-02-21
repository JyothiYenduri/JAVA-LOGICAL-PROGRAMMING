import java.util.*;
class Upperrlowercase{
  public static void main(String args[]){
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any character: ");
    ch=sc.next().charAt(0);
    if(ch>='a' && ch<='z') {
      System.out.println(ch+" is an Alphabet and it is in lower case");
    }
    else if(ch>='A' && ch<='Z'){
      System.out.println(ch+" is an Alphabet and it is in Upper case");
    }
    else{
      System.out.println(ch+" is not an Alphabet ");
    }
  }
}