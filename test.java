import java.util.Scanner;
class reverseString
{
  public static void main(String args[])
  {
    String s =args[0];
    String rev="";
    for(int j=s.length(); j>0;--j)
    {
      rev=rev+(s.charAt(j-1));
      }
     System.out.println("Reverse of a string is : "+ rev);
   }
}
    
