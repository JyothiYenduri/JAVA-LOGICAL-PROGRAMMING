import java.util.*;
class CalculatorusingSwitch {
	public static void main(String args[]) {
    int a=0,b=0,c,ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Calculator");
    System.out.println("----------");
    System.out.println("[1]:Addition");
    System.out.println("[2]:Subtraction");
    System.out.println("[3]:Multiplication");
    System.out.println("[4]:Division");
    System.out.println("[5]:Modulus Division");
    
    System.out.println("Enter your choice:");
    ch=sc.nextInt();

    if(ch<6){
      System.out.println("Enter two numbers for a and b: ");
      a=sc.nextInt();
      b=sc.nextInt();
    }
    switch(ch)
      {
        case 1:
          c=a+b;
          System.out.println("The Addition value is: "+c);
          break;
        case 2:
          c=a-b;
          System.out.println("The Subtraction value is: "+c);
          break;
        case 3:
          c=a*b;
          System.out.println("The Multiplication value is: "+c);
          break;
        case 4:
          c=a/b;
          System.out.println("The division value is: "+c);
          break;
        case 5:
          c=a%b;
          System.out.println("The remainer is: "+c);
          break;
        default:
          System.out.println("Wrong choice");
      }

    }
}