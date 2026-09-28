package org.mdigital;

import java.util.Arrays;

public class Main {
    static void main() {
        System.out.println("Morning Fam");

        int[] numbers = {1, 2,3 ,4 ,5};
        int[] copied = numbers; // changing one changes other (they are referenced)

        numbers[3] = 7;
        for (int number :  copied) {
            System.out.println(number);
        }

        BankAccount account = new BankAccount(500); // bankAccount.balance to clone
        BankAccount copiedAccount = account;

        copiedAccount.balance = -100;
        System.out.println("Bank balance: " + account.balance);
        System.out.println("Balance: " + copiedAccount.balance);

        String[] names = {"jane", "lee", "ali"};
        String[] copyNames = names.clone();

        names[1] = "carl";

        System.out.println("Names: " + Arrays.toString(names));
        System.out.println("Copy names: " + Arrays.toString(copyNames));

        Sequence sos = new Sequence();
        System.out.println(sos.sequenceSum(2, 2, 2));  // Output: 2
        System.out.println(sos.sequenceSum(2, 6, 2));  // Output: 12 (2 + 4 + 6)
        System.out.println(sos.sequenceSum(1, 5, 1));  // Output: 15 (1 + 2 + 3 + 4 + 5)
        System.out.println(sos.sequenceSum(1, 5, 3));  // Output: 5 (1 + 4)
        System.out.println(sos.sequenceSum(5, 1, 2));  // Output: 0 (begin > end)

    }
}