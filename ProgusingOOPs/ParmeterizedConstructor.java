class Condemo1
{
  int a,b;
  Condemo1(int a, int b){
    System.out.println("Its parameterized Constructor");
    System.out.println(a);
    System.out.println(b);
  }
}
  class ParmeterizedConstructor{
    public static void main(String args[])
    {
      Condemo1 c=new Condemo1(20,40);
    }
  }