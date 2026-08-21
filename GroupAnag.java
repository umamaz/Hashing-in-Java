//Problem: Given a list of words, group the ones that are anagrams of each other.
//Example: ["eat", "tea", "tan", "ate", "nat", "bat"] → [["eat","tea","ate"], ["tan","nat"], ["bat"]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnag {
  public static List<List<String>> getAnag(String[] arr){

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : arr) {

            // Convert word to character array
            char[] chars = word.toCharArray();

            // Sort the characters
            Arrays.sort(chars);

            // Use sorted word as the key
            String key = new String(chars);

            // If key doesn't exist, create a new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add word to its anagram group
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());

  }
}
