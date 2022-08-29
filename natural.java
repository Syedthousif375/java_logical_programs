import java.util.Scanner;
class natural
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    
int i,n,sum=0;
    System.out.println("enter the n");
    n=sc.nextInt();
  
  for(i=1;i<=n;i++)
  {
    sum=sum+i;
  }
    System.out.println("the sum of N natural number is:"+sum);
  }
}