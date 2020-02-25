import java.util.Scanner;
class Main
{
  public static int gt(int a, int b,int c)
  {
    if(a>b&&a>c)
    {
      return a;
      
    }
    else if(b>c)
    {
      return b;
      
    }
    else
    {
      return c;
      
    }
  }
  public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int great = gt(n1,n2,n3);
    System.out.println(great);
	   
	}
}