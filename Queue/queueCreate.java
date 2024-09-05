class quueCreate {
  static class Queue {
    static int arr[];
    static int size;
    static int rear;

    Queue(int n) {
      arr = new int[n];
      size = n;
      rear = -1;
    }
    public static boolean isEmpty(){
      return rear==-1;
    }
    
  }

  public static void main(String[] args) {

  }
}