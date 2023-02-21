import java.util.*;
class MultiplicationTable{
  public static void main(String args[]){
    int n,i=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number: ");
    n=sc.nextInt();
    while(i<=20){
      System.out.println(n+"*"+i+"="+(n*i));
      i++;
    }
  }
}