package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClimbingLeadBoard {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // compute the rank
        int rank = 1;
        for (int i = 1; i < ranked.size(); i++) {
            if(ranked.get(i - 1) > ranked.get(i)){
                rank++;
            }

        }

        int j = ranked.size() - 1;
        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < player.size(); i++) {

            while (j >= 0 && player.get(i) >= ranked.get(j)){

                j--;
                if( j < 0 || (ranked.get(j) > ranked.get(j + 1))){
                    rank--;
                }
            }
            r.add(rank + 1);


        }

        return r;
    }

    public static void main(String[] args) {
        List<Integer> r = climbingLeaderboard(List.of(100, 90, 90, 80), List.of(70, 80, 105));
        System.out.println(r);
    }

}
