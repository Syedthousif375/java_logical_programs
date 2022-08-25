import java.util.Scanner;
class integer
{
  public static void main(String args[])
  {
     int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the n value:");
    n=sc.nextInt();
    if(n%2!=0)
      System.out.println("Weird");
    if(n%2==0)
    {
      if(n>=2&&n<=5)
        System.out.println("not Weird");
      if(n>=20)
        System.out.println("not Weird");
      else
        System.out.println("weird");
    }
  }
}