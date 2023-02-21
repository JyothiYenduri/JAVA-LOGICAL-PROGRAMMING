/* -1, 2, -3, 4, 5, 6, -7, 8, 9 , -47
Output:-1, -3, -7,-47, 2, 4, 5, 6,  8, 9 */
import java.util.*;
class C20_Arrays{
  public static void main(String args[]){
    int a[]={-1,2,-3,4,5,6,-7,8,9,-47};
    int n=a.length;
    int j=0;
    int k=0;
    for(int i=0;i<n;i++){
      if(a[i]<0){
        a[j]=a[i];
        System.out.print(a[j]+" ");
      }
    }
    for(int i=0;i<n;i++){
      if(a[i]>0){
        a[k]=a[i];
        System.out.print(a[k]+" ");
      }
     
    }
      
      
    /*for(int j=0;j<n;j++){
      System.out.print(a[j]);
    }
    for(int k=0;k<n;k++){
      System.out.print(a[k]);
    }*/
    
  }
}