package DSA.DivideAndConq;

public class MaxOccEle {
    public static int inRange(int[] nums,int num,int si,int ei){
        int count=0;
        for(int i=0;i<=ei;i++){
            if(nums[i]==num){
                count++;
            }
        }
        return count;
    }
    public static int majElementFinder(int[] nums,int si,int ei){
        //base case
        if(si==ei){//1 element
            return nums[si];
        }
        int mid=si+(ei-si)/2;
        int left=majElementFinder(nums,si,mid);
        int right=majElementFinder(nums,mid+1,ei);
        //if two halves agree on a majority element
        if(left==right){
            return left;
        }
        //else,count each element
        int leftCount=inRange(nums,left,si,si);
        int rightCount=inRange(nums,right,si,ei);
        /*if(leftCount>rightCount){
            return left;
        }
        else{
            return right;
        }*/
        return leftCount>rightCount?left:right;
    }
    public static void main(String args[]){
        int nums[]={2,2,1,1,1,2,2};
        System.out.println(majElementFinder(nums,0, nums.length-1));
    }
}
