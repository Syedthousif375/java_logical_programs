import java.util.Scanner;
class Rectangle
  {
    public static void main(String args[])
    {
      int l,b;
      float area,perimeter;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of length:");
      l=sc.nextInt();
      System.out.println("enter the value of breath:");
      b=sc.nextInt();
      System.out.println("The aera of circle is:");
      area=l*b;
        System.out.println("The perimeter of circle is:");
      perimeter=2*(l+b);
      System.out.println(area);
      System.out.println(perimeter);
    }
  }