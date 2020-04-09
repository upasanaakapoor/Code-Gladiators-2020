/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    static long min(long arr[],int newpos1)
{
long min=arr[arr.length-1];
for(int i=newpos1;i<arr.length;i++)
{
if(arr[i]<min)
{
min=arr[i];
}
}
return min;
}
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int c=0,l=0;
int test_num=Integer.parseInt(br.readLine());//no of test cases
for(int j = 0; j < test_num; j++)
{
long ingnumb=Integer.parseInt(br.readLine());//no of members of each team
String  lines = br.readLine();    
String[] strs = lines.trim().split("\\s+");
long a[]=new long[strs.length];
for (int i = 0; i < strs.length; i++)//quantity of each to create a powerpuff girl
{
a[i] = Long.parseLong(strs[i]);
}
String quant = br.readLine();
String[] strs1 = quant.trim().split("\\s+");
long b[]=new long[strs.length];
for (int i = 0; i < strs1.length; i++)//quanitity of each available
{
b[i] = Long.parseLong(strs1[i]);
}
Arrays.sort(a);
Arrays.sort(b);
int newpos=0;
for(int k = newpos;k < ingnumb;k++)
{
long min1=min(a,newpos);
long min2=min(b,l);
if(min1>min2)
{
c=c+1;
newpos=newpos+1;
l=l+1;
}
else
{
newpos=newpos+1;
}
}
System.out.println(c);
c=0;
newpos=0;
l=0;
}
}

   }