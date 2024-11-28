package Accenture_Problems;

import java.util.Scanner;

public class problemTwo {
    public static char[] operation(String a){
        int n= a.length();
        char[] arr = a.toCharArray();
        int out = arr[0];
        for (int i = 0; i < n-1; i+=2) {
            if(arr[i+1]== 'A')
                out&=arr[i+2];
            else if(arr[i+1]== 'B')
                out|=arr[i+2];
            else if(arr[i+1]== 'C')
                out^=arr[i+2];
        }
        return Character.toChars(out);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        System.out.println(operation(a));
    }
}
