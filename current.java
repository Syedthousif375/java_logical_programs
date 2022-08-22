import java.util.Scanner;
class current
  {
  public static void main(String args[])
    {
    int Cno; 
    int PMR,LMR;
    String Cname; 
    float Tu;
      double Cb;
    Scanner sc=new Scanner(System.in);
      System.out.println("The consumer number is:");
      Cno=sc.nextInt();
      System.out.println("The consumer name is:");
      Cname=sc.next();
      System.out.println("the present month reading is:");
      PMR=sc.nextInt();
      System.out.println("the last month reading is:");
      LMR=sc.nextInt();
      Tu=PMR-LMR;
      Cb=Tu*3.80;
      System.out.println("the consumer number is:"+Cno);
      System.out.println("the consumer name is:"+Cname);
      System.out.println("the present month reading is:"+PMR);
      System.out.println("the last month reading is:"+LMR);
      System.out.println("the total units is:"+Tu);
      System.out.println("the current bill is:"+Cb);
    }
  } 