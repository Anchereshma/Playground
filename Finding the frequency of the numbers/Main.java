import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k = in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int temp=0;
      for(int i=0;i<n-1;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          if(a[i]>a[j])
          {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
          }
        }
      }
      int h = n+1;
      int freq[] = new int[h];
      int ref=0;
      for(int i=0;i<n;i++)
      {
        freq[i]=0;
      }
      for(int i=0;i<n;i++)
      {
        ref = a[i];
        freq[ref]++;
      }
      for(int i=1;i<k+1;i++)
      {
        System.out.println(i+" "+freq[i]);
      
      }
        
    }   
}