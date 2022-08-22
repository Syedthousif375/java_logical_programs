import java.util.Scanner;
class fdouble
  {
    public static void main(String args[])
    {
    float F,C;
      Scanner sc=new Scanner(System.in);
      System.out.println("the F is:");
      F=sc.nextFloat();
      C=((F-32)*5)/9;
  System.out.println("convert temp to fahrenheat to celsius:"+C);
  }  
 }