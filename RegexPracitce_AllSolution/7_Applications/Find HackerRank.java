import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Solution {

    public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
       int n=Integer.parseInt(br.readLine());
      
        for(int i=0;i<n;i++){
            String str=new String(br.readLine());
            if(str.matches("\\bhackerrank\\b")) {System.out.println("0");continue;}
            else if(str.matches("^hackerrank.*")){System.out.println("1");continue;}
            else if(str.matches(".*hackerrank$")) System.out.println("2");
            else System.out.println("-1");
        }
        
        

    }
}
