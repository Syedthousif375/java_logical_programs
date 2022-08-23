import java.util.Scanner;
class bigger
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
    if(a>b)
    {
      System.out.println("a is biggest than b");
            if(a>c)
        System.out.println("b is biggest than c");
      else 
        System.out.println("b is not biggest than c");
    }
     else
    {
       if(b>a)
         System.out.println("c is biggest than a");
       else
         System.out.println("c is not biggest than a");
     } 
    }
  }