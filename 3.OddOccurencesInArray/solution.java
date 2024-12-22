import java.util.*;
import java.util.HashMap;

public class solution {
  public static void main(String[] args) {
    // Implement your solution here
    HashMap<Integer, Integer> valueOccurences = new HashMap<Integer, Integer>();
    // create a hash map that keeps track of the occurences of each value
    // key: value, value: occurences
    for (int i : A) { // creating the hash table
    // System.out.println(i);
      if (valueOccurences.containsKey(i)) { // if hash map already contains key
        valueOccurences.put(i, valueOccurences.get(i) + 1);
        // increment the occurences count of that value
      } else {
        valueOccurences.put(i, 1); // create a new value with 1 occurence
      }
    }
    
    for (int i : valueOccurences.keySet()) {
      if (valueOccurences.get(i) % 2 == 1) {
        return i;
      }
    }
    // return 0;
    throw new IllegalArgumentException(
      "No odd occurences found in the array"
    );
  }
}