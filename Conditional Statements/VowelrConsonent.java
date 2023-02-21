import java.util.Scanner;
class VowelrConsonent{
  public static void main(String args[]){
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a character: ");
    ch=sc.next().charAt(0);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    System.out.println("The given character is Vowel");
    else
    System.out.println("The given character is Consonent");
  }
}