package DSA.DynProg;

public class RodCutting {
    public static int tab(int[] len,int[] price,int length){
        int n=len.length;
        int[][] dp=new int[n+1][length+1];
        for(int i=0;i< n+1;i++) {//initialization
            for(int j=0;j<length+1;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
            }
        }
        for(int i=1;i<n+1;i++) {//initialization
            for (int j = 1; j < length+ 1; j++) {
                int l=len[i-1];//length of ith item
                int p=price[i-1];//price of ith item
                if(l<=j){//valid case
                    int inc=p+dp[i][j-l];
                    int exc=dp[i-1][j];
                    dp[i][j]=Math.max(inc,exc);
                }
                else{//invalid case-exclude
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][length];
    }
    public static void main(String[] args){
        int[] length={1,2,3,4,5,6,7,8};
        int[] price={1,5,8,9,10,17,17,20};
        int W=8;
        System.out.println(tab(length,price,W));
    }
}

