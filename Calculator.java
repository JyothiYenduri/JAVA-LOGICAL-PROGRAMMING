/* Create a class that simulates a simple calculator, with methods for addition, subtraction, multiplication, and division. */
import java.util.*;
class Addition{
  void sum(int a, int b){
    int c=a+b;
    System.out.println("The sum of two numbers is:"+c);
  }
  void sub(int a, int b){
    int c=a-b;
    System.out.println("The Subtraction value is: "+c);
  }
  void mul(int a, int b){
    int c=a*b;
    System.out.println("The Multiplication value is: "+c);
  }
  void div(int a, int b){
    int c=a/b;
    System.out.println("The division value is: "+c);
  }
  void rem(int a, int b){
    int c=a%b;
    System.out.println("The division value is: "+c);
  }
}
class Calculator {
	public static void main(String args[]) {
    int a=0,b=0,c;
    char ch;
    
    
    Scanner sc=new Scanner(System.in);
    Addition ad=new Addition();
    
    System.out.println("Calculator");
    System.out.println("----------");
    System.out.println("[+]:Addition");
    System.out.println("[-]:Subtraction");
    System.out.println("[*]:Multiplication");
    System.out.println("[/]:Division");
    System.out.println("[%]:Modulus Division");
    
    System.out.println("Enter your choice:");
    ch=sc.next().charAt(0);

     if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%'){
      System.out.println("Enter two numbers for a and b: ");
      a=sc.nextInt();
      b=sc.nextInt();
    } 
    
    switch(ch)
      {
        case '+':
          ad.sum(a,b);
          break;
        case '-':
          ad.sub(a,b);
          break;
        case '*':
          ad.mul(a,b);
          break;
        case '/':
          ad.div(a,b);
          break;
        case '%':
          ad.rem(a,b);
          break;
        default:
          System.out.println("Wrong choice");
      } 

    }
}