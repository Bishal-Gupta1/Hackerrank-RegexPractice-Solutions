import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        SortedSet<String> emails = new TreeSet<String>();
        Pattern pat;
        Matcher mat;
        int n=Integer.parseInt(br.readLine());
        StringBuilder str,qry;
        
        str=new StringBuilder();
        for(int i=0;i<n;i++) str.append(br.readLine()+" ");
        
        pat=Pattern.compile("[\\w\\.]+[\\@][\\w\\.]*[comrgin]{2,3}");
        mat=pat.matcher((str.toString()));

        while(mat.find()) emails.add(mat.group());
        for(String e : emails.subSet(emails.first(),emails.last())) System.out.print(e+";");
         System.out.print(emails.last());
          
    }
}
