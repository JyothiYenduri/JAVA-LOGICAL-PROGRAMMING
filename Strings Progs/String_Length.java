import java.util.*;
class String_Length{
  public static void main(String args[]){
    String st1;
    int count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a strings: ");
    st1=sc.nextLine();
    for(int i=0;i<st1.length();i++){
      count++;
    }
    System.out.println("The length of given string is: "+count);
  }
}
