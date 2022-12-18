package DSA.DynProg;

public class CoinChnage {
    public static int tab(int[] coins,int sum){
        int n= coins.length;
        int[][] dp=new int[n+1][sum+1];
        //i=ith coin
        //j=sum/change
        for(int i=0;i<n+1;i++) {//initialization
            dp[i][0]=1;//null set
        }
        for(int j=0;j<sum+1;j++){
            dp[0][j]=0;//if no coins
        }
        for(int i=1;i<n+1;i++) {//initialization
            for (int j = 1; j < sum + 1; j++) {
                int v = coins[i - 1];//value of ith item
                if(v<=j) {//valid case
                    dp[i][j]=dp[i][j-v]+dp[i-1][j];
                }
                else{//invalid case
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args){
        int[] coins={2,5,3,6};
        int sum=10;
        System.out.println(tab(coins,sum));
    }
}
