import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testSingleNumberOperations {


    @Test
    public void testSquare(){
        assertEquals("1", SingleNumberOperations.getSquare("1"));
        assertEquals("4", SingleNumberOperations.getSquare("2"));
        assertEquals("9", SingleNumberOperations.getSquare("3"));
        assertEquals("0", SingleNumberOperations.getSquare("0"));
        assertEquals("4", SingleNumberOperations.getSquare("-2"));
        assertEquals("1048576", SingleNumberOperations.getSquare("1024"));
        assertEquals("1048576", SingleNumberOperations.getSquare("-1024"));
        assertEquals("262144", SingleNumberOperations.getSquare("512"));
    }

    @Test
    public void testSquareRoot(){
        assertEquals("1", SingleNumberOperations.getSquareRoot("1"));
        assertEquals("2", SingleNumberOperations.getSquareRoot("4"));
        assertEquals("3", SingleNumberOperations.getSquareRoot("9"));
        assertEquals("0", SingleNumberOperations.getSquareRoot("0"));
        assertEquals("2", SingleNumberOperations.getSquareRoot("4"));
        assertEquals("1024", SingleNumberOperations.getSquareRoot("1048576"));
        assertEquals("1024", SingleNumberOperations.getSquareRoot("-1048576"));
        assertEquals("512", SingleNumberOperations.getSquareRoot("262144"));
    }
}
