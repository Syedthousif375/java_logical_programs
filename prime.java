import java.util.*;
class prime
{
public static void main(String args[])
{
int i=1,n,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value:");
n=sc.nextInt();
while(i<=n)
{
 if(n%i==0)
 {
   c++;
 }
  i++;
}
  if(c==2)
System.out.println("its a prime number");
  else
  System.out.println("its not a prime number");
}
}
