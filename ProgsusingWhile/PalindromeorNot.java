import java.util.*;
class PalindromeorNot{
  public static void main(String args[]){
    int n,rev=0,r,temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number: ");
    n=sc.nextInt();
    temp=n;
    while(n>0){
      r=n%10;
      rev=rev*10+r;
      n=n/10;
    }
    if(temp==rev){
    System.out.println("The reverse of a number "+ temp +" is "+rev);
    System.out.println("The given number is Palindrome");
    }
    else{
    System.out.println("The reverse of a number "+temp+" is "+rev);
    System.out.println("The given number is not a Palindrome");
    }
  }
}
/* n=123-->temp=n
  while(n>0)-->123>0-->12>0-->1>0
  r=n%10=3-->123%10=3-->12%10=2-->1%10=1
  s=s+r-->0*10+3=3-->3*10+2=32-->32*10+1=321  
  n=n/10-->123/10=12-->12/10=1-->1/10=0
  if(temp==sum)*/