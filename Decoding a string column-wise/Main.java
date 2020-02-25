import java.util.Scanner;
class Main{
  public static void main(String args[]) 
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int col_count = in.nextInt();
    StringBuilder sb = new StringBuilder(str);
     int sblen = sb.length();
    delete_spaces(sb,sblen);
    sblen = sb.length();
    int row_count=sblen/col_count;
    if((sblen%col_count)>0)
    {
      row_count++;
    }
    for(int col_idx =0;col_idx<col_count;col_idx++)
    {
      for(int row_idx=0;row_idx<row_count;row_idx++)
      {
      int curr_char_idx = col_idx + (row_idx * col_count);
    if(row_idx%2==1)
    {
      int char_idx = (col_count-1)+(row_idx * col_count);
      curr_char_idx=char_idx - col_idx;
    }
        char ch ;
        if(curr_char_idx>=sblen)
        {
          ch = 'X';
        }
        else 
        {
          ch = sb.charAt(curr_char_idx);
        }
        System.out.print(ch);
      }
    }
  }     
  public static void delete_spaces(StringBuilder sb,int sblen)
  {
    StringBuilder temp=new StringBuilder("");
    for(int i=0;i<sblen;i++)
    {
      if(sb.charAt(i)!=' ')
      {
        temp.append(sb.charAt(i));
      }
    }
    sb.setLength(0);
    int temp_len = temp.length();
    for(int i=0;i<temp_len;i++)
    {
      sb.append(temp.charAt(i));
    }
  }
        
      
}