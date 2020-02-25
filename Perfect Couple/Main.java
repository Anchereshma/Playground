import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int val=in.nextInt();
      couple(n,val,a);
    }
  public static void couple(int n,int val,int a[])
  {
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(a[i]+a[j]==val)
        {
          System.out.println(a[i] + ","+" " + a[j]);
        }
      }
    }
  }
        
      
      
      
    
}