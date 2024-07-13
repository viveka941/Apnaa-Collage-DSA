public class nNaturalNo {
  public static int SumNaturalNo(int n){
    if(n==1){
      return 1;
    }
    return SumNaturalNo(n-1)+n;
  }
  public static void main(String[] args) {
    System.out.println(SumNaturalNo(4));
  }
}
