import java.util.*;
class OddNos_uptoN{
  public static void main(String args[]){
    int n,i=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number: ");
    n=sc.nextInt();
    while(i<=n){
      if(i%2!=0){
        System.out.println(i); 
      }
      i++;
    }
  }
}