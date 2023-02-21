import java.util.*;
class DaysinMonthusingSwitch {
	public static void main(String args[]) {
    int M;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any of the month between 1 to 12:");
    M=sc.nextInt();
    switch(M){
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        System.out.println("This month having 31 days");
        break;
      case 2:
        System.out.println("This month having 28 or 29 days");
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        System.out.println("This month having 30 days");
        break;
      default:
        System.out.println("Invalid input");
        }
  }
}
