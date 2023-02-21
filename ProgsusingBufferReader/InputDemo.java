import java.io.*;
class InputDemo
{
    public static void main(String args[]) throws IOException
    {
      InputStreamReader in=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(in);
       char ch;
      System.out.println("Enter Any Character:");
      ch=(char)br.read();
 
      System.out.println("The Given Character is:"+ch);
      
    }
}
