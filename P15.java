import java.util.Scanner;
public class P15{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        for(int j=0;j<t;j++){
            int n = scan.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = scan.nextInt();
            }
            System.out.println(isPossible(n,arr));
        }
        scan.close();
    }
    private static String isPossible(int n, int[] arr){
        int odd = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2 == 1)
            odd++;
        }
        
        if(odd%2 == 1)
        return "NO";
        return "YES";
    }
}