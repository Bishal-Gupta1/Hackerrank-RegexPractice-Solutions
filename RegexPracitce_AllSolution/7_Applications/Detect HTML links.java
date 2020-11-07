import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Pattern p=Pattern.compile("(?<=(?:<a href=\"))([^\"]+)(\"[^<>]*>)(<\\w>)*([^<>]*)<");
        while(br.ready()){
          Matcher m = p.matcher(br.readLine());
          while(m.find())
             System.out.println(m.group(1)+","+m.group(4).trim());
        }     
             
    }
}

