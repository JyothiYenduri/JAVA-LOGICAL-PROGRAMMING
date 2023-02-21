import java.util.*;
class FactusingForloop{
  public static void main(String args[]){
    int n,f=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value: ");
    n=sc.nextInt();
    
    for(int i=1;i<=n;i++){
      f=f*i;
    }
    
    System.out.println("The factorial of "+ n +" is: "+f);
  }
}