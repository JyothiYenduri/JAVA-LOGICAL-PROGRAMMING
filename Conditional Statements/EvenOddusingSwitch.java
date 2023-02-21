import java.util.Scanner;
class EvenOddusingSwitch{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    n=sc.nextInt();
    switch(n%2){
      case 0:
        System.out.println("The given number is even");
        break;
      case 1:
        System.out.println("The given number is odd");
        break;
        
    }
  }
}