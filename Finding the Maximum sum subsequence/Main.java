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
    int max_sum=a[0];
    int cur_sum=a[0];
    
    for(int i=1;i<n;i++)
    {
      if(a[i]>a[i-1])
      {
        cur_sum = cur_sum+a[i];
      }
      else
      {
      cur_sum=a[i];
      }
      if(cur_sum>max_sum)
      {
        max_sum=cur_sum;
      }
    }
    System.out.println(max_sum);
    
        
        
        
      
    
    
    
    
  }
}