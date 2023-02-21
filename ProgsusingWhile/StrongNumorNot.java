import java.util.*;
class StrongNumorNot{
  public static void main(String args[]){
    int n,rem,s=0,f=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value: ");
    n=sc.nextInt();
    
    while(n>0){//123>0==>12>0
      rem=n%10;//==>123%10=3
      while(rem>0){//==>3!=0==>2!=0==>1!=0
      f=f*rem;//1*3=3==>3*2=6==>6*1=6
      rem--;//3-1=2==>2-1=1==>1-1=0
      }
      s=s+f;//0+6=6
      f=1;
      n=n/10;//123/10=12
    }
    System.out.println("The sum of factorials of digits of given number is"+s);
  }
}
/*n=123,s=0;
while(n>0){
rem=n%10==>123%10=3
while(rem!=0){
int f=1;
f=f*rem;
rem--;
}
s=s+f;
n=n/10;
}
*/