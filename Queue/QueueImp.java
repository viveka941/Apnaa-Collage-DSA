import java.util.*;

public class QueueImp {
  public static void main(String[] args) {
    // Queue<Integer> s = new LinkedList<>();
    Queue<Integer> s = new ArrayDeque<>();
    s.add(1);
    s.add(2);
    s.add(3);
    while (!s.isEmpty()) {
      System.out.println(s.peek());
      s.remove();
    }

  }
}
