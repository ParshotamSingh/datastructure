package main.java.problems;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        int a = 0;
        int b = 0;
        int n = 0;
        int var1 ;
        int c = a+1*b;
            for(int k=1;k<=n;k++){
                var1 = 0;
                for(int j=1;j<k;j++){
                  var1 = getSeries(j)*b+var1;
                }
                System.out.print(c+var1+" ");
            }
    }
    public static int getSeries(int base){
        int a=2;

        for(int i=1;i<base;i++){
            a = a*2;
        }
        return a;
    }
}