import java.util.Scanner;
class array3
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i,n,max,min;
      System.out.println("enter array size:");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter elements to array:");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      
      System.out.println("the elements in an array is:");
      for(i=0;i<n;i++)
      {
        System.out.println("the a["+i+"] value is :"+a[i]);
      }
      max=a[0];
        for(i=0;i<n;i++)
        {
          if(max<a[i])
            max=a[i];
        }
      min=a[0];
        for(i=0;i<n;i++)
          {
            if(min>a[i])
              min=a[i];
          }
      System.out.println("\nthe maximum value in array is:"+max);
      System.out.println("\nthe minimum value in array is:"+min);
    }
  }