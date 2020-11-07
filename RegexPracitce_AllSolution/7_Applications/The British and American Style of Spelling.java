import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {
   
   public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int n=Integer.parseInt(br.readLine());
       Pattern p;
       Matcher m;

       StringBuilder us,str=new StringBuilder(); 
       for(int i=0;i<n;i++) str.append(br.readLine()+" ");
     
       int t=Integer.parseInt(br.readLine());
       int l,count;

       for(int i=0;i<t;i++){
          us=new StringBuilder((br.readLine()));
          l=(us.length()-1);
          us.replace(l-1,l,"[zs]");
          p=Pattern.compile("\\b"+us.toString()+"\\b");
          m=p.matcher(str.toString());
          count=0;
          while(m.find()) ++count;
          System.out.println(count);      
        }
    }
}

