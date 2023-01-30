import java.util.*;
class PowerBill
  {
    public static void main(String args[])
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
      System.out.println("The following is the Current Bill of "+cname);
      System.out.println("-------------------------------------------");
      System.out.println("Consumer No: "+cno);
      System.out.println("Consumer Name: "+cname);
      System.out.println("Last month reading: "+lmr);
      System.out.println("Current month reading: "+pmr);
      System.out.println("Total no.of units: "+tu);
      System.out.println("Total Bill amount for the month is: ");
      System.out.println("-----------------------------------");
      if(tu<=50){
        cbill=tu*1.45f;
        System.out.println("The bill amount is: " +cbill); 
      }
      else if(tu<=100){
        cbill=50*1.45f+((tu-50)*2.56f);
        System.out.println("The bill amount is: " +cbill); 
      }
      else if(tu<=200){
        cbill=(50*1.45f)+(50*2.56f)+((tu-100)*3.50f);
        System.out.println("The bill amount is: " +cbill); 
      }
      else if(tu<=300){
        cbill=(50*1.45f)+(50*2.56f)+(100*3.50f)+((tu-200)*4.67f);
        System.out.println("The bill amount is: " +cbill); 
      }
      else{
        cbill=(50*1.45f)+(50*2.56f)+(100*3.50f)+(100*4.67f)+((tu-300)*5.67f);
        System.out.println("The bill amount is: " +cbill);
      }
      
      
    }
  }