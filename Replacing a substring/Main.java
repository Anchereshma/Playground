import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
     Scanner scan = new Scanner(System.in);
      String s1 = scan.nextLine();
      String s2 = scan.nextLine();
      String s3 = scan.nextLine();
      
      if(s1.contains(s2))
         {
       s1 =s1.replace(s2,s3);
      System.out.print(s1);
      }
      
      
      
      
    }
}