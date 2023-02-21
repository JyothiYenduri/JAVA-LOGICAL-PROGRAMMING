import java.util.*;
class RadiusofCircle
{
  void radius(double x)
  {
    double rad,pi=3.14;
    rad=pi*x*x; 
    System.out.println("the radius of circle is: "+x);
        
  }
}
class Circle{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    double r;
    System.out.println("Enter a radius value : ");
    r=sc.nextDouble();
    RadiusofCircle rd=new RadiusofCircle();
    rd.radius(r);
    }
}