import java.util.*;
class Calculate
{
  int a,b,c;
  void add()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a value: ");
    a=sc.nextInt();
    System.out.println("Enter b value: ");
    b=sc.nextInt();
    c=a+b;
    System.out.println("The sum of "+ a +" and "+ b +" is: "+c);
        
  }
}
class Addition{
  public static void main(String args[]){
    Calculate ad=new Calculate();
    ad.add();
  }
}