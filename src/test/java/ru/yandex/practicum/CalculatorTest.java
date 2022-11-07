package ru.yandex.practicum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculatorTest {
    Calculator calculator = new Calculator();

    private final int firstNumber;
    private final int secondNumber;
    private final int expected;

    public CalculatorTest(int firstNumber, int secondNumber, int expected) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: {0} + {1} = {2}")
    public static Object[][] getSumData() {
        return new Object[][] {
                {1, 9, 10},
                {1, 0, 1},
                {2, 5, 7},
                {-1, 2, 1},
                {435, 100, 535}
        };
    }


    @Test
    public void shouldBeSum(){
        int actual = calculator.sum(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }
}
