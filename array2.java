import java.util.Scanner;
class array2
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i,n;
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
      //sum of an array
      int sum=0;
      
      for (i=0;i<n;i++)
        {
          sum=sum+a[i];
        }
       System.out.println("the sum of N natural number is:"+sum);
  }
    }
  



   
