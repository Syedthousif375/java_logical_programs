import java.util.Scanner;
class simple
  {
  public static void main(String args[])
    {
    int P,R,T;
    Scanner sc=new Scanner(System.in);
      System.out.println("the principle:");
      P=sc.nextInt();
      System.out.println("the total amount of time:");
      T=sc.nextInt();
      System.out.println("the rate of interst is:");
      R=sc.nextInt();
      float SI=(P*R*T)/100;
      float Ta=P+SI;
      System.out.println("the value of simple interst is:"+SI);
      System.out.println("the value of total amount is:"+Ta);
    }
  } 
