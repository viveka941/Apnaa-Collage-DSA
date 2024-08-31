public class maxPrifexSubArray {
  public static int maxPrifix(int arr[]) {
    int maxSoFor = arr[0];
    int maxEndingHere = arr[0];
    for (int i = 0; i < arr.length; i++) {
      maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
      maxSoFor = Math.max(maxSoFor, maxEndingHere);
    }
    return maxSoFor;
  }

  public static void main(String[] args) {
    int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    System.out.println(maxPrifix(arr));
  }
}
