public class LinearSeach {
  public static int LinearSeach(int arr[],int target){
    for(int i=0; i<arr.length; i++){
      if(target==arr[i]){
        return i;
      }
    }
    return -1;
  }
  public static int maxNo(int arr[]){
    int max =Integer.MIN_VALUE; //below zero values 
    int min = Integer.MAX_VALUE;// above is zero values
    for(int i=0; i<arr.length; i++){
      if(arr[i]>max){
        max=arr[i];
      }if(arr[i]<min){
        min=arr[i];
      }
    }
    System.out.println("Min values "+min);
    return max;
  }
  public static void main(String[] args) {
    int arr[]={-5,2,3,15,8,10,12,14,17};
    int target=14;

    int index=LinearSeach(arr,target);
    if(index== -1){
      System.out.println("not found");
    }else{
      System.out.println("index "+ index);
    }

    int max =maxNo(arr);
    System.out.println("Max values "+max);
  }
}
