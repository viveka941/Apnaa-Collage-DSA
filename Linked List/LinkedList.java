public class LinkedList {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = next;
    }
  }

  public static Node head;
  public static Node tail;

  public  void addFirst(int data) { // 0(1)
    // create new Node
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }

    // new node next = head;
    newNode.next = head;
    // head = new Node;
    head = newNode;
  }

  public  void addLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
  }

  public  void display() { //0(n)
    if (head == null) {
      System.out.println("Linked List is empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " => ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static void addIndex(int idx, int data){
    Node newNode = new Node(data);
    Node temp=head;
    int i=0;
    while (i<idx-1 ) {
      temp = temp.next;
      i++;
    }
    //i = idex-1; temp ->prev
    newNode.next= temp.next;
    temp.next= newNode;
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.display();
    ll.addFirst(2);
    
    ll.addFirst(1);
    ll.addLast(3);
    ll.addLast(4);

    ll.display();
    System.out.println();
    ll.addLast(45);
    ll.display();

    // add new node n index

    addIndex(3, 56);
    ll.display();


  }
}
