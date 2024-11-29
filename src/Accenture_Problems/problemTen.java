package Accenture_Problems;

import java.util.Scanner;

public class problemTen {
    public static int NumberOfCarries(int num1, int num2){
        int carries=0,mod1,mod2;
        while(num1!=0||num2!=0){
            mod1=num1%10;
            mod2=num2%10;
            if((mod1+mod2)>=10)
                carries++;
            num1/=10;
            num2/=10;
        }
        return carries;
    }

    public static void main(String[] args) {
        int num1,num2;
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        System.out.println(NumberOfCarries(num1,num2));
    }
}
