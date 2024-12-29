import java.util.Scanner;

public class P09 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0;i<t;i++){
            int n = scan.nextInt();
            int[] arr = new int[n-1];
            for(int j=0;j<arr.length;j++){
                arr[j] = scan.nextInt();
            }
            System.out.println(efficiency(arr));
        }
        scan.close();
    }
    private static int efficiency(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return (-1) * sum;
    }
}
