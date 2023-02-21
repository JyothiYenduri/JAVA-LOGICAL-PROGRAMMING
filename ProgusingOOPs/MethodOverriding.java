import java.util.Scanner;
class Addition{
  void sum(int x, int y ){
    System.out.println(x+y);
  }
}
class Addition1 extends Addition{
  void sum(int x, int y ){
    System.out.println(x+y);
  }
}
class MethodOverriding{
  public static void main(String args[]){
    Addition ad=new Addition();
    Addition1 ad1=new Addition1();
    Addition add;
    add=ad;
    add.sum(10,20);
    add=ad1;
    add.sum(40,50);
  }
}