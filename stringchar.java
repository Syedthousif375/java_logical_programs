
   // WAP to count Total number of Alphabets,digits and special characters in a String?
import java.util.*;
class stringchar
  {
    public static void main(String args[])
    {
      String alp_str="WeLcomE to biT 2 daY cLaSs";
      int i, alp,digit,spl;
      alp=digit=spl=0;
      char ch;
      for( i=0;i<alp_str.length();i++)
        {
        ch=alp_str.charAt(i);
        
      if(ch>='a'&& ch<='z'|| ch>='A'&& ch<='Z')
      {
        alp++;
      }
      else if(ch>='0'&& ch<='9')
        {
        digit++;
        }
      else
      {
      spl++;
    }
  }
System.out.println("number of alphabet character="+alp);
System.out.println("number of digit character="+digit);
System.out.println("number of special charcter="+spl);
}
}