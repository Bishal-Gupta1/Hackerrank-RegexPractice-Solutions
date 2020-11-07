import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {

    public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int n=Integer.parseInt(br.readLine());
       Pattern p=Pattern.compile("([\\d]{1,3})([\\-\\s])([\\d]{1,3})\\2([\\d]{4,10})");
       for(int i=0;i<n;i++){
          Matcher m= p.matcher(br.readLine());
          m.find();
          System.out.println("CountryCode="+m.group(1)+",LocalAreaCode="+m.group(3)+",Number="+m.group(4));         
        }
    }
}
