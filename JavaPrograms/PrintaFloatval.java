import java.util.Scanner;
class PrintaFloatval{
  public static void main(String args[]){
    float f;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a decimal value: ");
    f=sc.nextFloat();
    System.out.println("The given decimal value is: "+f);
  }
}