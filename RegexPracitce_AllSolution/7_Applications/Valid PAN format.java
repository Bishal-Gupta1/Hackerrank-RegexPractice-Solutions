import java.io.*;
import java.util.*;
import java.util.regex.Matcher;


public class Solution {

    public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int n=Integer.parseInt(br.readLine());
         
         for(int i=0;i<n;i++){
             String str=new String(br.readLine());
             System.out.println(str.matches("[A-Z]{5}\\d{4}[A-Z]")? "YES":"NO"); 
         }     
              
    }
}
