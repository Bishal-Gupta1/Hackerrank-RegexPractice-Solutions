import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            Pattern comment = Pattern.compile("(//.*)|(?s)(/\\*.*?\\*/)");
            String code = br.lines().collect(Collectors.joining("\n"));
            Matcher commentMatcher = comment.matcher(code);
            while(commentMatcher.find()){
                if(commentMatcher.group(1)!=null){
                    System.out.println(commentMatcher.group(1));
                }
                else{
                    Arrays.stream(commentMatcher.group(2).split("\n")).map(line->line.trim()).forEach(System.out::println);
                }
            }
        }
        catch(IOException exception){
            exception.printStackTrace();
        }
    }
}


