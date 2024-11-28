package Fundamentals;

public class EuclidAlgorithm {
    public static void main(String []args){
        System.out.print(gcd(45,30));
    }
    public static int gcd(int p, int q){
        if (q==0)
            return p;
        int r = p % q;
        return gcd(q,r);
    }
}
