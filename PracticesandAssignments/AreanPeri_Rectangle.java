//Create a class that represents a rectangle, including the width and height. Write methods to calculate the area and perimeter of the rectangle.
import java.util.*;
class Rect{
  void area(int l, int b){
    int Area_Rect=l*b;
    System.out.println("The area of rectangle is: "+Area_Rect);
  }
  void Peri(int l, int b){
    int Peri_Rect=2*(l+b);
    System.out.println("The perimeter of rectangle is: "+Peri_Rect);
  }
}

class AreanPeri_Rectangle{
  public static void main(String args[]){
    int l,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter length & breadth values: ");
    l=sc.nextInt();
    b=sc.nextInt();
    Rect ar=new Rect();
    ar.area(l,b);
    ar.Peri(l,b);
    
  }
}