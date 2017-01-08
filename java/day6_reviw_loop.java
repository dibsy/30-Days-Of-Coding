import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int testCases = sc.nextInt();
        String[]words = new String[testCases];
        for(int i=0;i<testCases;i++){
            words[i]=sc.next();
        }
    
        for(int i=0;i<words.length;i++){
            String word=words[i];
            String even="";
            String odd="";
            for(int j=0;j<word.length();j++){
                if(j%2==0){
                    even+=word.charAt(j);
                }else{
                    odd+=word.charAt(j);
                }
            }
            System.out.println(even+" "+odd);
        }
    }
}
