import java.util.*;

public interface solution {
  public static void main(String[] args) {
    // Implement your solution here
    if (X == Y) {
      return 0;
    } 
    int firstPos = X + D;
    int diff = Y - firstPos;
    return 1 + (int) Math.ceil((double) diff / D);
  }
}
