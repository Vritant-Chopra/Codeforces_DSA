import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class P08{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0;i<t;i++){
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = scan.nextInt();
            }
            System.out.println(isPossible(n,k,arr));
        }
    }
    public static String isPossible(int n, int k, int[] arr){
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=1;i<=n;i++){
            int l = 0;
            int r = l+i-1;
            List<Integer> ksInSubsegment = new ArrayList<>();
            while(r<n){
                ksInSubsegment.add(occurence(arr,l,r,k));
                l++;
                r++;
            }
            map.put(i,ksInSubsegment);
        }
        int count = 0;
        for(int key : map.keySet()){
            for(int freq : map.get(key)){
                if(freq > key/2)
                count++;
            }
            if(count>0)
            return "YES";
        }
        return "NO";
    } 
    public static int occurence(int[] arr, int start, int end, int k){
        int freq = 0;
        for(int i=start;i<=end;i++){
            if(arr[i] == k)
            freq++;
        }
        return freq;
    }
}