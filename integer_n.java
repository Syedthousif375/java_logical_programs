import java.util.Scanner;
class integer_n
  {
  public static void main(String args[])
  {
    int n,i,sum=0;
    int even;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the n value");
    n=sc.nextInt();
    for(i=0;i<n;i++)
      {
      even=2*i;
          if(even%3==0)
          {
      sum=sum+even;
      }
      }
          System.out.print(sum);
      }
  }

