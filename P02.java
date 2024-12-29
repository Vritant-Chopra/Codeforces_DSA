import java.util.Scanner;

public class P02 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for(int i=1;i<=t;i++){
            int n = scan.nextInt();
            int x = scan.nextInt();
            int[] stations = new int[n];
            for(int j=0;j<n;j++){
                stations[j] = scan.nextInt();
            }
            System.out.println(minFuel(n,x,stations));
            scan.close();
        }
    }
    private static int minFuel(int n, int x, int[] stations){
        int d1 = stations[0] - 0;
        int d2 = x - stations[n-1];
        int d3 = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            d3 = Math.max(d3, stations[i]-stations[i-1]);
        }
        return Math.max(Math.max(d1,2*d2),d3);
    }
}
