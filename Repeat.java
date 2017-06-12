import java.io.*;
import java.util.*;
class Repeat
{
  public static void main(String args[])
  { 
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int i,j;
    int s=0;
    int b[]=new int[a];
    for(i=0;i<a;i++)
    {
    b[i]=scan.nextInt();
    }
    for(i=0;i<a;i++)
    {
      for(j=i+1;j<a;j++)
      { 
        if(b[i]==b[j])
        {
        s++;
        break;
        }
        if(s!=0)
          break;
      }
      if(i!=a)
      {
        System.out.print(b[i]);
      }
    }
  }
