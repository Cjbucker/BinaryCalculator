public class SingleNumberOperations {

    static Converter numberConverter = new Converter();

    public static String getSquare(String input) {
        int number = Integer.parseInt(numberConverter.toDecimal(input));
        String decimal = Integer.toString((int) Math.pow(number, 2));
        return numberConverter.toBinary(decimal);
    }
    public static String getSquareRoot(String input) {
        System.out.println(input);
        int number = Integer.parseInt(numberConverter.toDecimal(input));
        System.out.println(number);
        String decimal = Integer.toString((int) Math.sqrt(number));
        String binary = numberConverter.toBinary(decimal);
        System.out.println(binary);
        return binary;
    }
}
