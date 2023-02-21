import java.util.*;
class Divisibleby5n11{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number: ");
    n=sc.nextInt();
    if((n%5==0)&&(n%11==0)){
      System.out.println(n+" is divisible by 5 and 11");
    }
    else{
      System.out.println(n+" is not divisible by 5 and 11");
    }
  }
}
  