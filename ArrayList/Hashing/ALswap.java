import java.util.ArrayList;

public class ALswap {
  public static void swap(ArrayList<Integer> List, int idx1, int idx2){
    int temp = List.get(idx1);
    List.set(idx1, List.get(idx2));
    List.set(idx2, temp);
  }
  public static void main(String[] args) {
     ArrayList<Integer> list = new ArrayList<>();
     list.add(112);
     list.add(322);
     list.add(343);
     list.add(124);
System.out.println(list);
  swap(list, 2,3 );     
  System.out.println(list);
  }
}
