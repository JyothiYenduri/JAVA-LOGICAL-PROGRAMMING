import java.util.*;
class Arr1{
  void arrayMethod(int a[])
  {
    
    System.out.println("The Elements in an Array is:");
    for(int i=0;i<a.length;i++)
    {
      System.out.print("  "+a[i]);
    }
  }
}
class ArraybyPassingArgs
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
    ma1.arrayMethod(a);
  }
}