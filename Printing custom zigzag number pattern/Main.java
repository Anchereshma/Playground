import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
       Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i,j,s,p;
      for(i=1;i<=n;i++)
      {
        if(i%2==1)
        {
          for(s=1;s<=n;s++)
          {
            if(s==n)
            {
              System.out.print(i+1);
            }
            else
            {
              System.out.print(i);
            }
          }
        }
        else
        {
          for(j=1;j<=n;j++)
          {
            if(j==1)
            {
              System.out.print(i+1);
            }
            else
            {
               System.out.print(i);
            }
          }
        }
        System.out.print("\n");
      }
              
              
          
              
          
        
	}
}