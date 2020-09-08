import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDoubleNumberOperation {
    @Test
    public void testAddition(){
        assertEquals(108, DoubleNumberOperation.add(6,102));
    }

    @Test
    public void testSubtraction(){
        assertEquals(39, DoubleNumberOperation.subtract(52,13));
    }

    @Test
    public void testMultiplication(){
        assertEquals(90, DoubleNumberOperation.multiply(15,6));
    }

    @Test
    public void testDivideInteger(){
        assertEquals(5, DoubleNumberOperation.divide(30,6));
    }

    @Test
    public void testDivideDouble(){
        assertEquals(5, DoubleNumberOperation.divide(32,6));
    }

    @Test
    public void testDivideZero(){
        assertEquals(0, DoubleNumberOperation.divide(52,0));
    }
}