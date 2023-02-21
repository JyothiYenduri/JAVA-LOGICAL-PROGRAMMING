import java.util.*;
class Checknum_char_splchar{
  public static void main(String args[]){
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any value: ");
    ch=sc.next().charAt(0);
    if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
      System.out.println(ch +" is a Alphabet");
    }
    else if(ch>='0' && ch<='9'){
      System.out.println(ch +" is a Number");
    }
    else{
      System.out.println(ch +" is a Special character");
    }
       
  }
}