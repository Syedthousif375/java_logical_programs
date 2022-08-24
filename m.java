import java.util.Scanner;
class m
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
      if(sub1>=40 && sub2>=40 && sub3>=40)
      {
        System.out.println("result is passed");
      }
      if(average<50)
        System.out.println("the grade is C");
     else if(average>50||average<70)
        System.out.println("the grade is B");
      else if(average>70||average<80)
        System.out.println("the grade is A");
      else if(average>80)
        System.out.println("the grade is D");
      else
      System.out.println("result is fail");
    }
  } 