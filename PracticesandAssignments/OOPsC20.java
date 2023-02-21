/* Scenario: A car rental company has a fleet of different types of cars, 
including sedans, SUVs, and sports cars. The company wants to keep track 
of each car's rental details, such as the rental price, the number of seats,
and the availability of each car. Create a superclass called "Car" with the 
following attributes: 
make (String)
model (String)
year (int)
rental price per day (double)
number of seats (int)
availability (boolean)
Create three subclasses of Car: Sedan, with the additional attribute of
"trunk size" (int)
SUV, with the additional attribute of "four-wheel drive" (boolean)
SportsCar, with the additional attribute of "horsepower" (int)
Create a constructor for each subclass that initializes its respective 
additional attribute(s) along with the attributes inherited from the 
superclass. Create a method for each subclass to display its specific
attributes along with the attributes inherited from the superclass. 
In the main method, create at least one object of each subclass and 
call the respective method to display their attributes. Also, update 
the availability of each car as it gets rented out and returned.*/

import java.util.*;
class Car{
  String mk,mdl;
  int y,n_s;
  double rent;
  boolean avl;
  Car(String make, String model, int year, int no_seats,double rent_price, boolean availability){
    mk=make;
    mdl=model;
    y=year;
    n_s=no_seats;
    rent=rent_price;
    avl=availability;
    }
  void display(){
    System.out.println("Make: "+mk);
    System.out.println("Model: "+mdl);
    System.out.println("Year: "+y);
    System.out.println("Num_of_Seats: "+n_s);
    System.out.println("Rent Price: "+rent);
    System.out.println("Availability: "+avl);
  }
}
class Sedan extends Car{
  int trunksize;
  Sedan(String make, String model, int year, int no_seats,double rent_price, boolean availability,int ts){
    super(make, model, year, no_seats, rent_price, availability);
    trunksize=ts;
  }
  void features(){
    System.out.println("Features and availability of Sedan are: ");
    System.out.println("---------------------------------------");
    super.display();
    System.out.println("trunksize "+trunksize);
  }
}
/*class SUV extends Car{
  boolean fourwheeldrive;
  SUV(String make, String model, int year, int no_seats,double rent_price, boolean availability,boolean fwd){
    super(make, model, year, no_seats, rent_price, availability);
    fourwheeldrive=fwd;
  }
    void features(){
    System.out.println("Features and availability of SUV are: ");
    System.out.println("---------------------------------------");
    super.display();
    System.out.println("fourwheeldrive "+fourwheeldrive);
    }
}
class SportsCar extends Car{
  int horsepower;
  SportsCar(String make, String model, int year, int no_seats,double rent_price, boolean availability,int hp){
    super(make, model, year, no_seats, rent_price, availability);
    horsepower=hp;
  }
  void features(){
    System.out.println("Features and availability of Sports Car are: ");
    System.out.println("---------------------------------------");
    super.display();
    System.out.println("horsepower "+horsepower);
}
}*/
public class OOPsC20 {
  public static void main(String args[]) {
    String mk,mdl;
    int y,st;
    double prc;
    boolean avl;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter vehicle make: ");
    mk=sc.next();
    System.out.println("Enter vehicle model: ");
    mdl=sc.next();
    System.out.println("Enter year of the model: ");
    y=sc.nextInt();
    System.out.println("Enter No.of seats: ");
    st=sc.nextInt();
    System.out.println("Enter Rental price: ");
    prc=sc.nextDouble();
    System.out.println("Enter the availability of car: ");
    avl=sc.nextBoolean();
    int ts,hp;
    boolean fwd;
    System.out.println("Enter trunk size: ");
    ts=sc.nextInt();
 /*   System.out.println("Enter wherher it is fwd or not: ");
    fwd=sc.nextBoolean();
    System.out.println("Enter Horse power: ");
    hp=sc.nextInt();*/
    Sedan sd=new Sedan(mk,mdl,y,st,prc,avl,ts);
    //sd.display();
    sd.features();
  /*  SUV sv=new SUV(mk,mdl,y,st,prc,avl,fwd);
   // sv.display();
    sv.features();
    SportsCar spc=new SportsCar(mk,mdl,y,st,prc,avl,hp);
   // spc.display();
    spc.features();*/
  }
}

