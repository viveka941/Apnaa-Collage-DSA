public class LinkedList {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static int size;

  public void addFirst(int data) { // O(1)
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public void addLast(int data) { // O(1)
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
  }

  public void display() { // O(n)
    if (size == 0) {
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

  public static void addIndex(int idx, int data) {
    if (idx < 0 || idx > size) {
      System.out.println("Invalid index");
      return;
    }

    if (idx == 0) {
      new LinkedList().addFirst(data);
      return;
    }

    if (idx == size) {
      new LinkedList().addLast(data);
      return;
    }

    Node newNode = new Node(data);
    size++;
    Node temp = head;
    for (int i = 0; i < idx - 1; i++) {
      temp = temp.next;
    }
    newNode.next = temp.next;
    temp.next = newNode;
  }

  public static int removeFirst() {
    if (size == 0) {
      System.out.println("LinkedList is empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }
    int val = head.data;
    head = head.next;
    size--; // Decrement size after removing the first node
    return val;
  }

  public static int removeLast() {
    if (size == 0) {
      System.out.println("LL is empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }

    Node prev = head;
    for (int i = 0; i < size - 2; i++) {
      prev = prev.next;
    }
    int val = prev.next.data; // tail data
    prev.next = null;
    tail = prev;
    size--;
    return val;
  }

  public static int itrSearch(int key) {//0(n)
    Node temp = head;
    int i = 0;
    while (temp != null) {
      if (key == temp.data) {
        return i;
      }
      temp = temp.next;
      i++;
    }
    return -1;
  }

  public void reverse(){
    Node prev = null;
    Node curr = tail= head;
    Node next;
    while(curr!=null){
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
    head=prev;
  }

  public static void deleteNthFromEnd(int n){
    int sz=0;
    Node temp = head;
    while (temp != null) {
      temp=temp.next;
      sz++;
    }
    if(n==sz){
      head=head.next;// first
      return;
    }
    int i =1;
    int iToFind =sz-n;
    Node prev = head;
    while (i<iToFind) {
      prev=prev.next;
      i++;
    }
    prev.next = prev.next.next;
    return;
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

    // add new node at index
    addIndex(3, 56);
    ll.display();
    System.out.println(ll.size); // O(1)

    // Remove First
    ll.removeFirst();
    ll.display();
    System.out.println();
    ll.removeLast();
    ll.display();

    System.out.println(itrSearch(56));
    ll.reverse();
    ll.display();
    ll.deleteNthFromEnd(3);
    ll.display();
  }
}
