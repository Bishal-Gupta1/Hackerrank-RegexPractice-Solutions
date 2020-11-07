import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        SortedMap<String,SortedSet<String>> res=new TreeMap<>(); 
        SortedSet<String> val;
        Pattern tag = Pattern.compile("<([a-z\\d]+)([^>]*)>");
        Pattern att = Pattern.compile("\\s+(\\w+)="); 
        Matcher m,m2;
         
        while(br.ready()){ 
           m=tag.matcher(br.readLine());       
            while (m.find()) {
                val= res.get(m.group(1)); 
                if (val == null) {val=new TreeSet(); res.put(m.group(1), val);}
                
                m2 = att.matcher(m.group(2));
                while (m2.find()) val.add(m2.group(1));    
            }
        }

        for (String t: res.keySet()) 
          System.out.println(t+':'+(res.get(t)).toString().replaceAll("[\\[\\]]","").replace(" ", ""));
       
    }
}
