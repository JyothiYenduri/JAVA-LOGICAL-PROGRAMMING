import java.util.*;
class Min_Max_Array{
  public static void main(String args[]){
    int n,i,min=0,max=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array size: ");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the elements: ");
    for(i=0;i<n;i++){
      a[i]=sc.nextInt();
      }
    min=max=a[0];
    for(i=0;i<n;i++){
      if(a[i]<min){
        min=a[i];
       }
      if(a[i]>max){
        max=a[i];
       }
      }
    System.out.println("The minimum value of array is:"+min);
    System.out.println("The maximum value of array is:"+max);
        
  }
}