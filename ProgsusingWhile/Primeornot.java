import java.util.*;
class Primeornot{
  public static void main(String args[]){
    int n,i=1,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number: ");
    n=sc.nextInt();
    while(i<=n){//1<3==>2<3==>3<=3==>4>3(Condition fail)
      if(n%i==0){//3%1=0==>3%2=1==>3%3==0
        count++;//1==>1==>2
      }
      i++;//2==>3==>4
    }
      if(count==2){
        System.out.println(n+"is prime");
      }
      else{
        System.out.println(n+"is not a prime");
      }
    
  }
}