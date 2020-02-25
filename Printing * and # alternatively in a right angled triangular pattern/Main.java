import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
  		// Type your code here
      int n=sc.nextInt();
      int k=0;
      for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++)
        {
          k++;
          if(k%2==0)
          {
            System.out.print("#");
          }
          else{
            System.out.print("*");
          }
         
        } System.out.println();
        
    }
}}