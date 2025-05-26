package com.example.tests;

public class NumberChecker {

    public int checkNumber(int number) {
        if (number <= 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        } else if (number < 5) {
            return 5;
        } else {
            throw new IllegalStateException("bad number!");
        }
    }

}
