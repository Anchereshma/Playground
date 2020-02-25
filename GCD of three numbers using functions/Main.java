import java.util.Scanner;
public class Main
{
  public static int gcd(int a , int b, int c)
  {
    int sod=0,min,mi;
    if(a<b)
    {
      mi=a;
    }
    else
    {
      mi = b;
    }
    if(mi<c)
    {
      min=mi;
    }
    else
    {
      min=c;
    }
    while(min>0)
    {
      if((a%min==0)&&(b%min==0)&&(c%min==0))
      {
        sod = min;
        break;
      }
      min--;
    }
    return sod;
  }
      
	public static void main (String[] args)
	{
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int res = gcd(n1 , n2 , n3);
      System.out.println(res);
	    // Type your code here
	}
}