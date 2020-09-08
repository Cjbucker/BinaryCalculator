import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testSingleNumberOperations {


    @Test
    public void testSquare(){
        assertEquals("1", SingleNumberOperations.getSquare(1));
        assertEquals("4", SingleNumberOperations.getSquare(2));
        assertEquals("9", SingleNumberOperations.getSquare(3));
        assertEquals("16", SingleNumberOperations.getSquare(4));
        assertEquals("0", SingleNumberOperations.getSquare(0));
        assertEquals("4", SingleNumberOperations.getSquare(-2));
        assertEquals("1048576", SingleNumberOperations.getSquare(1024));
        assertEquals("256", SingleNumberOperations.getSquare(16));
        assertEquals("25", SingleNumberOperations.getSquare(5));
        assertEquals("625", SingleNumberOperations.getSquare(25));
        assertEquals("1048576", SingleNumberOperations.getSquare(-1024));
        assertEquals("262144", SingleNumberOperations.getSquare(512));
    }

    @Test
    public void testSquareRoot(){
        assertEquals("1", SingleNumberOperations.getSquareRoot(1));
        assertEquals("2", SingleNumberOperations.getSquareRoot(4));
        assertEquals("3", SingleNumberOperations.getSquareRoot(9));
        assertEquals("4", SingleNumberOperations.getSquareRoot(16));
        assertEquals("0", SingleNumberOperations.getSquareRoot(0));
        assertEquals("2", SingleNumberOperations.getSquareRoot(4));
        assertEquals("1024", SingleNumberOperations.getSquareRoot(1048576));
        assertEquals("16", SingleNumberOperations.getSquareRoot(256));
        assertEquals("5", SingleNumberOperations.getSquareRoot(25));
        assertEquals("25", SingleNumberOperations.getSquareRoot(625));
        assertEquals("1024", SingleNumberOperations.getSquareRoot(-1048576));
        assertEquals("512", SingleNumberOperations.getSquareRoot(262144));
    }
}
