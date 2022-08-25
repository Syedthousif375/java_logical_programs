import java.util.Scanner;
class calculator
{
  public static void main(String args[])
  {
     int a=0,b=0,c=0;
    int choice;
    Scanner sc=new Scanner(System.in);
    System.out.println("[1].Addition");
System.out.println("[2].Subtraction");
System.out.println("[3].Multiplication");
System.out.println("[4].Division");
System.out.println("[5].Remainder");
    System.out.println("enter ur choice");
    choice=sc.nextInt();
    if (choice<=5)
    {
    System.out.println("enter a:");
    a=sc.nextInt();
 System.out.println("enter b:");
    b=sc.nextInt();
    }
    
    switch(choice)
      {
        case 1:
          c=a+b;
          System.out.println("the addition is:"+c);
          break;
          case 2:
          c=a-b;
           System.out.println("the subtraction is"+c);
          break;
          case 3:
         c=a*b;
           System.out.println("the multiplication is"+c);
          break;
          case 4:
          c=a/b;
           System.out.println("the division is"+c);
          break;
          case 5:
          c=a%b;
           System.out.println("the remainder is"+c);
          break;
        default:
      System.out.println("wrong choice");    
      }
}
}   

  