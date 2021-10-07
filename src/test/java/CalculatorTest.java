import calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    public Calculator calculator = new Calculator("Casio");

    @Test
    public void addTest() {
        assertEquals("Sum of two numbers are not correct",30.8,calculator.add(20.4, 10.4),0);

    }

    @Test
    public void subtractTest() {
        assertEquals("Subtr of two numbers are not correct",5.5,calculator.subtract(15.6, 10.1),0);

    }

    @Test
    public void multiplyTest() {
        assertEquals("Multi of two numbers are not correct",6.6,calculator.multiply(2.2, 3),0);

    }
    @Test
    public void divideTest() {
        assertEquals("Divide of two numbers are not correct",15,calculator.divide(45, 3),0);

    }
}
