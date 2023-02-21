import java.util.*;
class Weekday
  {
    public static void main(String args[]){
      int w;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Week Day Number: ");
      w=sc.nextInt();
            
      if(w==1)
        System.out.println("Monday");
        else if(w==2){
        System.out.println("Tuesday");
        }
        else if(w==3){
          System.out.println("Wednesday");
        }
        else if(w==4){
          System.out.println("Thursday");
        }
        else if(w==5){
          System.out.println("Friday");
        }
        else if(w==6){
          System.out.println("Saturday");
        }
        else if(w==7){
          System.out.println("Sunday");
        }
        else{
          System.out.println("Invalid input");
        }
    }
    }
  