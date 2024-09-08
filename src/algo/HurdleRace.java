package algo;

import java.util.*;

public class HurdleRace {

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        Collections.sort(height);

        int max = height.get(height.size() - 1);

        return max < k ? 0 : (max - k);

    }

    public static void main(String[] args) {
        System.out.println(hurdleRace(1, Arrays.asList(1, 2, 3, 3)));
    }
}
