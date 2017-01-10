import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str=new String();
        while(n>0){
            int r=n%2;
            str=r+str;
            n/=2;
        }
        
        int max=0,i=0;
        while(i<str.length()){
            int j=i;
            int ctr=0;
            while(j<str.length() && str.charAt(j)=='1'){
                ctr++;
                j++;
            }
            if(ctr>max){
                max=ctr;
            }
            ctr=0;
            i++;
        }
        System.out.println(max);
    }
}

