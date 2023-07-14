import java.util.Scanner;
public class SubArrayRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int l = sc.nextInt();
        int r = sc.nextInt();
        findSubArray(arr,n,l,r);
    }

    static void findSubArray(int[] arr,int n,int l,int r) {
        int x = r-l+1;
        int arr1[] = new int[x];
        int j = 0;
        for(int i=l;i<=r;i++) {
            arr1[j] = arr[i];
            j++;
        }
        for(int i=0;i<x;i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}