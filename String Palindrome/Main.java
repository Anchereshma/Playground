import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      int len = str.length();
      int front = 0;
      int last = len-1;
      boolean is_palindrome = true;
      while(front<last)
      {
        if(str.charAt(front)!=str.charAt(last))
        {
          is_palindrome = false;
          break;
        }
         front++;
        last--;
      }
      if(is_palindrome == true)
      {
        System.out.println("Yes");
      }
        else 
      {
        System.out.println("No");
      }
    } 
}