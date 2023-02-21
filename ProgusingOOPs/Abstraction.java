//program on abstraction

import java.util.Scanner;
abstract class ArithOperations{
  abstract void val(int x, int y );
}
class Addition1 extends ArithOperations{
  void val(int x, int y ){
    System.out.println(x+y);
  }
}
class Sub extends ArithOperations{
  void val(int x,int y){
    System.out.println(x-y);
  }
}
class Mul extends ArithOperations{
  void val(int x,int y){
    System.out.println(x*y);
  }
}
class Div extends ArithOperations{
  void val(int x,int y){
    System.out.println(x/y);
  }
}
class Rem extends ArithOperations{
  void val(int x,int y){
    System.out.println(x%y);
  }
}
class Abstraction{
  public static void main(String args[]){
    Addition1 ad1=new Addition1();
    ad1.val(10,20);
    Sub s=new Sub();
    s.val(5,2);
    Mul m=new Mul();
    m.val(10,5);
    Div d=new Div();
    d.val(25,25);
    Rem r=new Rem();
    r.val(10,5);
  }
}