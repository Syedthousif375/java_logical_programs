import java.util.Scanner;
class condition 
{
  public static void main(String args[])
  {
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("the value of a is:");
    a=sc.nextInt();
    System.out.println("the value of b is:");
    b=sc.nextInt();
    if(a>b)
    {
      System.out.println("a is big");
    }
    else
    {
      System.out.println("b is big");
    }
  }
}