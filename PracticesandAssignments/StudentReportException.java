class NumberException extends Exception
{
      int s1,s2,s3;
   NumberException(int s1, int s2, int s3)
     {
     this.s1=s1;
     this.s2=s2;
     this.s3=s3;
      }
      public String toString()
      {
       return "Error .."+s1+","+s2+","+s3+"...Marks below 40 got failed";
      }
}
public class StudentReportException //NewThrow
{
    static void test(int s1, int s2, int s3)throws NumberException
     {
         int sno=1;
         String sname="JyothiYenduri";
         System.out.println("Student Roll_no: "+sno);
         System.out.println("Name of the Student is: "+sname);
        if(s1<40 || s2<40 || s3<40)
        {
            throw new NumberException(s1,s2,s3);
        }
        else{
          int tot_marks=s1+s2+s3;
          double avg=tot_marks/3;
          System.out.println("Student secured "+tot_marks+" marks");
          System.out.println("The average marks of the student is: "+avg);
        }
       
     }
 
public static void main(String args[])
  {
            try
            {
              test(45,30,60);
            }
         catch(NumberException ae)
            {
             System.out.println("NumberException :"+ae);
            }
   }
}