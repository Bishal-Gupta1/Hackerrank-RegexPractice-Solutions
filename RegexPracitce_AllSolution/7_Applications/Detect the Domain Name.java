import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        SortedSet<String> domains = new TreeSet<String>();

        Pattern pat=Pattern.compile("https?\\://(?:ww[w2]\\.)?(([a-z\\d\\-]+\\.)+[a-z]+)");
     
        int n=Integer.parseInt(br.readLine());
       
        
        for(int i=0;i<n;i++){
            Matcher mat=pat.matcher(br.readLine());
            while(mat.find()) domains.add(mat.group(1));
        }
        
        for(String d : domains.subSet(domains.first(),domains.last())) System.out.print(d+";");
        
        System.out.print(domains.last());
        
    }
}
