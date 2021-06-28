import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void additionTest() {
        Calculator target = new Calculator();
        int result = target.addition(5,2);
        assertEquals(7, result);
    }

    @Test
    public void soustractionTest() {
        Calculator target = new Calculator();
        int result = target.soustraction(5,2);
        assertEquals(3, result);
    }

    @Test
    public void multiplicationTest() {
        Calculator target = new Calculator();
        int result = target.multiplication(5,2);
        assertEquals(10, result);
    }

    @Test
    public void divisionTest() {
        Calculator target = new Calculator();
        int result = target.division(10,2);
        assertEquals(5, result);
    }
}
