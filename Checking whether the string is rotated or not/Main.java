import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
    Scanner scan = new Scanner(System.in);
    String s1 = scan.nextLine();
    String s2 = scan.nextLine();
      
      int len = s1.length();
       s1 = s1+s1;
      
      if(s1.contains(s2))
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }  
    }
}