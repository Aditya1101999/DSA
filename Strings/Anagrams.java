package DSA.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string 1");
        String str1=sc.next();
        System.out.println("enter strng 2");
        String str2=sc.next();
        //no separate checking for upper and lower cases
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length()){
            char[] strr1=str1.toCharArray();
            char[] strr2=str2.toCharArray();
            if(Arrays.equals(strr1,strr2)==true){
                System.out.println(str1+"and"+str2+"are anagrams");
            }
        } else{
            System.out.println("not anagrams");
        }


    }
}
