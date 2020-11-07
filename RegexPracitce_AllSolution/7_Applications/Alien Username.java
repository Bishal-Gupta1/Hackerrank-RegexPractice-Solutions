import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {

    public static void main(String[] args)throws IOException {
        
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       Pattern pat=Pattern.compile("(^[\\_.][\\d]+[a-zA-Z]*[\\_]?$)");
       int n=Integer.parseInt(br.readLine());
       for(int i=0;i<n;i++)
        System.out.println(pat.matcher(br.readLine()).matches() ? "VALID" : "INVALID");
        
    }
}
