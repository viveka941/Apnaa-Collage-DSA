import java.util.*;
class pairSumPivet{
  public static boolean pairSum(ArrayList<Integer> list, int target){
    int breakPoint=-1;
    int n =list.size();
    for(int i=0; i<list.size();i++){
      if(list.get(i)>list.get(i+1)){
        breakPoint = i;
        break;
      }
    }
    int lp =breakPoint+1;
    int rp = breakPoint;
    while (lp != rp) {
      if(list.get(lp)+list.get(rp)== target){
        return true;
      }else if(list.get(lp)+list.get(rp)<target){
        lp = (lp+1)%n;
      }else{
        rp=(n+rp-1)%n;
      }
    }
    return false;
  }
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(9);
    list.add(10);
    list.add(6);
    list.add(7);
    list.add(8);
    int target = 16;
    System.out.println(pairSum(list, target));
  }
}