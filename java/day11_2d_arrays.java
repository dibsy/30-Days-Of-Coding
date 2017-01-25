import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int calcSum(int arr[][],int i,int j){
        return arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = -99999;
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<arr.length-2;i++){
            for(int j=0;j<arr[i].length-2;j++){
                int s = calcSum(arr,i,j);
                if(s>max)
                    max=s;
            }
        }
        System.out.println(max);
    }
}

