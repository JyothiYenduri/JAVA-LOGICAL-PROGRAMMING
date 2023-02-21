import java.util.*;
class Swap
  {
    public static void main(String args[])
    {
      int a,b,t;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a value as Integer: ");
      a=sc.nextInt();
      System.out.println("Enter b value as Integer: ");
      b=sc.nextInt();
      System.out.println("The values of a and b before swapping are: "+a+ " and "+b);
      t=a;
      a=b;
      b=t;
      System.out.println("The values of a and b after swapping are: "+a+ " and "+b);
    }
  }