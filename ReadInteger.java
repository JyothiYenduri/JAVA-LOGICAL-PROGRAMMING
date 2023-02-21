import java.io.*;
class ReadInteger
{
    public static void main(String args[]) throws IOException
    {
      InputStreamReader in=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(in);
       int n;
      System.out.println("Enter Any number:");
      n=Integer.parseInt(br.readLine());
 
      System.out.println("The Given Number is:"+n);
      
    }
}