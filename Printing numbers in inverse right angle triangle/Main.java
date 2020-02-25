import java.util.Scanner;
class Main {
public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i,j,k;
      int num=n;
      for(i=1;i<=num;i++)
      {
         for(j=n;j>0;j--)
          {
            System.out.print(j);
          }
           System.out.print("\n");
        n--;
      }
          
      
      
	    // Type your code here
	}
}