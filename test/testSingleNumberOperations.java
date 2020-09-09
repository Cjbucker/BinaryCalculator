import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testSingleNumberOperations {


    @Test
    public void testSquare(){
        assertEquals("1", SingleNumberOperations.getSquare("1"));
        assertEquals("100", SingleNumberOperations.getSquare("10"));
        assertEquals("1001", SingleNumberOperations.getSquare("11"));
        assertEquals("0", SingleNumberOperations.getSquare("0"));
        assertEquals("100000000000000000000", SingleNumberOperations.getSquare("10000000000"));
        assertEquals("1000000000000000000", SingleNumberOperations.getSquare("1000000000"));
    }

    @Test
    public void testSquareRoot(){
        assertEquals("1", SingleNumberOperations.getSquareRoot("1"));
        assertEquals("10", SingleNumberOperations.getSquareRoot("100"));
        assertEquals("11", SingleNumberOperations.getSquareRoot("1001"));
        assertEquals("0", SingleNumberOperations.getSquareRoot("0"));
        assertEquals("10", SingleNumberOperations.getSquareRoot("100"));
        assertEquals("100000", SingleNumberOperations.getSquareRoot("10000000000"));
        assertEquals("1000000000", SingleNumberOperations.getSquareRoot("1000000000000000000"));
    }
}
