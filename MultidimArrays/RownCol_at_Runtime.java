import java.util.*;
class RownCol_at_Runtime{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    int i,j,r,c;
    System.out.println("Enter row and column size of an array: ");
    r=sc.nextInt();
    c=sc.nextInt();
    int a[][]=new int[r][c];
    System.out.println("Enter elements into the array: ");
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
        a[i][j]=sc.nextInt();
      }
    }
    System.out.println("The elements in the array are: ");
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
        System.out.print(" "+a[i][j]);
      }
      System.out.println();
    }
    
  }
}