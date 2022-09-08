import java.util.Scanner;
class arrayadd8
  {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
      int r1,c1,i,j,r2,c2;
      //read the order of 1st matrix
      System.out.println("enter 1st matrix row size:");
      r1=sc.nextInt();
      System.out.println("enter 1st matrix column size:");
      c1=sc.nextInt();
      //read the order of 2nd matrix
      System.out.println("enter 2nd matrix row size:");
      r2=sc.nextInt();
      System.out.println("enter 2nd matrix column size:");
      c2=sc.nextInt();
       int a[][]=new int[r1][c1];
       int b[][]=new int[r2][c2]; 
       int c[][]=new int[r1][c1];
      
      if(r1==r2 && c1==c2)
      {
System.out.println("enter elements to an array:");
      for(i=0;i<r1;i++)
          {
        for(j=0;j<c1;j++)
          {
            a[i][j]=sc.nextInt();
          }
          }
            System.out.println("enter elements to an array:");
      for(i=0;i<r2;i++)
          {
        for(j=0;j<c2;j++)
          {
            b[i][j]=sc.nextInt();
          }
          }
            
            for(i=0;i<r1;i++)
              {
                for(j=0;j<c1;j++)
                  {
                    c[i][j]=a[i][j]+b[i][j];
                  }
              }
          

          
  System.out.println("The 1st matrix is:\n");
      for(i=0;i<r1;i++)
        {
          for(j=0;j<c1;j++)
            {
              System.out.print("\t"+a[i][j]);
            }
          System.out.println();
        }
   System.out.println("The 2nd matrix is:\n");
      for(i=0;i<r2;i++)
        {
          for(j=0;j<c2;j++)
            {
              System.out.print("\t"+b[i][j]);
            }
          System.out.println();
        }
 System.out.println("the addition matrix is:\n");
        for(i=0;i<r1;i++)
          {
            for(j=0;j<c1;j++)
            {
              System.out.print("\t"+c[i][j]);
            }
          System.out.println();
          }
          }
      
  
      else
      {
        System.out.println("matrix addition is not possible");
      }
    }
  }
