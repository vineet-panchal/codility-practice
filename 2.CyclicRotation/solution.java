public class solution {
  public static void main(String[] args) {
    // Implement your solution here
    int[] result = new int[A.length];
    if (K == A.length) {
        return A;
    } else {
        for (int i = 0; i < A.length - K; i++) {
            if (K > A.length) {
                int rem = K % A.length;
                result[i + rem] = A[i];
            } else {
                result[i + K] = A[i];
            }            
        }
        int i = 0;
        for (int j = A.length - K; j < A.length; j++) {
            result[i] = A[j];
            i++;
        }
    }
    return result;
  }
}