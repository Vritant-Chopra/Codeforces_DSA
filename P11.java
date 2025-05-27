import java.util.Scanner;

public class P11 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(getNum(n,arr));
        scan.close();
    }
    private static int getNum(int n, int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(min,Math.abs(arr[i]));
        }
        return min;
    }
}
