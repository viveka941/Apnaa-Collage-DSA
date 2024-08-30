class PassingArg{
  public static void update(int marks[], int nonChage){
     nonChage=10;
    for(int i=0; i<marks.length; i++){
      marks[i]=marks[i]+1;
    }
  }
  public static void main(String[] args) {
    int nonChage=5;
    int marks[]={98,99,95};
  
    update(marks,nonChage);
    for (int i : marks) {
      System.out.print(i+" ");
    }
    System.out.println(nonChage);
  }
}