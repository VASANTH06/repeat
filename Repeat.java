ackage element;
import java.io.*;
import java.util.*;
public class Element {

  
    public static void main(String[] args) {
  
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int i,j;
        int a1=0;
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
                  a1++;
                  break;
                   
                }
            }
            if(a1!=0)
                break;
        }
       
        if(i!=a)
        {
            System.out.print(b[i]);
        }
        }
        }
    
    
