import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testSingleNumberOperations {


    @Test
    public void testBasicSquare(){
        assertEquals(4, SingleNumberOperations.getSquare(2));
    }

    @Test
    public void testBasicSquareRoot(){
        assertEquals(2, SingleNumberOperations.getSquareRoot(4));
    }
}
