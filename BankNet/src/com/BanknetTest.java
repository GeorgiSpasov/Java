package com;

public class BanknetTest {

    public static void main(String[] args) {
        CreditOperations testOp = new CreditOperations();
        testOp.banks.setCredit(0, 0, 88);
        testOp.banks.setCredit(0, 2, 125);
        testOp.banks.setCredit(0, 1, 220);
        testOp.banks.setCredit(1, 1, 422);
        testOp.banks.setCredit(1, 0, 190);
        testOp.banks.setCredit(1, 2, 100);
        testOp.banks.setCredit(1, 3, 80);
        testOp.banks.setCredit(2, 2, 444);
        testOp.banks.setCredit(2, 4, 100);
        testOp.banks.setCredit(3, 3, 131);
        testOp.banks.setCredit(3, 2, 200);
        testOp.banks.setCredit(4, 4, 180);
        testOp.banks.setCredit(4, 3, 70);
        testOp.banks.setCredit(4, 1, 201);
      
        System.out.println(testOp.banks.toString());
        System.out.printf("Unsafe banks: %s\n", testOp.banks.findUnsafebanks());
    }
}
