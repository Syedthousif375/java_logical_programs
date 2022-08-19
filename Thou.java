import5 java.util.Scanner;
class Thou
  {
    public static void main(String args[])
    {
      int eno;
      String ename;
      float esalary;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter employee number:");
      eno=sc.nextInt();
      System.out.println("Enter employee name:");
      ename=sc.next();
      System.out.println("Enter employee salary:");
      esalary=sc.nextFloat();
      System.out.println("the employee number is:"+eno);
      System.out.println("the employee name is:"+ename);
      System.out.println("the employee salary is:"+esalary);
    }
  }
    
