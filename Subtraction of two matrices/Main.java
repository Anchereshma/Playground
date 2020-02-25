import java.util.Scanner;
class Main
{ 
  public static void main(String args[]) 
  { 
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int matrix1[][]=new int[r][c];
    int matrix2[][]=new int[r][c];
    int substract[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        matrix1[i][j]=in.nextInt();
      }
    }
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        matrix2[i][j]=in.nextInt();
      }
    }
    for(int i=0;i<substract.length;i++)
    {
      for(int j=0;j<substract[i].length;j++)
      {
        substract[i][j]=matrix1[i][j]-matrix2[i][j];
      }
    }
   for(int i = 0; i <= substract.length - 1; i++)
   {
      for(int j = 0; j <= substract[i].length - 1; j++)
      {
        System.out.print(substract[i][j] + " ");
      }
      System.out.println();
    }
    
    
    
    
  }
}