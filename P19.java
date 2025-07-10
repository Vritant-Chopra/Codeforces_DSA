import java.util.Scanner;

public class P19{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for(int i=0;i<t;i++){
            int n = scan.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = scan.nextInt();
            }
            System.out.println(getMinOperations(arr));
        }
        scan.close();
    }
    private static int getMinOperations(int[] arr){
        int p = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0)
            p++;
        }
        int n = arr.length-p;
        
        int count = 0; 
        while(n>p || n%2==1){
            if(n%2 == 1){
                n = n - 1;
                p = p + 1;
                count++;
            }else if(n>p){
                p = p + 2;
                n = n - 2;
                count++;
                count++;
            }
            
        }
        return count;
    }
}