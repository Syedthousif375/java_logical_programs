import java.util.Scanner;
class vowel
{
  public static void main(String args[])
  {
     char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any character:");
    ch=sc.next().charAt(0);
      
      if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    {
      System.out.println("its vowel");
    }
      else
    {
      System.out.println("its constents");
    }
  }
}