import java.util.*;
class FibonacciSeries{
  public static void main(String args[]){
    int n,sum=0,t1=0,t2=1,count=2;
    
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value: ");
    n=sc.nextInt();
    System.out.println(t1);
    System.out.println(t2);
    
    for(int i=1;i<=n;i++){
      
      
      sum=t1+t2;//0+1=1
      if(count<=(n-1)){
      System.out.println(sum);//0  1  1
      }
      t1=t2;//t1=1
      t2=i;//t2=1
      count++;
      
    }
    
    
  }
}
//0 1 1