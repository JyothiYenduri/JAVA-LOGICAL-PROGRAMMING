import java.util.*;
class NumtoBin{
  public static void main(String args[]){
  int n,rem=0,q=0,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    n=sc.nextInt();
    if(n>=0){//10
      rem=n%2;//10%2=0
      n=n/2;//10/2=5
      if(n>=0){
        sum=n%2;//5%2=1
      n=n/2;//5/2=2
        if(sum>=0){
          
        }
      }
      
    }
    
  }
    
}