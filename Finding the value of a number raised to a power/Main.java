import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exponent = in.nextInt();
      int temp=1;
      int temp1=base;
      while(temp<exponent)
      {
        base = base*temp1;
        temp++;
      }
      System.out.println(base);
    }
}