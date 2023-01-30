import java.util.*;
class LeapyearrNot
  {
    public static void main(String args[]){
      int y;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a year: ");
      y=sc.nextInt();
      
      if((y%4==0)&&(y%100!=0)||(y%400==0))
        System.out.println("The given year is leap year");
      else
        System.out.println("The given year is not a leap year");
    }
  }