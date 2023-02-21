import java.util.Scanner;
class Fortocelcius
{
  void forn()
  {
    double f,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter the temperature in Fahrenheit reading: ");
    f=sc.nextDouble();
    c=(f-32)*0.56f;
    System.out.println("The temperature in celcius is : "+c);
  }
}
class Forntocel
  {
    public static void main(String args[])
    {
      Fortocelcius f=new Fortocelcius();
      f.forn();
    }
  }