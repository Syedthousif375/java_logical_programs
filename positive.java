import java.util.Scanner;
class positive
{
  public static void main(String args[])
  {
     float num;
    Scanner sc=new Scanner(System.in);
    System.out.println("the num is:");
    num=sc.nextFloat();
    if(num>=0)
    {
      System.out.println("num is positive number");
    }
    else
    {
      System.out.println("num is not positive number");
    }
  }
}