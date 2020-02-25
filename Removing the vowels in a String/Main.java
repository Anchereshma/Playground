import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int n = sb.length();
    
    for(int i=0;i<n;i++)
    {
      if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='o'||sb.charAt(i)=='i'||sb.charAt(i)=='u')
      {
       sb.setCharAt(i,'$');
        
      }
    }
    for(int k=0;k<n;k++)
    {
      if(sb.charAt(k)!='$')
      {
        System.out.print(sb.charAt(k));
      }
    }
  }
}