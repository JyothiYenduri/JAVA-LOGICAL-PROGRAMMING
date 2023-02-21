import java.util.*;
class Librarytimings{
  public static void main(String args[]){
    String day;
    int time;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any of the week day: ");
    day=sc.next();
    System.out.println("Enter any time between 1 to 24: ");
    time=sc.nextInt();
    if(day!="sunday"){
      if(time>=10 && time<=16){
        System.out.println("Library is open");
      }
      else{
        System.out.println("Library timings are 10Am to 16pm");
      }
    }
    else{
      System.out.println("Library is closed");
    }
    
  }
}