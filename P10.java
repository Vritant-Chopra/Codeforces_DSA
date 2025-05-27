import java.util.Scanner;

public class P10 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();

        for(int i=0;i<t;i++){
            String grid[] = new String[10];
            for(int j=0;j<10;j++){
                String s = scan.nextLine();
                grid[j] = s;
            }
            System.out.println(getScore(grid));
        }
        scan.close();
    }
    private static int getScore(String grid[]){
        int score = 0;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(grid[i].charAt(j) == 'X'){
                    if(i==0 || j==0 || i==9 || j==9)
                    score = score + 1;
                    else if(i==1 || j==1 || i==8 || j==8)
                    score = score + 2;
                    else if(i==2 || j==2 || i==7 || j==7)
                    score = score + 3;
                    else if(i==3 || j==3 || i==6 || j==6)
                    score = score + 4;
                    else 
                    score = score + 5;
                }
            }
        }
        return score;
    }
}
