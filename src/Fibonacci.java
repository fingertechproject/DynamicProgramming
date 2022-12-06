public class Fibonacci {
    // 0 1 1 2 3 5 8 13 21 ...
    public static void main(String[] args) {
        int n = 6;
        int[] arrDp = {-1, -1, -1, -1, -1, -1, -1,};//size of dpArray should be n+1
        System.out.println( Fibo.fibo(n,arrDp));
    }
}
class Fibo{
    public static int fibo(int n,int[] dpArr){
        if (n<=1) return n;
        if (dpArr[n]!=-1) return dpArr[n];
        return dpArr[n] = fibo(n-1,dpArr)+fibo(n-2,dpArr);
    }
}
