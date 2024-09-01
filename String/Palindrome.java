public class Palindrome {
  public static boolean palindorm(String str) {

    for (int i = 0; i < str.length() /2; i++) {
     int n = str.length()-1;
     if(str.charAt(i) != str.charAt(n-i)){
      return false;
     }
      
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "racecar";
   System.out.println( palindorm(str));
  }
}
