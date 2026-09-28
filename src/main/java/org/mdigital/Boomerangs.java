package org.mdigital;

public class Boomerangs {

    public static int boomerang(int[] number) {
        int count = 0;

        for (int i = 0; i < number.length - 2; i++) {
            int first = number[i];
            int middle = number[i + 1];
            int last = number[i + 2];

            if (first == last && first != middle) {
                count++;
            }
        }

        return count;
    }

    public static void main() {
        int[] input = {3, 7, 3, 2, 1, 5, 1, 2, 2, -2, 2};
        int total = boomerang(input);

        System.out.println("Total boomerangs: " + total);
    }
}
