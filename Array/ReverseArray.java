public class ReverseArray {
  public static void Reverse(int arr[]){
    for(int i=arr.length-1; i>0; i--){
      System.out.println(arr[i]+" ");
    }
  }

  public static void ReverseSwap(int arr[]){
    int start=0;
    int end=arr.length-1;
    while (start < end) {
      int temp=arr[start];
      arr[start] = arr[end];
      arr[end]=temp;
      start++;
      end--;
    }
  }
  public static void main(String[] args) {
    int arr[]={2,4,6,8,10};
    Reverse(arr);
    ReverseSwap(arr);
    for(int i : arr){
      System.out.print(i+" ");
    }
  }
}
