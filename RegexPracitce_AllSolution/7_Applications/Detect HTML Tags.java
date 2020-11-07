import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        SortedSet<String> tags = new TreeSet<String>();
        Pattern p=Pattern.compile("<([a-z\\d]+)");
        Matcher m;
      
        while(br.ready()){ 
          m=p.matcher(br.readLine());
          while(m.find()) tags.add(m.group(1));
        }

       for(String t: tags.subSet(tags.first(),tags.last())) System.out.print(t+';');
       System.out.println(tags.last());     
               
    }
}
