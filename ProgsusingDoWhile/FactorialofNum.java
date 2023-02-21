import java.util.*;
class FactorialofNum{
  public static void main(String args[]){
    int n,f=1,temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value: ");
    n=sc.nextInt();
    temp=n;
    
    do
    {
      f=f*n;
      n--;
    }while(n>0);
    System.out.println("The factorial of "+ temp +" is: "+f);
  }
}