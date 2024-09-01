public class Compression {

  public static String count(String str) {
    StringBuilder newStr = new StringBuilder(); // Use StringBuilder for efficiency
    int i = 0;

    while (i < str.length()) {
      char currentChar = str.charAt(i);
      int count = 1;

      // Correct counting of consecutive characters
      while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
        count++;
        i++;
      }

      newStr.append(currentChar); // Append character to newStr

      // Append count if greater than 1
      if (count > 1) {
        newStr.append(count);
      }

      i++;
    }

    return newStr.toString(); // Return the correctly compressed string
  }

  public static void main(String[] args) {
    String str = "aabbeeeeddkdkkklklll";
    System.out.println(count(str)); // Correctly compressed output
  }
}
