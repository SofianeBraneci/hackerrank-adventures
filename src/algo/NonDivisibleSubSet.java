package algo;

import java.util.List;

public class NonDivisibleSubSet {

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Trick is using modulo
        int [] counter  = new int[k];

        // counting all the reminders
        for(int i : s){
            counter[i % k] += 1;
        }
        // case one: the subset can only have at most one 0

        int length = Math.min(1, counter[0]);

        // if k is even, we can take only one k/2 in the subset
        if(k % 2 == 0) {
            length += Math.min(counter[k / 2], 1);
        }

        for (int i = 1; i <= k / 2; i++) {
            // not counting the case when i = k/2
            if(i != k - i) {
                length += Math.max(counter[i],counter[k - i]);
            }
        }
        return length;

    }

    public static void main(String[] args) {
        System.out.println(nonDivisibleSubset(6, List.of(12 ,6 ,1, 9, 13, 15, 10, 21, 14, 32, 5, 8, 23, 19)));
    }


}
