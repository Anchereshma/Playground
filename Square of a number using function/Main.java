import java.util.Scanner;
class Main
{
  public static int square(int num)
  {
    int res  = num*num;
    return res;
  }
    
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sod = square(n);
      System.out.println(sod);
	 // Type your code here   
	} 
}