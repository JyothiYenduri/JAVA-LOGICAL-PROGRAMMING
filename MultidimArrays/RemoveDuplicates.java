/*To Remove Dublicate Elements in an Array:*/
public class RemoveDuplicates {
  public static void main(String[] args) {
    int[] arr = {1, 2, 2, 3, 4, 4, 5, 5, 6};//9
    int n = arr.length;//9
    int j = 0;//
    for (int i = 0; i < n; i++) {//0<9-->1<9-->2<9-->3<9-->4<9-->5<9-->6<9
    //  -->7<9-->8<9
                //                  9<9
      if (arr[i] != arr[j]) {//a[0]!=a[0]-->1!=1-->a[1]!=a[0]==>2!=1-->2!=2-->3!=2
                              //4!=2-->4!=4--<4!=4-->5!=4-->6!=5
        arr[++j] = arr[i];//a[1]=2-->a[2]=3-->a[3]=4-->a[4]=5-->a[5]=6
      }
    }
    for (int i = 0; i <= j; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}

//arr={1,2,3,4,5,6}