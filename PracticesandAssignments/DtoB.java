import java.util.*;
class DtoB{
  public static void main(String args[]){
  int n,i=0;
  int a[]= new int[50];
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number: ");
  n=sc.nextInt();
  while(n>=0)//10>=0-->5>=0
  {
    a[i]=n%2;//0-->1   a[0]=0,a[1]=1,a[2]=0,a[3]=0
    n=n/2;//10/2=5-->2
    i++;//1-->2
  }
    System.out.println("Binary no for given no is: ");
    for(int j=i-1;j>=0;j--){
    System.out.print(a[j] );
    }
  }
}
