import java.util.*;
class Input_Basic_Cal_Gross{
  public static void main(String args[]){
    Double Basic=0.0,Gross=0.0,HRA=0.0,DA=0.0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Basic Salary in Rs. ");
    Basic=sc.nextDouble();
    if(Basic<=10000.0){
      HRA=Basic*20/100;
      DA=Basic*80/100;
      Gross=Basic+HRA+DA;
      System.out.println("HRA @20% is: "+HRA);
      System.out.println("DA @80% is: "+DA);
      System.out.println("Gross Salary is: "+Gross);
    }
    if((Basic>10000.0)&&(Basic<=20000.0)){
      HRA=Basic*25/100;
      DA=Basic*90/100;
      Gross=Basic+HRA+DA;
      System.out.println("HRA @25% is: "+HRA);
      System.out.println("DA @90% is: "+DA);
      System.out.println("Gross Salary is: "+Gross);
    }
    if(Basic>20000.0){
      HRA=Basic*30/100;
      DA=Basic*95/100;
      Gross=Basic+HRA+DA;
      System.out.println("HRA @30% is: "+HRA);
      System.out.println("DA @95% is: "+DA);
      System.out.println("Gross Salary is: "+Gross);
    }
    
  }
}