
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    int mid = n/2;
    int temp =0;
    for(int i=0;i<mid;i++)
    {
      for(int j=i+1;j<mid;j++)
      {
        if(a[i]>a[j])
        {
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    int temp1=0;
    for(int i=mid;i<n;i++)
    {
      for(int j = i+1;j<n;j++)
      {
        if(a[i]<a[j])
        {
          temp1=a[i];
          a[i]=a[j];
          a[j]=temp1;
        }
      }
    }
      for(int i=0;i<n;i++)
      {
        System.out.print(a[i]+" ");
      }
      
      
    
   
  }
}