import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Solution {

    public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Pattern pat;
        Matcher mat;
        int n=Integer.parseInt(br.readLine());
        StringBuilder str,qry;
        
        str=new StringBuilder();
        for(int i=0;i<n;i++) str.append(br.readLine()+" ");
        
        int q=Integer.parseInt(br.readLine());
        for(int i=0;i<q;i++){
            qry=new StringBuilder("(?<=\\W|\\b)"+br.readLine()+"(?=\\W|\\b)");
            pat=Pattern.compile((qry.toString()));
            mat=pat.matcher((str.toString()));
            int Count = 0;
            while(mat.find()) ++Count;
            System.out.println(Count);
        }   

    }
}
