import java.util.*;
class Prog{
  public static void main(String args[]){
    int n,rev=0,rem,t;
    t=n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any Number: ");
    n=sc.nextInt();
    while(n>0){
      rem=n%10;
      rev=rev*10+rem;
      n=n/10;
      
    }
    if(t==rev){
      
    
    System.out.println("The reverse of a number is: "+rev);
    }
    }
}

//int a[]=new int[5];
//int a[];
//int a[]={1,2,3,4,5};
//int a[]=new int[]{1,2,3,4,5};