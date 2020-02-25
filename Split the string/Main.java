import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      Pattern p = Pattern.compile("(,| |and|or)");
      String[] parts=p.split(str);
       for(String q:parts){
            System.out.println(q);
        }  
      
    }
}