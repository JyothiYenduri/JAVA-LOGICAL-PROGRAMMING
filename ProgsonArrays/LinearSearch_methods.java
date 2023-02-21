/* LinearSearch */

import java.util.Scanner;
class LinearSearch_methods{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of Elements you want ? ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter your Elements in array ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter your target value ");
        int target = sc.nextInt();
        int position=-1;
        for(int i=0;i<a.length;i++){
        if (target == a[i]){
            position = i ;
           break;
        }
        }
        if (position != -1 ){
            System.out.println(target + " found at Index of " +position);
        }
        else{
            System.out.println("target is not found in array");
        }
    }
}