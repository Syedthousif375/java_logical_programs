import java.util.Scanner;
class v
{
  public static void main(String args[])
  {
     char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any character:");
    ch=sc.next().charAt(0);
  if (ch=='a'||ch=='A')
    {
      System.out.println("its vowel");
    }
      else if(ch=='e'||ch=='E')
    {
      System.out.println("its vowel");
    }
      else if(ch=='i'||ch=='I')
    {
      System.out.println("its vowel");
    }
   else if(ch=='o'||ch=='O')
    {
      System.out.println("its vowel");
    }
      else if(ch=='u'||ch=='U')
    {
      System.out.println("its vowel");
    }
    else
System.out.println("its consents");
  }
}