import java.util.*;
class Arr1{
  int[] arrayMethod(int a[])
  {
   return a;
  }
  
}
class Array_Returnigval
{
  public static void main(String args[])
  {
    int n,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array Size:");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter Elements to Array:");
    for(i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }
    Arr1 ma1=new Arr1();
    int b[]=ma1.arrayMethod(a);
    System.out.println("The Elements in an Array is:");
    for(i=0;i<a.length;i++)
    {
      System.out.print("  "+b[i]);
    }
  }
}