import java.io.*;
class Read_Dec_Val
{
    public static void main(String args[]) throws IOException
    {
      InputStreamReader in=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(in);
       float f;
      System.out.println("Enter Any number:");
      f=Float.parseFloat(br.readLine());
 
      System.out.println("The Given Number is:"+f);
      
    }
}