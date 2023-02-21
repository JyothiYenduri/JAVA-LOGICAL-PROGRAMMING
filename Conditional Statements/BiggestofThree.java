import java.util.*;
class BiggestofThree{
  public static void main(String args[]){
    int a,b,c,max=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 3 no's");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    
    if(max<a){
      max=a;
    }
    if(max<b){
      max=b;
    }
    if(max<c){
      max=c;
    }
    System.out.println("the biggest no.is: "+max);
    
  }
}