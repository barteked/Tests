package com.example.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTest {

    @Test
    public void shouldReturn5WhenNumberIs1() {
        // given
        NumberChecker numberChecker = new NumberChecker();
        int number = 1;

        // when
        int actual = numberChecker.checkNumber(number);

        // then
        Assertions.assertEquals(5, actual);
    }

    @Test
    public void shouldReturn5WhenNumberIs2() {
        // given
        NumberChecker numberChecker = new NumberChecker();
        int number = 2;

        // when
        int actual = numberChecker.checkNumber(number);

        // then
        Assertions.assertEquals(5, actual);
    }

    @Test
    public void shouldReturn5WhenNumberIs3() {
        // given
        NumberChecker numberChecker = new NumberChecker();
        int number = 3;

        // when
        int actual = numberChecker.checkNumber(number);

        // then
        Assertions.assertEquals(5, actual);
    }

    @Test
    public void shouldReturn5WhenNumberIs4() {
        // given
        NumberChecker numberChecker = new NumberChecker();
        int number = 4;

        // when
        int actual = numberChecker.checkNumber(number);

        // then
        Assertions.assertEquals(5, actual);
    }

    //Quiz 5 solved task
    @Test
    public void shouldThrowExceptionWhenNumberIs() {
        // given
        NumberChecker numberChecker = new NumberChecker();
        int number = 5;

        // when then
        Assertions.assertThrows(IllegalStateException.class, () ->
                numberChecker.checkNumber(number)
        );
    }
}