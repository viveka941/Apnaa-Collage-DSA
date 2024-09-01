public class subString {
  // lexicographic = a < b
  public static void LargeSrtArr(String arr[]){
    String larg = arr[0];
    for(int i=0; i<arr.length; i++){
      if(larg.compareTo(arr[i])<0){
        larg = arr[i];
      }
    }
    System.out.println(larg);
  }
  public static void main(String[] args) {
    String str = "Hello Word";
    System.out.println(str.substring(3,7));

    String arr[]={"apple","mango","banana"};
    LargeSrtArr(arr);
    


    

  }
}
