import java.util.*;
class SumofDigitsofaNum{
  public static void main(String args[]){
    int n,sum=0,r,temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number: ");
    n=sc.nextInt();
    temp=n;
    while(n>0){
      r=n%10;
      sum=sum+r;
      n=n/10;
    }
    System.out.println("The sum of digits of "+ temp +" is "+sum);
  }
}

/* n=123
  while(n>0)-->123>0-->12>0-->1>0
  r=n%10=3-->123%10=3-->12%10=2-->1%10=1
  s=s+r-->0+3=3-->3+2=5-->5+1=6  
  n=n/10-->123/10=12-->12/10=1-->1/10=0 */