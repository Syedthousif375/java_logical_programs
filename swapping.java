import java.util.Scanner;
class swapping
  {
    public static void main(String args[])
    {
      int a,b,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of a:");
      a=sc.nextInt();
      System.out.println("enter the value of b:");
      b=sc.nextInt();
      System.out.println("enter the value of c:");
      c=sc.nextInt();
      System.out.println("values before swapping are:");
      System.out.println("a="+a);
      System.out.println("b="+b);
      c=a;
      a=b;
      b=c;
      System.out.println("values after swapping are:");
      System.out.println("a="+a);
      System.out.println("b="+b);
    }
  }
