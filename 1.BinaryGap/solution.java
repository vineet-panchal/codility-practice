import java.util.*;

public class solution {
  public static void main(String[] args) {
    // Implement your solution here

    int[] binaryN = new int[1000]; // array to store the binary number
    int i = 0;
    while (N > 0) {
      binaryN[i] = N % 2;
      N = N / 2;
      i++;
    }
    // System.out.println(binaryN);
    int count = 0;
    int currentCount = 0;
    int maxCount = 0;
    for (int j = i - 1; j >= 0; j--) {
      // System.out.println(binaryN[j]);
      if (binaryN[j] == 1) {
        currentCount = count;
        count = 0;
      } else {
        count++; 
      }

      if (currentCount > maxCount) {
        maxCount = currentCount;
      }
    }
    // System.out.println("Hello World");
    return maxCount;
  }
}