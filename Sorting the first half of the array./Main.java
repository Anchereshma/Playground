import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    int temp=0;
    for(int i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
     int mid = n/2;
    for(int i=0;i<mid;i++)
    {
      for(int j=i+1;j<mid;j++)
      {
        if(a[i]>a[j])
        {
        temp = a[i];
        a[i]=a[j];
        a[j]=temp;
        }
      }
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(a[i]+" ");
    }
   
        
      
      
    
    
   
    
  }
}