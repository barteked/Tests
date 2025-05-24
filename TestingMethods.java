import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingMethods {

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
}
