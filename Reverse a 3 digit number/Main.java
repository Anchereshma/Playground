import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    int p1= (num/100);
    int p2= ((num/10)%10);
    
    int p3= (num%10);
  int  sum = ((p3*100)+(p2*10)+p1);
      System.out.print(sum);
  }
}