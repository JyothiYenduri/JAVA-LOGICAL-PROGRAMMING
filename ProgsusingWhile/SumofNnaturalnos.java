import java.util.*;
class SumofNnaturalnos{
  public static void main(String args[]){
    int n,s=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value: ");
    n=sc.nextInt();
    int i=1;
    while(i<=n){
      s=s+i;
      i++;
      }
    System.out.println("The sum of"+n+"natural no's is: "+s);
  }
}