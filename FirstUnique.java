//Problem: Given a string, find the first character that doesn't repeat. If none exists, return -1.

import java.util.HashMap;

public class FirstUnique {
    public static char FirstUniqueChar(String s) {
      HashMap<Character, Integer> countMap = new HashMap<>();

      for(char c : s.toCharArray()){
         countMap.put(c , countMap.getOrDefault(c , 0) +1  );
      }

      for(char c : s.toCharArray()){
        if(countMap.get(c)==1 ){
            return c ; 
        }

      }

      return 'o' ;      
      }

      public static void  main(String[] args ){
        System.out.println(FirstUniqueChar("Umeyma"));
      }

    }

