import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution {

    public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int n=Integer.parseInt(br.readLine());
       String lang="(C(PP|SHARP|LOJURE|LISP)?)|(JAVA(SCRIPT)?)|(P(YTHON|ERL|HP|ASCAL))|(R(UBY)?)|(HASKELL)|(BASH)|(SCALA)|(ERLANG)|(LUA)|(BRAINFUCK)|(GO)|(D(ART)?)|(OCAML)|(SBCL)|(GROOVY)|(OBJECTIVEC)";
         Pattern p=Pattern.compile("[\\d]{5,6}\\s("+lang+")");
       
         for(int i=0;i<n;i++)
            System.out.println(p.matcher(br.readLine()).matches() ? "VALID":"INVALID"); 
      
             
              
    }
}
