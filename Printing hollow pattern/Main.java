import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i ,s,p;
      for(i=1;i<=n;i++)
      {
        
          if(i==1||i==n)
          {
            for(p=1;p<=n;p++)
            {
              System.out.print("*");
            }
          }
          else
          {
            for(s=1;s<=n;s++)
        {
              if(s==1||s==n)
              {
                System.out.print("*");
              }
              else
              {
                System.out.print(" ");
              }
            }
          }
            System.out.print("\n");
          }
	}
}