import java.util.Scanner;
class in
{
  public static void main(String args[])
  {
     int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the n value:");
    n=sc.nextInt();
    if(n>=1&&n<=9)
      System.out.println("lowercase english");
    if(n==1)
      System.out.println("one");
      else if(n==2)
      System.out.println("two");
    else if(n==3)
      System.out.println("three");
    else if(n==4)
      System.out.println("four");
    else if(n==5)
      System.out.println("five");
    else if(n==6)
      System.out.println("six");
    else if(n==7)
      System.out.println("seven");
    else if(n==8)
      System.out.println("eight");
    else if(n==9)
      System.out.println("nine");
   
    if(n>9)
      System.out.println("greater then nine");
  }
} 

