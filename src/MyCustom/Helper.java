package MyCustom;

public class Helper {
    public static int convertStringToInt(String inputString) {
        return Integer.parseInt(inputString.replaceAll(",", "")
                .replaceAll("\u00a0",""));
    }
    public static float convertStringToFloat(String inputString) {
        return Float.parseFloat(inputString.replaceAll(",", "")
                .replaceAll("\u00a0",""));
    }
    public static double convertStringToDouble(String inputString) {
        return Double.parseDouble(inputString.replaceAll(",", "")
                .replaceAll("\u00a0",""));
    }
}
