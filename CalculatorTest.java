import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    
    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-1, 1));
    }
    
    @Test
    void testSubtraction() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-2, calculator.subtract(1, 3));
    }
}