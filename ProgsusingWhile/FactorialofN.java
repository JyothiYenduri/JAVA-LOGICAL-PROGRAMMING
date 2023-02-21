import java.util.*;
class FactorialofN{
  public static void main(String args[]){
    int n,f=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value: ");
    n=sc.nextInt();
    int i=1;
    while(i<=n){
      f=f*i;
      i++;
      }
    System.out.println("The factorial of"+ n +" is: "+f);
  }
}