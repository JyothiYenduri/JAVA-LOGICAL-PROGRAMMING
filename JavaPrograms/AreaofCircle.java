import java.util.*;
class AreaofCircle
  {
    public static void main(String args[])
    {
      int r;
      float pi=3.14f;
      float area;

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter radius of a circle value as an integer: ");
      r=sc.nextInt();
      area=pi*r*r;
      System.out.println("The area of the circle is: "+area);
    }
  }