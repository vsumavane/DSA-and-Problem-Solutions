package Accenture_Problems;

import java.util.Scanner;

public class problemThree {
    public static int CheckPassword(char[] str, int n) {
        int numCount = 0;
        int capCount = 0;
        if((n<4)||Character.isDigit(str[0]))
            return 0;
        for(int i=0;i<n;i++){
            if(str[i]==' '||str[i]=='/')
                return 0;
            if(Character.isDigit(str[i]))
                numCount++;
            if(str[i]>=65&&str[i]<=90)
                capCount++;
        }
        if(numCount>0&&capCount>0)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pass = scan.next();
        int n = pass.length();
        char[] str = pass.toCharArray();
        System.out.println(CheckPassword(str, n));
    }
}
