public class Converter {

    public Converter(){
    }

    public String toDecimal(String binaryNumber) {
        int decimal= Integer.parseInt(binaryNumber, 2);
        String decimalString = Integer.toString(decimal);
        return decimalString;
    }

    public String toBinary(String decimalNumber) {
        int decimal = Integer.parseInt(decimalNumber);
        String binaryString = Integer.toBinaryString(decimal);
        return binaryString;
    }

}
