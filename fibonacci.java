//Write a java program to print the first n terms of the fibonacci

import java.util.*;
class fibonacci
  {
    public static void main(String args[])
    {
      int n,a=1,b=0,c=0;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter n value = ");
      n=sc.nextInt();
      
       
      while(n>0)
      {
        
        System.out.print(" "+c);
        c=a+b;
        a=b;
        b=c;
        n--;
      }
    
               
   }
  }