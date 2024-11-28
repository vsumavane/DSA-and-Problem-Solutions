package Accenture_Problems;

import java.util.Scanner;

public class problemFive {
    public static int def_differenceOfSum(int n, int m){
        int sumofdiv = 0;
        int sumofnondiv=0;
        for (int i = 1; i <= m; i++) {
            if(i%n!=0) {
                sumofnondiv+=i;
            }
            else
                sumofdiv+=i;
        }
        return sumofnondiv-sumofdiv;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        System.out.println(def_differenceOfSum(n,m));
    }
}
