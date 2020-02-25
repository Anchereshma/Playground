import java.util.Scanner;
class Main
{
  public static int sum(int num)
  {
    int count = 1,sum=0,asd=0;
    while(count<=num)
    {
      asd = asd+count;
      count++;
    }
    return asd ;
  }
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count = 1 ;
      int res = sum(n);
      System.out.println(res);
	    // Type your code here
	}
}