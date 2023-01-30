import java.util.Scanner;
class Checkingvowel{
  public static void main(String args[]){
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a character: ");
    ch=sc.next().charAt(0);
    if(ch=='a'||ch=='A')
    System.out.println("The given character is Vowel");
    else if(ch=='e'||ch=='E'){
    System.out.println("The given character is Vowel");  
    }
    else if(ch=='i'||ch=='I'){
    System.out.println("The given character is Vowel");  
    }
    else if(ch=='o'||ch=='O'){
    System.out.println("The given character is Vowel");  
    }
    else if(ch=='u'||ch=='U'){
    System.out.println("The given character is Vowel");  
    }
    else{
    System.out.println("The given character is Consonent");
    }
  }
}