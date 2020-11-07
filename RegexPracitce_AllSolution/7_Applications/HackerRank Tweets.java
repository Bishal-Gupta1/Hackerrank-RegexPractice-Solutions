import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Pattern pat=Pattern.compile("hackerrank",Pattern.CASE_INSENSITIVE);
        int n=Integer.parseInt(br.readLine());
        int count=0;
        for(int i=0;i<n;i++){
            Matcher mat=pat.matcher(br.readLine());
            while(mat.find()) count++;
        } 
        System.out.print(count);
        
    }
}
