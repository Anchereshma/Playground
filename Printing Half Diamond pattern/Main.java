import java.util.Scanner;
class Main{
	public static void main (String[] args){
Scanner in = new Scanner(System.in);
      int n = in.nextInt();
int i,j, k=1,p;
for(i=1;i<=n;i++)
{
  for(p=1;p<=n-i;p++)
  {
    System.out.print(" ");
  }
  
for(j=1;j<=2*i-1;j++)
{
System.out.print("*");
}
System.out.print("\n");
}
    	// Type your code here
    }    
}