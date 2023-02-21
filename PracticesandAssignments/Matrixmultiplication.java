import java.util.*;
class Matrixmultiplication{
  public static void main(String args[]){
    int i,j,k,row1,col1,row2,col2,n=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of rows for first matrix:");
    row1=sc.nextInt();
    System.out.println("Enter number of columns for first matrix:");
    col1=sc.nextInt();
    System.out.println("Enter number of rows for second matrix:");
    row2=sc.nextInt();
    System.out.println("Enter number of columns for second matrix:");
    col2=sc.nextInt();
    if((row1==col1)&&(row2==col2)){
      n=row1;
    }
    else{
      System.out.println("Matrix multiplication is not possible");
    }
    int a[][]=new int[row1][col1];
    int b[][]=new int[row2][col2];
    int c[][]=new int[n][n];
    System.out.println("Enter Elements into First array:");
    for(i=0;i<row1;i++){
      for(j=0;j<col1;j++){
        a[i][j]=sc.nextInt();  
      }
    }
    
    System.out.println("Enter Elements into Second array:");
    for(i=0;i<row2;i++){
      for(j=0;j<col2;j++){
      b[i][j]=sc.nextInt();  
      }
    }
    System.out.println("Elements in the First array are:");
    for(i=0;i<row1;i++){
      for(j=0;j<col1;j++){
        System.out.print(" "+a[i][j]);  
      }
      System.out.println();
    }
    
    System.out.println("Elements in the Second array are:");
    for(i=0;i<row2;i++){
      for(j=0;j<col2;j++){
        System.out.print(" "+b[i][j]);  
      }
      System.out.println();
    }
    System.out.println("The multiplication of two matrices is:");
    for(i=0;i<n;i++){
      for(j=0;j<n;j++){
        for(k=0;k<n;k++){
          c[i][j]=c[i][j]+a[i][k]*b[k][j];
        }
        System.out.print(" "+c[i][j]);
      }
      System.out.println();
    }
/* System.out.println("The multiplication of two matrices is:");
    for(i=0;i<3;i++){
      for(j=0;j<3;j++){
      System.out.print(" "+c[i][j]); 
      }
      System.out.println();
    }*/
    
  }
}