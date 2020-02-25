import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in =  new Scanner(System.in);
    String str = in.nextLine();
    int len = str.length();
    reverseword(str);
  }
  public static void reverseword(String str)
  {
    String words[] = str.split(" ");
    String reversestring = "";
    for(int i=0;i<words.length;i++)
    {
      String word = words[i];
      String reverseword = "";
      for(int j=word.length()-1;j>=0;j--)
      {
        reverseword = reverseword+word.charAt(j);
      }
      reversestring = reversestring+reverseword+" ";
    }
    System.out.print(reversestring);
  }
      
        
    
    
}