// package Hashing;

class HashTable {
  private int[] hashTable;
  private int size;

  // Constructor to initialize the hash table
  public HashTable(int size) {
    this.size = size;
    hashTable = new int[size];

    // Initialize hash table with -1 indicating empty slots
    for (int i = 0; i < size; i++) {
      hashTable[i] = -1;
    }
  }

  // Hash function
  private int hashFunction(int key) {
    return (key + 2) % size;
  }

  // Insert method using linear probing
  public void insert(int key) {
    int hashIndex = hashFunction(key);

    // Linear probing in case of collision
    while (hashTable[hashIndex] != -1) {
      hashIndex = (hashIndex + 1) % size;
    }

    hashTable[hashIndex] = key;
  }

  // Method to search for a key
  public int search(int key) {
    int hashIndex = hashFunction(key);

    // Linear probing to find the element
    while (hashTable[hashIndex] != -1) {
      if (hashTable[hashIndex] == key) {
        return hashIndex;
      }
      hashIndex = (hashIndex + 1) % size;
    }

    return -1; // Return -1 if not found
  }

  // Display the hash table
  public void display() {
    for (int i = 0; i < size; i++) {
      System.out.println("Index " + i + ": " + hashTable[i]);
    }
  }

  public static void main(String[] args) {
    // Create a hash table of size 10
    HashTable ht = new HashTable(10);

    // Insert elements
    int[] elements = { 100, 20, 15, 56, 78 };
    for (int element : elements) {
      ht.insert(element);
    }

    // Display the hash table
    System.out.println("Hash Table:");
    ht.display();

    // Search for the location of element 15
    int searchKey = 15;
    int location = ht.search(searchKey);

    if (location != -1) {
      System.out.println("Element " + searchKey + " found at index: " + location);
    } else {
      System.out.println("Element " + searchKey + " not found in the hash table.");
    }
  }
}
