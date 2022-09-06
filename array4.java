import java.util.Scanner;
class array4
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i,n,ser;
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
      System.out.println("enter the value of search");
      ser=sc.nextInt();
      for(i=0;i<n;i++)
        {
          if(ser==a[i])
          {
            System.out.println("element is found");
            break;
          }
        }
      if(i==n)
        System.out.println("element is not found");
          }
        }