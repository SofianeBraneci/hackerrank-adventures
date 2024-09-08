package algo;

import java.util.*;

public class QueenMoves {

    public static List<List<Integer>> directions(int x, int y, int n){
        int [] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
        int [] dy = {0, 1, 1, 1, 0, -1, -1, -1};
        List<List<Integer>> m = new ArrayList<>();
        int xx, yy;
        for (int i = 0; i < dx.length; i++) {
            xx = x + dx[i];
            yy = y + dy[i];
            if ( xx > n || yy > n || xx < 0 || yy < 0) continue;
            m.add(List.of(dx[i] , dy[i]));
        }

        return m;
    }

    public static int dist(int x, int y, int r_q, int c_q){
        return Math.abs((x - r_q) + (y - c_q));
    }
    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        // Write your code here
        if (n == 0) return 0;
        Set<String> m = new HashSet<>();
        for(List<Integer> o : obstacles){
            m.add(o.get(0) + "-" + o.get(1));
        }
        List<List<Integer>> queenMoves = directions(r_q, c_q, n);
        int total = 0;
        int dx, dy;
        for(List<Integer> move : queenMoves){
            dx = r_q + move.get(0);
            dy = c_q + move.get(1);
            while(1 <= dx && dx <= n && 1 <= dy && dy <= n && !m.contains(dx + "-" +dy)){
                dx += move.get(0);
                dy += move.get(1);
                ++total;
            }

        }
        return total;

    }

    public static void main(String[] args) {
        System.out.println(directions(4, 4, 4));
        System.out.println(queensAttack(4, 0, 4, 4, List.of()));
    }
}
