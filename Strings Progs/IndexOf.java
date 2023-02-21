//indexOf()
//lastIndexOf()
class IndexOf{
  public static void main(String args[]){
    String st1="WELCOME";
    System.out.println("The index of W is : "+st1.indexOf('W'));
    System.out.println("The index of M is : "+st1.indexOf('M'));
    System.out.println("The index of E is : "+st1.indexOf('E'));
    System.out.println("The last index of E is : "+st1.lastIndexOf('E'));
    System.out.println("The index of Z is : "+st1.indexOf('Z'));//if the character is not there in the string it will print -1 as its index
  }
}