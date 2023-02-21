import java.util.*;
class StudentInfo{
  Scanner sc=new Scanner(System.in);
  int sno,math_marks,phy_marks,chem_marks;
  String sname;
  void stuData(){
    
    System.out.println("Enter student Number: ");
    sno=sc.nextInt();
    System.out.println("Enter student Name: ");
    sname=sc.next();
    System.out.println("Enter student maths marks: ");
    math_marks=sc.nextInt();
    System.out.println("Enter student physics marks: ");
    phy_marks=sc.nextInt();
    System.out.println("Enter student chemistry marks: ");
    chem_marks=sc.nextInt();
  }
}
class SumAvg extends StudentInfo{
  int sum=0;
  double avg;
  void sum_avg(){
    sum=math_marks+phy_marks+chem_marks;
    avg=sum/3;
    
  }
}
class Stu_Report extends SumAvg{
  void report(){
    System.out.println("Student Report");
    System.out.println("--------------");
    System.out.println("student Number: "+sno);
    System.out.println("student Name: "+sname);
    System.out.println("student maths marks: "+math_marks);
    System.out.println("student physics marks: "+phy_marks);
    System.out.println("student chemistry marks: "+chem_marks);
    System.out.println("Total marks: "+sum);
    System.out.println("Average marks: "+avg);
  }
} 
class MultiLevelInheritance{
  public static void main(String args[]){
    Stu_Report sr=new Stu_Report();
    sr.stuData();
    sr.sum_avg();
    sr.report();
  }
}