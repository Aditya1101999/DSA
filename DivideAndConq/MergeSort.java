package DSA.DivideAndConq;
import java.util.*;
public class MergeSort {
    public static void mergeSort(int arr[],int si,int ei){
        //base case
        if(si>=ei){//single element
            return;
        }
        int mid=si+(ei-si)/2;//to avoid overflow
        mergeSort(arr, si, mid);//left
        mergeSort(arr, mid+1, ei);//right
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        //iterators
        int i=si;//for left part
        int j=mid+1;//for right part
        int k=0;//for mp array

        while(i<=mid && j<=ei){
            //left array
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            //right array
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //for leftover elements in left part
        while(i<=mid){
            temp[k++]=arr[i++];//combined i++ and k++
        }
        //for leftover elements in right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temp array to original array
        for(k=0,i=si;k< temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr,0, arr.length-1);
        printarr(arr);
    }
}
