import java.util.*;
class Shapes{
  void rectAngle(double a, double b){
    double c=a*b;
    System.out.println("the area of rectangle is : "+c);
  }
  void square(double a){
    double c=a*a;
    System.out.println("The area of square is : "+c);
  }
  void circle(double a){
    double  c=(3.14)*a*a;
    System.out.println("The area of circe is: "+c);
  }
  void triAngle(double a, double b){
    double c=(0.5)*a*b;
    System.out.println("The division value is: "+c);
  }
  
}
class Shape {
	public static void main(String args[]) {
    
    String ch;
    
    
    Scanner sc=new Scanner(System.in);
    
    
    /*System.out.println("SHAPES");
    System.out.println("----------");
    System.out.println("[1]:rectangle");
    System.out.println("[2]:Square");
    System.out.println("[3]:circle");
    System.out.println("[4]:triangle");*/
    
    System.out.println("Enter your choice:");
    ch=sc.next();

     
    Shapes s1=new Shapes();
    switch(ch)
      {
        case "rectangle":
          System.out.println("enter your lengtha nd breadth :");
          double a=sc.nextDouble();
          double b=sc.nextDouble();
          s1.rectAngle(a,b);
          break;
        case "square":
          System.out.println("enter side:");
          double s=sc.nextDouble();
          s1.square(s);
          break;
        case "circle":
          System.out.println("enter radius:");
          double r=sc.nextDouble();
          s1.circle(r);
          break;
        case "triangle":
           System.out.println("enter your base and height :");
          double b1=sc.nextDouble();
          double h=sc.nextDouble();
          s1.triAngle(b1,h);
          break;
        
        default:
          System.out.println("Wrong choice");
      } 

    }
}