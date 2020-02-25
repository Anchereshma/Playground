import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      Pattern p = Pattern.compile(str1);
      Matcher matcher = p.matcher(str2);
      int count =0;
      while(matcher.find())
      {
        count++;
        System.out.println("found:"+" "+count+" "+":"+" "+matcher.start()+" - "+matcher.end());
        
      }
       if(count == 0)
           System.out.println("The given word is not present in the string");
           else
           System.out.println(count);
      
    }
}