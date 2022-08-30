
import java.util.*;
class loopf
{
public static void main(String args[])
{
int n,f=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value:");
n=sc.nextInt();
for( ;n>=1;n--)
{
f=f*n;
}
System.out.println("The Factorial value is:"+f);
}
}
