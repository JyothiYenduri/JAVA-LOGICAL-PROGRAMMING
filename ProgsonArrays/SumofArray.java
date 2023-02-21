import java.util.*;
class SumofArray{
  public static void main(String args[]){
    int n,i,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array size: ");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the elements: ");
    for(i=0;i<n;i++){
      a[i]=sc.nextInt();
      }
    System.out.println("The sum of elements in the array are: ");
    for(i=0;i<n;i++){
      sum=sum+a[i];
      }
     System.out.print(sum);   
  }
}