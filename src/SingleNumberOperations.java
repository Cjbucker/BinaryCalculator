public class SingleNumberOperations {
    public static String getSquare(int number) {
        number = (int) Math.pow(number, 2);
        return String.valueOf(number);
    }
    public static String getSquareRoot(int number) {
//        Make number positive to handle square root with integers without handling unreal
        number = Math.abs(number);
        number = (int) Math.sqrt(number);
        return String.valueOf(number);
    }
}
