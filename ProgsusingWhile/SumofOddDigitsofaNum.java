import java.util.*;
class SumofOddDigitsofaNum{
  public static void main(String args[]){
    int n,sum=0,rem,temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number: ");
    n=sc.nextInt();
    temp=n;
    while(n>0){
      rem=n%10;
      if(rem%2!=0){
        sum=sum+rem;
      }
      n=n/10;
    }
    System.out.println("The sum of odd digits of "+temp+" is "+sum);
  }
}
