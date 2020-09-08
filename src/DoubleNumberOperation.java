public class DoubleNumberOperation {

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

    public static int add(int valueOne, int valueTwo) {
        return Math.addExact(valueOne, valueTwo);
    }

    public static int subtract(int valueOne, int valueTwo) {
        return Math.subtractExact(valueOne, valueTwo);
    }

}
