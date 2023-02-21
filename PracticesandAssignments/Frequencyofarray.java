public class Frequencyofarray {
  public static void main(String[] args) {
    int[] arr = {1, 2, 2, 3, 4, 4, 5, 5, 6};
    
    for(int i=0;i<arr.length;i++){
      int x=arr[i];
      int count=1;
      if(x==-1)
        continue;
      for(int j=i+1;j<arr.length;j++){
        if(arr[j]==x){
          count++;
          arr[j]=-1;
        }
        
      }
      System.out.println(x+"occurs"+count+"times");
    }
    
  }
}
