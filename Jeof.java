import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Jeof
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a number for no of lines:");
  int n=sc.nextInt();
  String a=sc.nextLine();
  for(int i=1;i<n;i++)
  {
   System.out.println(i+" "+a);
  }
 }
}