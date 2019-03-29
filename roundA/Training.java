import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

        int[] tabTmp = new int[tab.length - p + 1];


        for (int i = p-1; i < tab.length; i++) {

            for(int j = i-(p-1); j < i ; j++){
                tabTmp[i-(p-1)]+=tab[i] - tab[j];
            }
            
        }

        int minHour = tabTmp[0];
        for (int x : tabTmp) {
            minHour = Math.min(minHour, x);
        }
        return minHour;
    }

    private static int getHours(List<Integer> value) {
        int max = value.get(0);
        int x = 0;

        for (int var : value) {
            x += max - var;
        }
        return x;
    }
}