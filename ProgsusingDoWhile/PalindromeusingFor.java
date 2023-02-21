import java.util.*;
class Palindrome{
  int pal_No(int n){
    int rev=0,r,temp;
    temp=n;
    for(int i=1;i<=n;i++){
      r=n%10;
      rev=rev*10+r;
      n=n/10;
    }
    return rev;
    
  }
}
class PalindromeusingFor{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number: ");
    n=sc.nextInt();
    int temp=n;
    Palindrome p=new Palindrome();
    int rev=p.pal_No(n);
    if(temp==rev){
    System.out.println("The reverse of a number is "+rev);
    System.out.println("The given number is Palindrome");
    }
    else{
    System.out.println("The reverse of a number is "+rev);
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