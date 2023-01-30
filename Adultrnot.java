import java.util.*;
class Adultrnot
  {
    public static void main(String args[]){
      int age;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter age of a person: ");
      age=sc.nextInt();
            
      if(age>=13){
         if(age<=19){
        System.out.println("The person is a teanager");
         }
        else 
        System.out.println("The person is an adult");
      }
      else 
      System.out.println("The person is not an adult and teanager");
      
    }
  }