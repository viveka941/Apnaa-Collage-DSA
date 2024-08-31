public class SybArray {
  public static void SubArray(int arr[]){
    int tp=0;
    for(int i=0; i<arr.length ; i++){
      
      for(int j=i; j<arr.length; j++){
       
        for(int k=i; k<=j; k++){
          System.out.print(arr[k]+" ");
        
        }
        tp++;
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("total subArrays "+tp);
  }
  public static void main(String[] args) {
    int arr[]={2,4,6,8,10};
    SubArray(arr);
  }
}
