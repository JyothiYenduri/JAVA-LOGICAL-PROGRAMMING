import java.util.*;
class CurrentBill
  {
    void powerbill()
    {
      int cno,pmr,lmr,tu;
      String cname;
      float cbill;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Consumer No. ");
      cno=sc.nextInt();
      System.out.println("Enter Consumer Name: ");
      cname=sc.next();
      System.out.println("Enter Present Month reading: ");
      pmr=sc.nextInt();
      System.out.println("Enter Last month reading: ");
      lmr=sc.nextInt();
      tu=pmr-lmr;
      cbill=tu*3.80f;
      System.out.println("The following is the Current Bill of "+cname);
      System.out.println("Consumer No: "+cno);
      System.out.println("Consumer Name: "+cname);
      System.out.println("Last month reading: "+lmr);
      System.out.println("Current month reading: "+pmr);
      System.out.println("Total no.of units: "+tu);
      System.out.println("Total Bill amount for the month is: "+cbill);
    }
  }
  class PowerBill
    {
      public static void main(String args[])
      {
        CurrentBill c=new CurrentBill();
        c.powerbill();
      }
    }