/*To Remove Dublicate Elements in an Array:*/
public class RemoveDuplicates_atRunTime {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("");
    int arr[]=new int[n];
    System.out.println("Enter elements into the array: ");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int[] arr = {1, 2, 2, 3, 4, 4, 5, 5, 6};
    int n = arr.length;
    int j = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] != arr[j]) {
        arr[++j] = arr[i];
      }
    }
    for (int i = 0; i <= j; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}