import java.util.*;
class CheckEquality
  {
    public static void main(String args[]){
      int n1,n2,n3;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter 3 numbers: ");
      n1=sc.nextInt();
      n2=sc.nextInt();
      n3=sc.nextInt();
      
      if(n1==n2 && n2==n3 && n3==n1)
        System.out.println("all the given numbers are equal");
      else
        System.out.println("all the given numbers are not equal");
    }
  }