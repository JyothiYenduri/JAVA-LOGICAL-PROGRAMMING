import java.util.*;
class AreanPeriofRect
  {
    public static void main(String args[])
    {
      int l,b;
      int area;
      float circumference;

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter length of a rectangle value as an integer: ");
      l=sc.nextInt();
      System.out.println("Enter breadth of a rectangle value as an integer: ");
      b=sc.nextInt();
      area=l*b;
      circumference=2*(l+b);
      System.out.println("The area of the rectangle is: "+area);
      System.out.println("The circumference of a rectangle is: "+circumference);
    }
  }