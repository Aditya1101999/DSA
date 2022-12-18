package DSA.Recursion;

public class OptimizedXToN {
    public static int xToPowerN(int x,int n) {
        if (n == 0) {
            return 1;
        }
        if(n<0){
            n=-n;
            x=1/x;
        }
        /*if(n%2==0){
            return xToPowerN(x,n/2)*xToPowerN(x,n/2);
        }
        else{
            return x*xToPowerN(x,n/2)*xToPowerN(x,n/2);
        }
    } or,*/
        int halfPower = xToPowerN(x, n / 2);
        int halfPowersq = halfPower * halfPower;
        //n is odd
        if (n % 2 != 0) {
            halfPowersq = x * halfPowersq;
        }
        return halfPowersq;
    }

    public static void main(String args[]){
        System.out.println(xToPowerN(2,5));
    }
}

