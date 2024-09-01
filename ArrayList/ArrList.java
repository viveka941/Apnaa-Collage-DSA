import java.util.ArrayList;

class ArrList{
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(2,200);//0(n)
    System.out.println(list); //0(1)
    System.out.println(list.get(4));  //0(1)
    System.out.println(list.remove(5));
    System.out.println(list);
    list.set(4, 10);
    System.out.println(list);
    System.out.println(list.contains(10));
  }
}