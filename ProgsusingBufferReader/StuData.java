import java.io.*;
class StuData
{
    public static void main(String args[]) throws IOException
    {
      InputStreamReader in=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(in);
      int sno;
      String sname;
      int math_marks,phy_marks,comp_marks;
      int total;
      double avg;
      System.out.println("Enter Student number:");
      sno=Integer.parseInt(br.readLine());
      System.out.println("Enter Student name:");
      sname=br.readLine();
      System.out.println("Enter Maths marks:");
      math_marks=Integer.parseInt(br.readLine());
      System.out.println("Enter Physics marks:");
      phy_marks=Integer.parseInt(br.readLine());
      System.out.println("Enter CS marks:");
      comp_marks=Integer.parseInt(br.readLine());
      total=math_marks+phy_marks+comp_marks;
      avg=total/3;
 
      System.out.println("Student Report Card: ");
      System.out.println("--------------------");
      System.out.println("Student Number: "+sno);
      System.out.println("Student Name: "+sname);
      System.out.println("Maths marks: "+math_marks);
      System.out.println("Physics marks: "+phy_marks);
      System.out.println("Computer Science marks: "+comp_marks);
      System.out.println("Student Total marks: "+total);
      System.out.println("Student Average marks: "+avg);
      
    }
}