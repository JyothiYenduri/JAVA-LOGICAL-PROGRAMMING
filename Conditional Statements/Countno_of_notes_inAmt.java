import java.util.*;
class Countno_of_notes_inAmt{
  public static void main(String args[]){
    int Amt=0,Rs2000=0,Rs500=0,Rs200=0,Rs100=0,Rs50=0, Rs20=0,Rs10=0,Rs5=0,Count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter amount in Rs. : ");
    Amt=sc.nextInt();
    if(Amt>=2000){
      Rs2000=Amt/2000;
      Amt=Amt%2000;
      System.out.println("The no.of 2000 Rs. notes are: "+Rs2000);
    }
    if(Amt>=500){
      Rs500=Amt/500;
      Amt=Amt%500;
      System.out.println("The no.of 500 Rs. notes are: "+Rs500);
    }
    if(Amt>=200){
      Rs200=Amt/200;
      Amt=Amt%200;
      System.out.println("The no.of 200 Rs. notes are: "+Rs200);
    }
    if(Amt>=100){
      Rs100=Amt/100;
      Amt=Amt%100;
      System.out.println("The no.of 100 Rs. notes are: "+Rs100);
    }
    if(Amt>=50){
      Rs50=Amt/50;
      Amt=Amt%50;
      System.out.println("The no.of 50 Rs. notes are: "+Rs50);
    }
    if(Amt>=20){
      Rs20=Amt/20;
      Amt=Amt%20;
      System.out.println("The no.of 20 Rs. notes are: "+Rs20);
    }
    if(Amt>=10){
      Rs10=Amt/10;
      Amt=Amt%10;
      System.out.println("The no.of 10 Rs. notes are: "+Rs10);
    }
    if(Amt>=5){
      Rs5=Amt/5;
      Amt=Amt%5;
      System.out.println("The no.of 5 Rs. notes are: "+Rs5);
    }
    Count=Rs2000+Rs500+Rs200+Rs100+Rs50+Rs20+Rs10+Rs5;
    System.out.println("Total number of notes for the given amount is: " +Count);
    System.out.println("The balance amount for which no notes are available are: "+Amt+" Rs.");
  }
}