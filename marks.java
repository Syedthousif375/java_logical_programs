import java.util.Scanner;
class marks
  {
  public static void main(String args[])
    {
    int stdno; 
    int sub1,sub2,sub3;
    String stdname; 
    float totalmarks,average;
    Scanner sc=new Scanner(System.in);
      System.out.println("The student number is:");
      stdno=sc.nextInt();
      System.out.println("the sub1 is:");
      sub1=sc.nextInt();
      System.out.println("the sub2:");
      sub2=sc.nextInt();
      System.out.println("the sub3:");
      sub3=sc.nextInt();
      System.out.println("the student name is:");
      stdname=sc.next();
      totalmarks=sub1+sub2+sub3;
      average=totalmarks/3;
      System.out.println("the student no:"+stdno);
      System.out.println("the studnet name is:"+stdname);
      System.out.println("enter sub1 marks is:"+sub1);
      System.out.println("enter sub2 marks is:"+sub2);
      System.out.println("enter sub3 marks is:"+sub3);
      System.out.println("the total marks is:"+totalmarks);
      System.out.println("the average is:"+average);
    }
  } 