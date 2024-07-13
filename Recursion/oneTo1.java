public class oneTo1{

  public static void print(int n){
    if(n==1){
    System.out.print(1+" ");
    }else{
      print(n-1);
      System.out.print(n+" ");
    }
    
  }
  public static void printReverse(int n){
    if(n==1){
      System.out.print(n+" ");
      return;
    }
    System.out.print(n+" ");
    printReverse(n-1);
  }
  public static void main(String[] args) {
    
   
   print(10);
   System.out.println();
   printReverse(10);

  }
}