//Create a program that uses a switch case statement to determine the area of a shape based on the shape's name in JAVA.[square,rectangle,triangle,circle]

import java.util.*;
class Area{
  double area=0.0;
  void square(int s){
    area=s*s;
    System.out.println("The area of Square is:"+area);
  }
  void rect(int l, int w){
    area=l*w;
    System.out.println("The area of rectangle is:"+area);
  }
  void tri(int b, int h){
    area=0.5f*b*h;
    System.out.println("The area of triangle is: "+area);
  }
  void circle(int r){
    double pi=3.14f;
    area=pi*r*r;
    System.out.println("The area of circle is:"+area);
  }
  
}
class Areabasedonshape {
	public static void main(String args[]) {
    int s=0,l=0,w=0,h=0,b=0,r=0;
    int ch;
    
    
    Scanner sc=new Scanner(System.in);
    Area ar=new Area();
    
    System.out.println("Select any one of the Shape from following:");
    System.out.println("------------------------------------------");
    System.out.println("[1]:Square");
    System.out.println("[2]:Rectangle");
    System.out.println("[3]:Triangle");
    System.out.println("[4]:Circle");
        
    System.out.println("Enter your choice between 1 to 4: ");
    ch=sc.nextInt();

     if(ch==1){
      System.out.println("Enter side of a square: ");
      s=sc.nextInt();
      }
    else if(ch==2){
      System.out.println("Enter length and width of a rectangle: ");
      l=sc.nextInt();
      w=sc.nextInt();
    }
    else if(ch==3){
      System.out.println("Enter height and breadth of a triangle: ");
      h=sc.nextInt();
      b=sc.nextInt();
    }
    else if(ch==4){
      System.out.println("Enter radius of a circle: ");
      r=sc.nextInt();
    }
    
    switch(ch)
      {
        case 1:
          ar.square(s);
          break;
        case 2:
          ar.rect(l,w);
          break;
        case 3:
          ar.tri(b,h);
          break;
        case 4:
          ar.circle(r);
          break;
        default:
          System.out.println("Wrong choice");
      } 

    }
}