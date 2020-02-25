import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
      int r = in.nextInt();
      int c = in.nextInt();
      for(int i=r;i>0;i--)
      {
        for(int j=c;j>0;j--)
        {
          if(j<=i)
          {
            System.out.print(i);
          }
          else
          {
            System.out.print(j);
          }
        }
        System.out.println();
      }
    }
}