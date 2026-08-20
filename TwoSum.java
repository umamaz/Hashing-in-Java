
//Problem: Given an array of numbers and a target sum, find two numbers that add up to the target, and return their indices.
//[2, 7, 11, 15], target 9 → [0, 1] (because 2 + 7 = 9)

import java.util.HashMap ; 
import java.util.Arrays;

public class TwoSum {
    public static int[] getSum(int[] arr, int target){
        HashMap<Integer, Integer> seen = new HashMap<>();
  
       for(int i = 0 ; i <arr.length ; i++){
        int complement = target - arr[i];

        if(seen.containsKey(complement)){
            return new int[] { seen.get(complement) , i };
        }
          seen.put(arr[i], i);
       }
       return new int[] {} ;
    }
public static void main(String[] args ){
    int[] result = getSum(new int[]{2,7,11,15}, 9 );
    System.out.println(Arrays.toString(result));
}

    
}