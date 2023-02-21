import java.util.*;
class ChecktheGrade
  {
    public static void main(String args[])
    {
      int s1,s2,s3,tot;
      float avg;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter Student Marks for subject1: ");
      s1=sc.nextInt();
      System.out.println("Enter Student Marks for subject2: ");
      s2=sc.nextInt();
      System.out.println("Enter Student Marks for subject3: ");
      s3=sc.nextInt();
      tot=s1+s2+s3;
      avg=tot/3;
      if((s1>40)&&(s2>40)&&(s3>40)){
        System.out.println("Student pass");
        if(avg<=50)
          System.out.println("Student got Grade C");
        else if(avg>=51&&avg<=70)
          System.out.println("Student got Grade B");
        else if(avg>=71&&avg<=80)
          System.out.println("Student got Grade A");
        else if(avg>=81)
          System.out.println("Student got Distinction");
               
      }
      else{
        System.out.println("Student is fail");
      }
    }
  }