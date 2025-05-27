import java.util.Scanner;

public class P27 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for(int i=1;i<=t;i++){
            int n = scan.nextInt();
            int arr[] = new int[n];
            for(int j=1;j<=n;j++){
                arr[j-1] = scan.nextInt(); 
            }
            System.out.println(getK(n, arr));
        }

        scan.close();
    }
    private static int getK(int n, int[] arr){
        double product = 1;
        for(int i=0;i<n;i++){
            product = product * arr[i];
        }
        double target = Math.sqrt(product);
        product = 1;
        int k = -1;
        for(int i=1;i<=n;i++){
            product = product * arr[i-1];
            if(product == target){
                k = i;
                break;
            }
            if(product > target)
            break;
        }
        return k;
    }
}
