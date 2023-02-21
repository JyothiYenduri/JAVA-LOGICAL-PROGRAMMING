import java.util.Scanner;
class SeasonsusingSwitch{
  public static void main(String args[]){
    int M;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Month between 1 to 12: ");
    M=sc.nextInt();
    switch(M){
      case 3:
      case 4:
      case 5:
      case 6:
        System.out.println("It is Summer Season");
        break;
      case 7:
      case 8:
      case 9:
      case 10:
        System.out.println("It is Rainy Season");
        break;
      case 11:
      case 12:
      case 1:
      case 2:
        System.out.println("It is Winter Season");
        break;
      default:
        System.out.println("Invalid Input");
        
    }
  }
}