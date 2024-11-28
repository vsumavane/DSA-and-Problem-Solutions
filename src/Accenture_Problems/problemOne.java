package Accenture_Problems;
import java.util.Arrays;
import java.util.Scanner;

public class problemOne {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
//        System.out.println("Input the number of rats:");
        int r = scan.nextInt();
//        System.out.println("Input the length of the array:");
        int unit = scan.nextInt();
//        System.out.println("Input the length of the array:");
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        System.out.println(Calculate(r,unit,n,a));
    }

    public static int Calculate(int r, int unit, int n, int[] a){
        if(a == null) return -1;
        int req = r*unit;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            if (sum>req) return i+1;
        }
        return 0;
    }
}
