public class oneTo1{

  public static void print(int n){
    if(n==1){
    System.out.print(1+" ");
    }else{
      print(n-1);
      System.out.print(n+" ");
    }
    
  }
  public static void main(String[] args) {
    
   
   print(10);
  }
}