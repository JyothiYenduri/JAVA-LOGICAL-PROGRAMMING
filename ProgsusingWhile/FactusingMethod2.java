import java.util.*;
class FactusingMethod2{
  public static void main(String args[]){
    int n,f=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value: ");
    n=sc.nextInt();
    
    while(n>0){
      f=f*n;
      n--;
      }
    System.out.println("The factorial of"+ n +" is: "+f);
  }
}