public class StringFnCompare {
  public static void main(String[] args) {
    String str = "vivek";
    String st="vivek";
    String str2 = new String("vivek");

    if(str==st){
      System.out.println("True");
    }else{
      System.out.println("false");
    }
    if(str==str2){
      System.out.println("True");
    } else {
      System.out.println("false");
    }

    if(str.equals(str2)){
      System.out.println("True");
    } else {
      System.out.println("false");
    }
  }
}
