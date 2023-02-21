import java.util.*;
class Temp_Freez_Boil{
  public static void main(String args[]){
  int temp;
  int freez=0;
  int boil=100;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter temperature as integer: ");
    temp=sc.nextInt();
    if(temp==0){
      System.out.println("The given temperature is at the state of Freezing");
    }
    else if(temp==100){
      System.out.println("The given temperature is at the state of Boiling");
    }
    else if(temp<0){
      System.out.println("The given temperature is below the state of Freezing");
    }
    else if(temp>100){
      System.out.println("The given temperature is above the state of Boiling");
    }
    else{
      System.out.println("The given temperature is in between the state of       Freezing and Boiling");
    }
    
  }
}

