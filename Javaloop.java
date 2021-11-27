import java.util.*;
import java .io.*;
class Javaloop
{
 public static void main(String args[])
 { 
  Scanner sc=new Scanner(System.in);
  System.out.println("enter values:");
  int t=sc.nextInt();
  for(int i=0;i<t;i++)
  {
   int a=sc.nextInt();
   int b=sc.nextInt();
   int n=sc.nextInt();
   int s=a+b;
   System.out.print(s+" ");
   for(int j=1;j<n;j++)
   {
    s+=((int)Math.pow(2,j))*b;
    System.out.print(s+" ");
   }
   System.out.println();
   sc.close();
  }
 }
}