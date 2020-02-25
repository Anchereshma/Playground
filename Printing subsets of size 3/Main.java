import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[]=new int[n];
      for(int i =0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      subset(n,a);
    }
  public static void subset(int n,int a[])
  {
    for(int i=0;i<=n-2;i++)
    {
      for(int j=i+1;j<=n-1;j++)
      {
        for(int p=j+1;p<=n-1;p++)
        {
         System.out.print("(" + a[i] + ","+" " + a[j] + ","+" " + a[p] +")"+" ");
        }
      }
      System.out.print("\n");
    }
    }
}