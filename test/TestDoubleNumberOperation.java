import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDoubleNumberOperation {
    @Test
    public void testAddition(){
        assertEquals("1011", DoubleNumberOperation.add("1001","10"));
    }

    @Test
    public void testSubtraction(){
        assertEquals("100", DoubleNumberOperation.subtract("1110","1010"));
    }

    @Test
    public void testSubtractionToNegative(){
        assertEquals("-110", DoubleNumberOperation.subtract("10","1000"));
    }

    @Test
    public void testMultiplication(){
        assertEquals("111111010", DoubleNumberOperation.multiply("10110","10111"));
    }

    @Test
    public void testDivideInteger(){
        assertEquals("10110", DoubleNumberOperation.divide("111111010","10111"));
    }

    @Test
    public void testDivideDouble(){
        assertEquals("10101000", DoubleNumberOperation.divide("111111010","11"));
    }

    @Test
    public void testDivideZero(){
        assertEquals("0", DoubleNumberOperation.divide("10110","0"));
    }
}