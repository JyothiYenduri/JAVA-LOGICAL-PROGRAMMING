import java.util.Scanner;
class Fortocelcius{
  public static void main(String args[]){
    double f,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter the temperature in Fahrenheit reading: ");
    f=sc.nextDouble();
    c=(f-32)*5/9;//5/9=0.56f
    System.out.println("The temperature in celcius is : "+c);
  }
}
    
    