import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        String message = " ";
        try {
            message = reader.readLine();
        } catch (IOException ignored){

        }
        return message;
    }

    public static String askCurrencyCode() {
        String currencyCode;
        writeMessage("Please, write currency code(EUR, USD, RUB etc.)");
        currencyCode = readString();
        if (currencyCode.length() == 3) {
            return currencyCode.toUpperCase();
        } else {
            writeMessage("Invalid code");
            askCurrencyCode();
        }
        return currencyCode.toUpperCase();
    }

    public static String[] getValidTwoDigits(String currencyCode) {
        String [] array;
        while(true) {
            writeMessage("Please, write denomination after put spacebar and write number of currencies (ex. 200 1200)");
            int denomination;
            int count;
            String value = readString();
            array = value.split(" ");
            try {
                denomination = Integer.parseInt(array[0]);
                count = Integer.parseInt(array[1]);
            } catch (Exception e) {
                writeMessage("This data is incorrect");
                continue;
            }
            if (denomination <= 0 || count <= 0 || array.length > 2){
                writeMessage("This data is incorrect");
                continue;
            }
            break;
        }
        return array;
    }
}
