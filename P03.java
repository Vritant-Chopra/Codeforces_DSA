import java.util.Scanner;

public class P03 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for(int i=1;i<=t;i++){
            int n = scan.nextInt();
            scan.nextLine();
            String s = scan.nextLine();
            System.out.println(minOperations(n,s));
        }
        scan.close();
    }
    private static int minOperations(int n, String s){
        String w = "";
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '#')
            w = w + '1';//49
            else
            w = w + '0';//48
        }
        int sum = 0;
        int l=0;
        int r=2;
        while(r<w.length()){
            sum = ((int)w.charAt(l)-48)+((int)w.charAt(l+1)-48)+((int)w.charAt(r)-48);
            if(sum == 0)
            return 2;
            l++;
            r++;
        }
        return numEmpty(s);
    }
    private static int numEmpty(String s){
        int numEmpty = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '.')
            numEmpty++;
        }
        return numEmpty;
    }
}
