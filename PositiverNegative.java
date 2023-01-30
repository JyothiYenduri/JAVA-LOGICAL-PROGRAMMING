import java.util.*;
class PositiverNegative
  {
    public static void main(String args[]){
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number: ");
      num=sc.nextInt();
      
      if(num>=0)
        System.out.println("The given number is Positive");
      else
        System.out.println("The given number is Negative");
    }
  }