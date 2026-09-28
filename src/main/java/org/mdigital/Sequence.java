package org.mdigital;


public class Sequence {
    public int sequenceSum(int begin, int end, int step) {

        if (begin > end) {
            return 0;
        }

        int sum = 0;
        for (int i = begin; i <= end; i += step) {
            sum += i;
        }

        return sum;
    }
}



