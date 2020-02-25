import java.util.Scanner;
class Main{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
String str = in.nextLine();
StringBuilder sb = new StringBuilder(str);
int key = in.nextInt();
int len = sb.length();
for(int i=0;i<len;i++)
{
  if(sb.charAt(i)>='A'&&sb.charAt(i)<='Z')
  {
    char ch = (char)(sb.charAt(i)-key);
    if(ch<'A')
    {
      ch = (char)(ch+26);
    }
  
  sb.setCharAt(i,ch);
  }
   if(sb.charAt(i)>='a'&&sb.charAt(i)<='z')
  {
    char ch = (char)(sb.charAt(i)-key);
    if(ch<'a')
    {
      ch = (char)(ch+26);
    }
  
  sb.setCharAt(i,ch);
  }
}
  System.out.print(sb);
  
    
  
  
  
  
    
  }
}