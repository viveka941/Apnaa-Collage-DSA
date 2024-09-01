public class InsertionSort {
  public static void InsertionSort(int arr[]){
    for(int i=1; i<arr.length ; i++){
      int curr=arr[i];
      int prev=i-1;
      // finding out the correct position to insert
      while (prev>=0 && arr[prev]>curr) {
        arr[prev+1]=arr[prev];
        prev--;
      }
      arr[prev+1]=curr;
    }
  }
  public static void main(String[] args) {
    int arr[]={23,4,2,1,6,3,6};
    InsertionSort(arr);
    for(int i: arr){
      System.out.print(i+" ");
    }
  }
}
