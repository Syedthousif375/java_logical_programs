import java.util.*;
class lo
{
public static void main(String args[])
{
int n,f=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value:");
n=sc.nextInt();
while(n>=1)
{
  f=f*n;
  n--;
}
System.out.println(f);
}
}
