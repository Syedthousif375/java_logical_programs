import java.util.Scanner;
class eq
{
  public static void main(String args[])
  {
     int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("the value of a is:");
    a=sc.nextInt();
       System.out.println("the value of b is:");
    b=sc.nextInt();
       System.out.println("the value of c is:");
    c=sc.nextInt();
      
      if (a==b && b==c && c==a)
    {
      System.out.println("all variables are equal");
    }
      else
    {
      System.out.println("all variables are not equal");
    }
  }
}