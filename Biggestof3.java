import java.util.*;
class Biggestof3
  {
    public static void main(String args[]){
      int n1,n2,n3;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter 3 numbers: ");
      n1=sc.nextInt();
      n2=sc.nextInt();
      n3=sc.nextInt();
      
      if(n1>n2){
         if(n1>n3){
        System.out.println(n1+ " is big");
         }
      }
       else if(n2>n3 && n2>n1)
        System.out.println(n2+ " is big");
      
        else if(n3>n1 && n3>n2)
        System.out.println(n3+ " is big");
      
    }
  }
    
  