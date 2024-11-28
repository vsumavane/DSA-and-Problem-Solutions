package Fundamentals;

import java.util.Arrays;

@SuppressWarnings({"ForLoopReplaceableByForEach", "ManualArrayCopy"})
public class FuncOnArrays {
    public static double MaxOfArray(double[] a){
        int N = a.length;
        double max = 0;
        for(int i=0;i<N;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }

    public static double AvgOfArrays(double[] a){
        int N = a.length;
        double Sum = 0;
        for(int i=0;i<N;i++){
            Sum += a[i];
        }
        return Sum/N;
    }

    public static double[] CopyArray(double[] a){
        int N = a.length;
        double[] b= new double[N];
        for(int i=0;i<N;i++){
            b[i]=a[i];
        }
        return b;
    }

    public static double[] RevArray(double[] a){
        int n =  a.length;
        double temp;
        for (int i=0;i<n/2;i++){
            temp = a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=temp;
        }
        return a;
    }


    public static void main(String[] args){
//        statements for future code
        double[] a = {1, 2, 3, 4,5,6,7,8,9,10};
        System.out.println("Maximum out of given array = " + MaxOfArray(a));
        System.out.println("Average of the given array = "+ AvgOfArrays(a));
        double[] b = CopyArray(a);
        System.out.println("Output of array B =" + Arrays.toString(b));
        System.out.print("Reverse of given array = "+ Arrays.toString(RevArray(a)));
    }
}
