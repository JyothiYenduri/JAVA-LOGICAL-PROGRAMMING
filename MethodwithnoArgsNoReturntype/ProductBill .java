import java.util.*;
class ProductReport
  {
    void pro_report()
    {
      int PNo;
      String PName;
      float PCost,PQty;
      float Bill_Amt;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Please enter the product number as integer: ");
      PNo=sc.nextInt();
      System.out.println("Please enter the product name as String: ");
      PName=sc.next();
      System.out.println("Please enter the product quantity in Kgs.: ");
      PQty=sc.nextFloat();
      System.out.println("Please enter the product amount in Rs.: ");
      PCost=sc.nextFloat();
      Bill_Amt=PQty*PCost;
      System.out.println("The below is the Product report: ");
      System.out.println("Product Number is: "+PNo);
      System.out.println("Product Name is: "+PName);
      System.out.println("Product Quatity is: "+PQty+" Kgs.");
      System.out.println("Product Cost is: "+PCost+" Rs.");
      System.out.println("The Amout of the product is: "+Bill_Amt+" Rs.");
    }
  }
  class ProductBill
    {
      public static void main(String args[])
      {  
        ProductReport p=new ProductReport();
        p.pro_report();
      }
    }