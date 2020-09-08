public class DoubleNumberOperation {

    static Converter numberConverter = new Converter();

    public static String multiply(String strValueOne, String strValueTwo) {
        int valueOne = Integer.parseInt(numberConverter.toDecimal(strValueOne));
        int valueTwo = Integer.parseInt(numberConverter.toDecimal(strValueTwo));
        String decimal = Integer.toString(Math.multiplyExact(valueOne, valueTwo));
        return numberConverter.toBinary(decimal);
    }

    public static String divide(String strValueOne, String strValueTwo) {
        int valueOne = Integer.parseInt(numberConverter.toDecimal(strValueOne));
        int valueTwo = Integer.parseInt(numberConverter.toDecimal(strValueTwo));
        try {
            String decimal = Integer.toString(Math.floorDiv(valueOne, valueTwo));
            return numberConverter.toBinary(decimal);
        } catch (ArithmeticException e) {
            return "0";
        }
    }

    public static String add(String strValueOne, String strValueTwo) {
        int valueOne = Integer.parseInt(numberConverter.toDecimal(strValueOne));
        int valueTwo = Integer.parseInt(numberConverter.toDecimal(strValueTwo));
        String decimal = Integer.toString(Math.addExact(valueOne, valueTwo));
        return numberConverter.toBinary(decimal);
    }

    public static String subtract(String strValueOne, String strValueTwo) {
        int valueOne = Integer.parseInt(numberConverter.toDecimal(strValueOne));
        int valueTwo = Integer.parseInt(numberConverter.toDecimal(strValueTwo));
        String decimal = Integer.toString(Math.subtractExact(valueOne, valueTwo));
        return numberConverter.toBinary(decimal);
    }

}