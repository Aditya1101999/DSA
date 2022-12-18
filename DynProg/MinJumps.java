package DSA.DynProg;
import java.util.*;
public class MinJumps {
    public static int tab(int[] arr){
        int n= arr.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        //initialization
        dp[n-1]=0;//0 jumps
        for(int i=n-2;i>=0;i--){
            int steps=arr[i];
            int ans=Integer.MAX_VALUE;
            for(int j=i+1;j<=i+steps&&j<n;j++){//distance that can be covered
                if(dp[j]!=-1){
                    ans=Math.min(ans,dp[j]+1);
                }
            }
            if(ans!=Integer.MAX_VALUE){
                dp[i]=ans;
            }
        }
        return dp[0];
    }
    public static void main(String[] args){
        int[] nums={2,3,1,1,4};
        System.out.println(tab(nums));
    }
}
