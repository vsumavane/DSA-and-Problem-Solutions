package Accenture_Problems;

import java.util.Scanner;

public class problemEleven {
    public static void ReplaceCharacter(char[] str, int n, char ch1, char ch2){
        for(int i=0;i<n;i++){
            if(str[i]==ch1){
                str[i]=ch2;
            }
            else if(str[i]==ch2){
                str[i]=ch1;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(str[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n=str.length();
        char[] string = str.toCharArray();
        char ch1 = scan.next().charAt(0);
        char ch2 = scan.next().charAt(0);
        ReplaceCharacter(string,n,ch1,ch2);
    }
}
