import java.util.Scanner;
class even 
{
  public static void main(String args[])
  {
     float num;
    Scanner sc=new Scanner(System.in);
    System.out.println("the num is:");
    num=sc.nextFloat();
    if(num%2==0)
    {
      System.out.println("num is even number");
    }
    else
    {
      System.out.println("num is not even number");
    }
  }
}