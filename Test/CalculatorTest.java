import TDD.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculatorTest {


    @Test
    void testForAdditionOfTwoNumbers() {
        Calculator calculate = new Calculator();
        int output = 10;
        assertEquals(10, calculate.additionOfTwoNumbers(3, 7));

    }

    @Test
    void testForSubtractionOfTwoNumbers() {
        Calculator calculate = new Calculator();
        int output = 10;
        assertEquals(10, calculate.subtractionOfTwoNumbers(20, 10));
    }

    @Test
    void testForMultiplicationOfTwoNumbers() {
        Calculator calculate = new Calculator();
        int output = 20;
        assertEquals(20, calculate.multiplicationOfTwoNumbers(5, 4));
    }

    @Test
    void testForSubtractionOfNegativeNumbers() {
        Calculator calculate = new Calculator();
        int output = 10;
        assertEquals(10, calculate.subtractionOfNegativeNumbers(-10, 20));
    }

    @Test
    void testForDivisionOfTwoNumbers() {
        Calculator calculate = new Calculator();
        int output = 5;
        assertEquals(5, calculate.DivisionOfTwoNumbers(20, 4));
    }

}

