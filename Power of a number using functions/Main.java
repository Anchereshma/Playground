import java . util.Scanner;
class Main
{
  public static int power(int a, int b)
  {
    int sol=1;
   while(b>=1)
   {
     sol = sol*a;
       b--;
   }
     return sol;
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    int res = power(n1,n2);
    System.out.println(res);
  }
}