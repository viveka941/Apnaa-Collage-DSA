import java.util.ArrayList;

public class AlMixNo {
  public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
     list.add(112);
     list.add(322);
     list.add(343);
     list.add(124);
     int max = Integer.MIN_VALUE;
     for(int i: list){
      if(max<i){
        max = i;
      }
     }
     System.out.println("Max no " + max);


     // or 
     int max2 = Integer.MIN_VALUE;
     for(int i=0; i<list.size(); i++){
      max2 = Math.max(max2, list.get(i));
     }
     System.out.println(max2);
  }
}
