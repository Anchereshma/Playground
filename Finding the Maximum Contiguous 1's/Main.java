import java.util.Scanner;
 class Main
{
    public static void main(String args[])
    {
    	Scanner in = new Scanner(System.in);
      int n = in.nextInt();
     int a[]= new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
     int max_sum= 0;
      int count =0;
      for(int i=0;i<n;i++)
      {
        if(a[i]==1)
        {
          count++;
        }
        else
        {
          count=0;
        }
        if(count>max_sum)
        {
          max_sum=count;
        }
      }
      System.out.print(max_sum);
          
      
      
    }
}