import java.util.Scanner;
class nice
  {
    public static void main(String args[])
    {
      int r;
      float pi=3.14f,area;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter radius value:");
      r=sc.nextInt();
      System.out.println("The aera of circle is:");
      area=pi*r*r;
      System.out.println(area);
    }
  }