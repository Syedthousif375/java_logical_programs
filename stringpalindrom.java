// imp programs
// write a java program to check the given string is palindrom string or not
import java.util.*;
class stringpalindrom
  {
    public static void main(String args[])
    {
      
      String st1="MADAM";
      String st2="";
      
     for(int i=st1.length();i>0;i--)
       {
         st2=st2+st1.charAt(i-1);
       }
         if(st1.equals(st2))
         {
           System.out.println("the string is a palindrom");
           
         }
         else
         {
           System.out.println("the string is not a plaindrom");
         }
       }
    }
  