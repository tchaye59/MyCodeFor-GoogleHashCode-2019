import java.util.Arrays;
import java.util.Scanner;

class Training {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int n = 0;
        int p = 0;
        int[] tab = null;

        for (int i = 1; i <= t; i++) {
            n = sc.nextInt();
            p = sc.nextInt();
            tab = new int[n];

            for (int j = 0; j < tab.length; j++) {
                tab[j] = sc.nextInt();
            }

            System.out.println("Case #" + i + ": " + solve(p, tab));
        }

    }

    private static int solve(int p, int[] tab) {
        Arrays.sort(tab);
        
        int sum =0;
        for(int i = 0; i < (p-1) ; i++){
            sum+=tab[i];
        }
        int minHour = Integer.MAX_VALUE;

        for (int i = p-1; i < tab.length; i++) {
           sum+= tab[i];
           minHour = Math.min(minHour, (tab[i]*p) - sum);
           sum-= tab[i-p+1];
        }

        return minHour;
    }
    
}