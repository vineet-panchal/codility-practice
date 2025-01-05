public class solution {
  public static void main(String[] args) {
    int[] A = { 3, 1, 2, 4, 3 };
    System.out.println(solution(A));
  }
  public static int solution(int[] A) {
    int sum = 0;
    for (int i = 0; i < A.length; i++) {
      sum += A[i];
    }
    int left = 0;
    int right = sum;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < A.length - 1; i++) {
      left += A[i];
      right -= A[i];
      int diff = Math.abs(left - right);
      if (diff < min) {
        min = diff;
      }
    }
    return min;
  }
}