import java.util.*;
class Eligibleforvote
  {
    public static void main(String args[]){
      int age;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter age of a person: ");
      age=sc.nextInt();
      
      if(age>18)
        System.out.println("He/she is eligible for voting");
      else
        System.out.println("He/she is not eligible for voting");
    }
  }