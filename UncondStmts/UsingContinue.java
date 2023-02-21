class UsingContinue{
  public static void main(String args[]){
    int i;
    for(i=1;i<=10;i++){
      if(i==7||i==8){
        continue;
      }
      System.out.println(i);
    }
  }
}