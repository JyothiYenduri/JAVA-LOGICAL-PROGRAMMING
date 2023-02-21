import java.util.*;
class Cond
  {
    public static void main(String args[]){
      int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a and b values:");
      a=sc.nextInt();
      b=sc.nextInt();
      if(a>b)
        System.out.println("a is big");
      else
        System.out.println("b is big");
    }
  }