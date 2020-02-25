import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
       Scanner sc =new Scanner(System.in);
        int num= sc.nextInt();
      int fist_num= (num/10);
      int last_num= ((num%100)%10);
	int sum = (fist_num+last_num);
      System.out.print(sum);
    }
}