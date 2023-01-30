import java.util.Scanner;
class VowelusingSwitch{
  public static void main(String args[]){
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a character: ");
    ch=sc.next().charAt(0);
    switch(ch){
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
        System.out.println("It is vowel");
        break;
      default:
        System.out.println("It is consonent");
        
    }
  }
}
