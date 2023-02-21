import java.util.*;
class ReverseofaNo_Method1{
  public static void main(String args[]){
    int n,r;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number: ");
    n=sc.nextInt();
    while(n>0){
      r=n%10;
      System.out.print(r);
      n=n/10;
    }
  }
}
/* n=123
  while(n>0)-->123>0-->12>0-->1>0
  r=n%10=3-->123%10=3-->12%10=2-->1%10=1
  printing r-->3-->2-->1-->S.O.Print(r);  
  n=n/10-->123/10=12-->12/10=1-->1/10=0 */