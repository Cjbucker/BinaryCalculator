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
        return convertDecimalToBinaryString(decimal);
    }

    private String convertDecimalToBinaryString(int decimal) {
        String binaryString;
        if (decimal >= 0){
            binaryString = Integer.toBinaryString(decimal);
        }
        else{
            decimal = Math.abs(decimal);
            binaryString = "-" + Integer.toBinaryString(decimal);
        }
        return binaryString;
    }

}
