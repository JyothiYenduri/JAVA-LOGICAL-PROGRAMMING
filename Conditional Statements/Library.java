import java.util.*;
class Library{
  public static void main(String args[]){
    int day;
    int time=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any of the week day between 1 to 7: ");
    day=sc.nextInt();
    if(day>=1&&day<=5){
     System.out.println("Enter any time between 1 to 24: ");
    time=sc.nextInt(); 
       if(time>=9 && time<=20){
        System.out.println("Library is open");
      }
      else{
        System.out.println("Library timings are 9Am to 8pm");
      }
    }
    
   // if(day!=6 || day!=7)
    else{
      System.out.println("Library is closed on Saturdays and Sundays");
    }
      
      
    
    /*else{
      System.out.println("Library is closed on Saturdays and Sundays");
    }*/
    
  }
}