import java.util.*;
class RadiusnPeri_Rectantgle
{
  void radiusnperi(int x,int y)
  {
    int rad,peri;
    rad=x*y; 
    peri=2*(x+y);
    System.out.println("the radius of rectangle is: "+rad);
    System.out.println("the perimeter of rectangle is: "+peri);
        
  }
}
class Rect{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int l,b;
    System.out.println("Enter a length of a rectangle : ");
    l=sc.nextInt();
    System.out.println("Enter a breadth of a rectangle : ");
    b=sc.nextInt();
    RadiusnPeri_Rectantgle rd=new RadiusnPeri_Rectantgle();
    rd.radiusnperi(l,b);
    }
}