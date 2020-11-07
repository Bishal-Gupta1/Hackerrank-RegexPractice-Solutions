import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;



public class Solution {

    public static void main(String[] args)throws IOException {
        
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       Pattern IP4=Pattern.compile("^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$");
        Pattern IP6=Pattern.compile("^([\\da-fA-F]{1,4}(\\:)){7}([\\da-fA-F]{1,4})$");
       int n=Integer.parseInt(br.readLine());
       String str;
       for(int i=0;i<n;i++){
         str= new String(br.readLine()); 
         if(IP4.matcher(str).matches()){System.out.println ("IPv4");continue;}
         else if(IP6.matcher(str).matches())System.out.println ("IPv6");
         else System.out.println ("Neither");
       }
    }
}
