import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       Pattern p= Pattern.compile("\\([-+]?((([1-8]?\\d)(\\.[\\d]+)?)|(90)(\\.[0]+)?), [-+]?((((1?[0-7]?\\d)|([89]\\d))(\\.[\\d]+)?)|(180)(\\.[0]+)?)\\)");
       Matcher m;
        br.readLine();
       while( br.ready()){
           m=p.matcher(br.readLine());
           System.out.println( m.find()? "Valid" : "Invalid");
       } 
    }
}
