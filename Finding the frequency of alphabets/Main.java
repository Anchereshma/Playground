import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner scan = new Scanner(System.in);
      String s1 = scan.nextLine();
      StringBuilder sb = new StringBuilder(s1);
      int len = sb.length();
      int a[]=new int[70];
      for(int i=0;i<70;i++)
      {
        a[i]=0;
      }
      for(int i =0;i<len;i++)
      {
        if(sb.charAt(i)>='A'&& sb.charAt(i)<='Z')
        {
          int n = sb.charAt(i)-'A';
          char ch = (char)('a'+n);
          sb.setCharAt(i,ch);
        }
        if(sb.charAt(i)>='a'&& sb.charAt(i)<='z')
        {
         
          a[sb.charAt(i)-'a']++;
        }
      }
      for(int i=0;i<len;i++)
      {
        if(a[sb.charAt(i)-'a']!=0)
        {
          System.out.print(sb.charAt(i)+""+a[sb.charAt(i)-'a']+" ");
          a[sb.charAt(i)-'a']=0;
        }
      }
          
          
          
          
          
    
        
    }
}