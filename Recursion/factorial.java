public class factorial {
  int fact(int n){
    if(n==0){
      return 1;
    }
    return n*fact(n-1);
  }
  public static void main(String[] args) {
    factorial f = new factorial();
  
    System.out.println(f.fact(5));
    // time complexcity -> 0(n)
    // space => 0(n)
  }
}
