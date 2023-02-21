import java.util.Scanner;
class Sum{
  public static void main(String args[]){
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first integer: ");
    a=sc.nextInt();
    System.out.println("Enter second integer: ");
    b=sc.nextInt();
    System.out.println("The first value is: "+a);
    System.out.println("The second value is: "+b);
    System.out.println("The sum of "+ a +" and "+ b +" is: "+(a+b));
    
  }
}