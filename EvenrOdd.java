import java.util.*;
class EvenrOdd
  {
    public static void main(String args[]){
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number: ");
      num=sc.nextInt();
      
      if(num%2==0)
        System.out.println("The given number is even");
      else
        System.out.println("The given number is odd");
    }
  }