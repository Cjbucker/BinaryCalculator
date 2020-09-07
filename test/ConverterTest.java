import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ConverterTest {

    @Test
    void toDecimal_Success() {
        Converter converter = new Converter();
        String binaryString = "111";
        String decimalString = converter.toDecimal(binaryString);
        assertEquals("7", decimalString);
    }

    @Test
    void toBinary_Success() {
        Converter converter = new Converter();
        String decimalString = "7";
        String binaryString = converter.toBinary(decimalString);
        assertEquals("111", binaryString);
    }

}