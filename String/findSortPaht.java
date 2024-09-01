public class findSortPaht {
  public static float sortPath(String str) {
    int X = 0, Y = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'W') {
        X--;
      } else if (str.charAt(i) == 'N') {
        Y++;
      } else if (str.charAt(i) == 'S') {
        Y--;
      } else {
        X++;
      }
    }
    int a = X * X;
    int b = Y * Y;
    return (float) Math.sqrt(a + b);
  }

  public static void main(String[] args) {
    String dir = "WNEENESENNN";
    System.out.println(sortPath(dir));
  }
}
