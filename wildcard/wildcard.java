import java.io.*;
import java.util.*;
import java.lang.String.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Pattern p=Pattern.compile("([^\\:]+)\\:([^\\.]+)");
        while(br.ready()){
          Matcher m = p.matcher(br.readLine());
          m.find();
          String str = (m.group(2).trim());
          str=str.replace(" ","%20")+".java)";
          System.out.println(m.group(1)+" |"+m.group(2)+" |"+"[solution.java](https://github.com/Bishal-Gupta1/Hackerrank-10DaysOfStatistics-Solutions/blob/main/Day_/"+str);
        }        
    }
}
        
        
        
        
            
