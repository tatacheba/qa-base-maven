import org.dmitryyarygin.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class CalculatorTests {
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
    }
    @Test
    void testMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiplication(3, 2), "3 * 2 should equal 6");
    }
    @Test
    void testDivision() {
        Calculator calculator = new Calculator();
        assertEquals(1.5, calculator .division(3, 2), "3 / 2 should equal 1.5");
    }
    @Test
    void divisionByZeroTest() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> {
            calculator.division(3, 0);
        }, "Division by zero should throw ArithmeticException");
    }
}
