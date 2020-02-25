import java.util.Scanner;
class Main
{
 public static void main(String args[])
  {
Scanner in = new Scanner(System.in);
String str1 = in.nextLine();
  String str2 = in.nextLine();
int n2 = str2.length();
StringBuilder sb = new StringBuilder(str1);
int n1 = sb.length();
for(int i=0;i<n2;i++)
{
for(int j=0;j<n1;j++)
{
if(sb.charAt(j)==str2.charAt(i))
{
for(int t=j;t<=n1-2;t++)
{
  sb.setCharAt(t, sb.charAt(t + 1));
}
  n1--;
}
  
}
}
   String finalstring = sb.substring(0, n1);
    System.out.println(finalstring);
 }
}