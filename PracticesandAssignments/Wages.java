import java.util.*;
class Worker{
 int eno;
 String ename;
 Worker(int no, String name){
     eno=no;
     ename=name;
 }
void display(){
     
     System.out.println("Employee number: "+eno);
     System.out.println("Employee name: "+ename);
 }
}
class Daily_Worker extends Worker{
    int rate;
    Daily_Worker(int no, String name, int r){
        super(no,name);
        rate=r;
    }
    void compay(int h){
        System.out.println("Employee wages details for Daily_worker: ");
        System.out.println("-----------------------------------------");
        display();
        System.out.println("Salary in Rs."+rate*h);
    }
    
}
class Sal_Worker extends Worker{
    int rate;
    Sal_Worker(int no, String name, int r){
        super(no,name);
        rate=r;
    }
    int hrs=40;
    void compay(){
        System.out.println("Employee salary details for Salaried_Worker: ");
        System.out.println("-----------------------------------------");
        display();
        System.out.println("Salary in Rs."+rate*hrs);
    }
}

public class Wages
{
	public static void main(String[] args) {
		int d_no,s_no,d_r,h,s_r;
		String d_name,s_name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee number & name of the DailyWorker: ");
		d_no=sc.nextInt();
		d_name=sc.next();
		System.out.println("Enter rate per hour paid to DailyWorker: ");
		d_r=sc.nextInt();
		System.out.println("Enter number of hours charged by DailyWorker: ");
		h=sc.nextInt();
		System.out.println("Enter employee number & name of the SalariedWorker: ");
		s_no=sc.nextInt();
		s_name=sc.next();
		System.out.println("Enter rate per hour paid to SalariedWorker: ");
		s_r=sc.nextInt();
		Daily_Worker d=new Daily_Worker(d_no,d_name,d_r);
		Sal_Worker s=new Sal_Worker(s_no,s_name,s_r);
		d.compay(48);
		s.compay();
	}
}