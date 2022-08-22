import java.util.Scanner;
class cost
  {
  public static void main(String args[])
    {
    int Pnumb;
    String Pname;
    float Pcost,Pqty,Bill;
    Scanner sc=new Scanner(System.in);
      System.out.println("The product number is:");
      Pnumb=sc.nextInt();
      System.out.println("the product name is:");
      Pname=sc.next();
      System.out.println("the product cost is:");
      Pcost=sc.nextFloat();
      System.out.println("the product quantity is:");
      Pqty=sc.nextFloat();
      Bill=Pcost*Pqty;
      System.out.println("the product number:"+Pnumb);
      System.out.println("the product name:"+Pname);
      System.out.println("the product cost:"+Pcost);
      System.out.println("the product quantity:"+Pqty);
      System.out.println("the total bill is:"+Bill);
    }
  } 