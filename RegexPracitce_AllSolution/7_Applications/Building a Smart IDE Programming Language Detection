import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Pattern java= Pattern.compile("^(\\s*import [a-zA-Z\\s\\.]+(\\*?;)$)");
        Pattern C= Pattern.compile("^(\\s*#include[<\"][\\w\\.]+[\">]$)");
        Pattern python= Pattern.compile("^\\s*((def)|(print)).+[:\\)]$");
        Matcher m;
        String str;
        while((str=br.readLine())!=null){
              if(java.matcher(str).matches()) {System.out.println("Java"); break;}
              if(C.matcher(str).matches()) {System.out.println("C");break;}
              if(python.matcher(str).matches()) {System.out.println("Python");break;}    
        }
    }
}
