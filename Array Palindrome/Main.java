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
      int temp=n-1;;
      for(int i=0;i<n;i++)
      {
        b[temp]=a[i];
        temp--;
      }
      int is_palindrome=0;
      for(int i=0;i<n;i++)
      {
       if(a[i]!=b[i])
       {
         is_palindrome =1;
         break;
       }
      }
      if(is_palindrome==0)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
      
        
        
      
      
     
    }
}