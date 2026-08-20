
//Problem: Given an array, return true if any value appears more than once.

import java.util.HashMap; 

public class CheckDup{
    public static boolean getDuplicates(int[] arr){
      HashMap<Integer,Integer> nums = new HashMap<>();
      for(int i = 0 ; i < arr.length ; i++){
        if(nums.containsKey(arr[i])){
            return true ; 
        } 
        nums.put(arr[i], i);
      }


 return false;
    }

        public static void main(String[] args ){
            int[] arr = {2,5,7,3,2,9};
           System.out.println(getDuplicates(arr));
        }
    
}