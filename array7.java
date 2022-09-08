import java.util.Scanner;
class array7
  {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
      int r1,c1,i,j;
      System.out.println("enter row size:");
      r1=sc.nextInt();
      System.out.println("enter column size:");
      c1=sc.nextInt();
      int a[][]=new int[r1][c1];
System.out.println("enter elements to an array:");
      for(i=0;i<r1;i++)
          {
        for(j=0;j<c1;j++)
          {
            a[i][j]=sc.nextInt();
          }
          }
  System.out.println("The elements in an array is:\n");
      for(i=0;i<r1;i++)
        {
          for(j=0;j<c1;j++)
            {
              System.out.print("\t"+a[i][j]);
            }
          System.out.println();
        }
    }
  }