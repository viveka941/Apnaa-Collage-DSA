public class SelectionSort {
  public static void SelectionSort(int arr[]){
    for(int i=0; i<arr.length-1; i++){
      int minPos=i;
      for(int j=i+1; j<arr.length; j++){
        if(arr[minPos]>arr[j]){
         minPos = j;
        }
      }
      int temp = arr[minPos];
      arr[minPos]=arr[i];
      arr[i]=temp;
    }
  }
  public static void main(String[] args) {
    int arr[]={2,34,6,2,63,43,23};
SelectionSort(arr);
for(int i: arr){
  System.out.print(i+" ");
}

  }
}
