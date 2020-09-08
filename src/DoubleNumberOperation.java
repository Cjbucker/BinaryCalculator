public class DoubleNumberOperation {

    static Converter numberConverter;

    public DoubleNumberOperation(){
        numberConverter = new Converter();
    }

    public static int multiply(int valueOne, int valueTwo) {
        return Math.multiplyExact(valueOne, valueTwo);
    }

    public static int divide(int valueOne, int valueTwo) {
        try {
            return Math.floorDiv(valueOne, valueTwo);
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    public static String add(String strValueOne, String strValueTwo) {
        int valueOne = Integer.parseInt(numberConverter.toDecimal(strValueOne));
        int valueTwo = Integer.parseInt(numberConverter.toDecimal(strValueTwo));
        String decimal = Integer.toString(Math.addExact(valueOne, valueTwo));
        return numberConverter.toBinary(decimal);
    }

    public static int subtract(int valueOne, int valueTwo) {
        return Math.subtractExact(valueOne, valueTwo);
    }

}
