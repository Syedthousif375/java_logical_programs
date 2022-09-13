//imp programs
//to print the reverse value of a string without using reverse method
class stringrev
  {
    public static void main(String args[])
    {
      
      String st1="Thousif";
      System.out.println("The reverse of a given string is:");
      for(int i=st1.length();i>0;i--)
          {
        System.out.println(st1.charAt(i-1));
          }
    }
  }