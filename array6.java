class array6
  {
    public static void main(String args[])
    {
      int a[][]={{10,20,30},{40,50,60},{70,80,90}};
      int i,j;
      System.out.println("The elements in an array is:\n");
      for(i=0;i<3;i++)
        {
          for(j=0;j<3;j++)
            {
              System.out.print("\t"+a[i][j]);
            }
          System.out.println();
        }
    }
  }