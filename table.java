import java.util.Scanner;
class table
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    
int i, n;
    System.out.println("enter the n");
    n=sc.nextInt();
  
  for(i=1;i<=10;i++)
  {
    System.out.println(n+"*"+i+"="+(n*i));
  }
  }
}