package logic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class Vowels1CountComparator implements Comparator<String> {

    Function<String, Integer> getCount = new Function<String, Integer>() {
        private Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'u', 'i', 'o', 'y'));

        @Override
        public Integer apply(String s) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                count += set.contains(s.charAt(i)) ? 1 : 0;
            }
            return count;
        }
    };

    @Override
    public int compare(String o1, String o2) {
        double firstNumber = (double) getCount.apply(o1) / o1.length();
        double secondNumber = (double) getCount.apply(o2) / o2.length();
        return Double.compare(firstNumber, secondNumber);
    }
}
