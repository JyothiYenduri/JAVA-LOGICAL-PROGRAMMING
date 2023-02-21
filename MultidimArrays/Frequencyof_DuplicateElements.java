/*Frequency of Dublicate Elements in an Array:*/
public class Frequencyof_DuplicateElements {
  public static void main(String[] args) {
    int[] arr = {1, 2, 2, 3, 4, 4, 5, 5, 6};
    int n = arr.length;
    int j = 0;
    int count=0;
    int temp[]=new int[arr[]];
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i] + " ");
      temp[]=arr[i];
      if (arr[i] != arr[j]) {
        arr[++j] = arr[i];
      }
    }
    for (int i = 0; i <= j; i++) {
      System.out.print(arr[i] + " ");
      while(temp[]==arr[i]){
        count++;
      }
       System.out.print(+count); 
    }
  }
}