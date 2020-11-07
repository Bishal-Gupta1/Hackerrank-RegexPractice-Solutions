import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {
   static int count=1; 

   public static void match(Pattern pObj, String str,char c){
      Matcher m=pObj.matcher(str);
      if(m.find()){System.out.print(m.group(1)+c);++count;}
   }
   public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

       Pattern  pID=Pattern.compile("(?:id\\=\"question-summary-)([\\d]+)");
       Pattern  pDes=Pattern.compile("(?:<h3><a href[\\s[\\w][\\-/=\"]]+>)(.+)(</a></h3>)");
       Pattern  pT=Pattern.compile("(?:asked[\\s]*<span[\\s[\\w][\\-:=\"]]+>)([\\w\\s\\:]+)");
       String str;
     
       while((str=br.readLine())!=null ){
             if(count==1) match(pID,str,';');
             if(count==2) match(pDes,str,';');
             if(count==3) match(pT,str,'\n');
             if(count==4) count=1;
       }
      
   }  
}

