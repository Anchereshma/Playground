import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      
      int n = in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int b[]=new int[n];
      int count=1;
      for(int i=0;i<n;i++)
      {
        b[i]=count;
        count++;
      }
      for(int i=0;i<n;i++)
      {
       for(int j=0;j<n;j++)
       {
         if(a[i]==b[j])
         {
           b[j]=0;
         }
       }
      }
      for(int i=0;i<n;i++)
      {
        if(b[i]!=0)
        {
          System.out.print(b[i]);
        }
      }
        
        
      
      
        // Type your code here
    }
}