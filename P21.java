import java.util.Scanner;
public class P21{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        for(int j=0;j<t;j++){
            int n = scan.nextInt();
            int[] arr = new int[n];
            
            for(int i=0;i<n;i++){
                arr[i] = scan.nextInt();
            }
            System.out.println(longestBlank(n, arr));
        }
        scan.close();
    }
    private static int longestBlank(int n, int[] arr){
        int maxBlank = 0;
        int start = 0;
        int end = 0;
        while(end<n){
            if(arr[end] == 0){
                if(maxBlank < (end-start+1)){
                    maxBlank = end-start+1;
                }
                end++;
            }else{
                end++;
                start = end;
            }
        }
        return maxBlank;
    }
}