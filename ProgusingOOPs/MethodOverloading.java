import java.util.Scanner;
class Addition{
  void sum(int x, int y ){
    System.out.println(x+y);
  }
  void sum(double a, double b, double c){
    System.out.println(a+b+c);
  }
}
class MethodOverloading{
  public static void main(String args[]){
    Addition ad=new Addition();
    ad.sum(10,20);
    ad.sum(4.5,6.3,10.8);
  }
}