package algo;

import java.math.BigInteger;
import java.util.List;

public class HighlightedWord {


    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        int max = -1;
        for(char c : word.toCharArray()){
            max = Math.max(max, h.get(c - 'a'));

        }
        return max * word.length();
    }

    public static int utopianTree(int n) {
        // Write your code here
        int h = 1;
        // summer 1, 0
        int s = 0;
        for (int i = 0; i < n; i++) {
            if(s == 0) {
                h = h * 2;
            }else {
                h++;
            }

            s = (s + 1) % 2;

        }

        return h;

    }

    public static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger f = new BigInteger(String.valueOf(1));


        for (int i = 1; i < n; i++) {

            f = f.multiply(BigInteger.valueOf(i));
        }
        System.out.println(f);

    }
    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here

        return a.stream().filter(e -> e <= 0).count() < k ? "YES" : "NO";

    }





    public static void main(String[] args) {

    }
}
