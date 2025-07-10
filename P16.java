import java.util.Scanner;

public class P16{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        for(int j=0;j<t;j++){
            int n = scan.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = scan.nextInt();
            }
            System.out.println(closestDistance(n,arr));
        }
        scan.close();
    }
    private static int closestDistance(int n, int[] arr){
        double min = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int dist = arr[i+1] - arr[i];
            if(min > dist)
            min = dist;
        }
        
        if(min < 0)
        return 0;
        
        return (int)Math.floor(min/2+1);
    }
}