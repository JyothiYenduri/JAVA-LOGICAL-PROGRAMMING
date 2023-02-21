import java.util.*;
class Array2{
  public static void main(String args[]){
    int n,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array size: ");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the elements: ");
    for(i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("The elements in the array are: ");
    for(i=0;i<n;i++){
      System.out.print(a[i]+"\t");
    }
        
  }
}