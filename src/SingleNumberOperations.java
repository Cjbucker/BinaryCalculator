public class SingleNumberOperations {
    public static String getSquare(String number) {
        return String.valueOf((int) Math.pow(Double.parseDouble(number), 2));
    }
    public static String getSquareRoot(String number) {
//        Make number positive to handle square root with integers without handling unreal
        return String.valueOf((int) Math.sqrt(Double.parseDouble(number)));
    }
}
