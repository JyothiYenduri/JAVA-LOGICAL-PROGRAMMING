import java.util.*;
public class RemoveEle_LocN {
  public static void main(String[] args) {
    int n,i,rem_loc;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of an array: ");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter elements into an array: ");
    for(i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("elements in the array are: ");
    for(i=0;i<n;i++){
        System.out.print(" "+a[i]);
    }
    System.out.println("\n"+"enter the location of element to be removed:");
    rem_loc=sc.nextInt();
    
    System.out.println("elements in the array after removing element at index "+rem_loc+" is:");
    for(i=rem_loc;i<n-1;i++){
        a[i]=a[i+1];
    }
    n--;
    for(i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }
      
  }
}
