import java.util.Scanner;
class odd
  {
  public static void main(String args[])
  {
    int n,i,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the n value");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
      {
        if(i%2==0)
        
          continue;
      
        sum=sum+i;
      }
          System.out.print(+sum);
      }
  }


