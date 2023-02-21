import java.util.*;
class Palindrome {
  Scanner sc = new Scanner(System.in);
  String s;
  void pal() {
    try {
      System.out.println("Enter any string: ");
      s=sc.nextLine();
      StringBuffer sb=new StringBuffer(s);
      String s1=sb.reverse().toString();
      System.out.println("After reversing the given String is:" + s1);
      if(s.equalsIgnoreCase(s1)){
        System.out.println("Palindrome");
      }
      else
        System.out.println("not Palindrome");
    }
    catch (Exception ae) {
      System.out.println("The Exception Occur"+ae);
    }
  }
  public static void main(String args[]) {
    Palindrome p = new Palindrome();
    p.pal();
  }
}