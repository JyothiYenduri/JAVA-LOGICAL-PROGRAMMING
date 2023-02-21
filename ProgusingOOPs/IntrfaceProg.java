import java.util.*;
class StudentInfo{
  Scanner sc=new Scanner(System.in);
  int sno,math_marks,phy_marks,chem_marks;
  String sname;
  int sum;
  double avg;
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
    sum=math_marks+phy_marks+chem_marks;
    avg=sum/3;
  }
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
interface SumAvg{
  void stuData();
  void report();
}
 
class IntrfaceProg extends StudentInfo implements SumAvg{
  public static void main(String args[]){
    StudentInfo sf=new StudentInfo();
    sf.stuData();
    sf.report();
    
  }
}