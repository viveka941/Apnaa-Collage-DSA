public class PrintAll {
  public static void toUppar(String str){
    for(int i=0; i<str.length(); i++){
      char le=str.charAt(i);
      char up = Character.toUpperCase(le);
      System.out.print(up);
    }
  }
  public static void main(String[] args) {
    String name="Vivek Kumar";
    toUppar(name);


  }
}
