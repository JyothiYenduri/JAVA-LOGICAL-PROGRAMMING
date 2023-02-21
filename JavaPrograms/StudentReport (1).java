import java.util.*;
class StudentReport
  {
    public static void main(String args[])
    {
      int Sno,Math_Marks,Phy_Marks,CS_Marks;
      String Sname;
      int Tot_Marks;
      float Avg_Marks;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Student Roll_Number: ");
      Sno=sc.nextInt();
      System.out.println("Enter Student Name: ");
      Sname=sc.next();
      System.out.println("Enter Student Maths Marks: ");
      Math_Marks=sc.nextInt();
      System.out.println("Enter Student Physics Marks: ");
      Phy_Marks=sc.nextInt();
      System.out.println("Enter Student Computer Science Marks: ");
      CS_Marks=sc.nextInt();
      Tot_Marks=Math_Marks+Phy_Marks+CS_Marks;
      Avg_Marks=Tot_Marks/3;
      System.out.println("The following is the Student Report for "+Sname);
      System.out.println("The Student Name is: "+Sname);
      System.out.println("The Roll Number of the Student is: "+Sno);
      System.out.println("Maths marks is: "+Math_Marks);
      System.out.println("Physics marks is: "+Phy_Marks);
      System.out.println("Computer Science marks are: "+CS_Marks);
      System.out.println("Total Marks the student secured are: "+Tot_Marks);
      System.out.println("Avg Marks of the student is: "+Avg_Marks);
    }
  }
      
      
      
      