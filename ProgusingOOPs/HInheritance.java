import java.util.*;
class Parent{
  Scanner sc=new Scanner(System.in);
  int n;
  void read(){
    System.out.println("Enter n value: ");
    n=sc.nextInt();
  }
}
class Child1 extends Parent{
  void fact(){
    int fact=1;
    for(int i=1;i<=n;i++){
      fact=fact*i;
      }
    System.out.println("The factorial of"+n+" is: "+fact);
  }
}
class Child2 extends Parent{
  void sum(){
    int sum=0;
    for(int i=1;i<=n;i++){
      sum=sum+i;
    }
    System.out.println("The sum of "+n+" natural no's is:"+sum);
  }
}
class HInheritance{
  public static void main(String args[]){
    Child1 c1=new Child1();
    c1.read();
    c1.fact();
    Child2 c2=new Child2();
    c2.read();
    c2.sum();
  }
}