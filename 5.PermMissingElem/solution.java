import java.util.*;
import java.util.Arrays;

public class solution {
  public static void main(String[] args) {
    // Implement your solution here
    Arrays.sort(A);
    for (int i = 0; i < A.length; i++) {
      if (i + 1 != A[i]) {
        return i + 1;
      }
    }
    return 0;
  }
}