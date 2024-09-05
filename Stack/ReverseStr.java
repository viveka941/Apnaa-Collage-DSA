import java.util.*;
public class ReverseStr {
  
  
  public static void main(String[] args) {
    Stack<String> s = new Stack<>();
    s.push("a");
    s.push("b");
    s.push("c");
    while (!s.isEmpty()) {
      System.out.println(s.peek());
      s.pop();
    }
  }
}
